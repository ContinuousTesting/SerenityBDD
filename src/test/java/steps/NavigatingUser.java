package steps;

import model.Category;
import net.serenitybdd.CISerenity.ui.CategoryNavigationBar;
import net.serenitybdd.CISerenity.ui.CurrentPage;
import net.serenitybdd.CISerenity.ui.PetClinicHomePage;
import net.thucydides.core.annotations.Step;

public class NavigatingUser {

	PetClinicHomePage petclinicHomePage;
	CurrentPage currentPage;
	CategoryNavigationBar categoryNavigationBar;
	@Step
	public void isOnTheHomePage() {
	 petclinicHomePage.open();
		
	}
	@Step
	public void shouldSeeThePageTitleContaining(String expectedTitle) {
	
		
		if(currentPage.getTitle().contains(expectedTitle)){
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Title is not Verified");
		}
		
	}
	
	@Step
	public void navigatesToVeterinariansCategory() {
		
		categoryNavigationBar.selectCategory();
		
	}
}
