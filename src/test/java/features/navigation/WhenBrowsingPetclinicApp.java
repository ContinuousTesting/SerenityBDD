package features.navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import model.Category;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class WhenBrowsingPetclinicApp {

	@Steps
	NavigatingUser mark;

	@Managed(driver = "chrome")
	WebDriver browser;
	
	@Test
	public void shouldBeableToNavigateToPetClinicFindVeterinaranians(){
		//GIven
		mark.isOnTheHomePage();
		//When
		mark.navigatesToVeterinariansCategory();
		//THen
		mark.shouldSeeThePageTitleContaining("PetClinic");	
	}
}
