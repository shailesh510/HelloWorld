package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features ={"src/main/resources/Feature"},
					glue ={"StepDefinations"},
					tags={"@Smoke or @Nutan"},
					strict=true,
					monochrome=true,
					dryRun=false)
	public class SuitRunner{

}

