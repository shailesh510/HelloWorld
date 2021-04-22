package StepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Excel1DataDrivenSteps {
	String EmpName;
	int EmpSalary;
	boolean greater;

	@Given("user has Data of Emp {int}")
	public void user_has_Data_of_Emp(Integer int1) {
		greater = EmpSalary > 300000;
		try {
			FileInputStream fis= new FileInputStream("C:/Users/My Laptop/Desktop/numData.xlsx");
			try {
				XSSFWorkbook book= new XSSFWorkbook(fis);
				XSSFSheet Sheet = book.getSheet("Sheet2");
				Row row = Sheet.getRow(int1);
				EmpName=(String) row.getCell(1).getStringCellValue();
				EmpSalary=(int)  row.getCell(2).getNumericCellValue();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
       
			e.printStackTrace();
		}

	}

	@Then("Manager will get salary Range")
	public void manager_will_get_salary_Range() {
		System.out.println("Employee having Salary:" + greater);
	Assert.assertTrue("salary greater than given range", greater);
	}

}
