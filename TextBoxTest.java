package net.example;

import net.example.base.BaseTest;
import net.example.actions.demoqaForms;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    @Test
    public void testTextBoxAndFormsNavigation() {
        demoqaForms page = new demoqaForms(driver);
       // page.enterFullName("Ashlesha Test");
      //page.enterEmail("ashlesha@example.com");
      //  page.clickSubmit();
        // page.clickFormsButton();
        //page.clickPracticeform();
        // Call all action methods step by step
        page.enterFirstName("Ashlesha");
        page.enterLastName("Test");
        page.enterEmail("ashlesha@example.com");

        page.selectGenderFemale();
        page.enterMobileNumber("9876543210");
        page.enterDateOfBirth("26 Jun 2026");

        page.enterSubject("Maths");
        page.selectHobbySports();
        page.selectHobbyReading();

      //  page.uploadPicture("C:\\Users\\Ashlesha\\Pictures\\test.JPG");
        page.enterCurrentAddress("Pune, Maharashtra");

        page.selectState("NCR");
        page.selectCity("Delhi");

        // Finally submit the form
        page.clickSubmit();

    }
}
