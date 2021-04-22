package StepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ExcelDataDrivenSteps {

	int x, y, result;

	@Given("user has {int}")
	public void acceptNumbers(int rowNum) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/My Laptop/Desktop/numData.xlsx");
			try {
				XSSFWorkbook book = new XSSFWorkbook(fis);
				XSSFSheet sheet = book.getSheet("sheet1");
				Row row = sheet.getRow(rowNum);
				x = (int) row.getCell(1).getNumericCellValue();// integer
				y = (int) row.getCell(2).getNumericCellValue();
			} catch (IOException e) {

				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@When("user add two numbers")
	public void addNumbers() {
		result = x + y;
	}

	@Then("verify addition")
	public void checkAdditionIsEven() {
		int rem = result % 2;
		System.out.println("Addition of " + x + " and " + y + ": " + result);
		Assert.assertTrue("even no", rem == 0);
	}
}