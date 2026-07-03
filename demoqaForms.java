package net.example.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoqaForms {
    private WebDriver driver;
// Locators
    private By fullNameInput = By.id("userName");
    private By formsButton = By.xpath("//span[text()='Check Box']");
    private By PracticeForm = By.xpath("//span[text()='Text Box']");
// Name fields
private By firstNameInput = By.id("firstName");
private By lastNameInput = By.id("lastName");

// Email
private By emailInput = By.id("userEmail");

// Gender radio buttons
private By genderMaleRadio = By.xpath("//label[text()='Male']");
private By genderFemaleRadio = By.xpath("//label[text()='Female']");
private By genderOtherRadio = By.xpath("//label[text()='Other']");

// Mobile number
private By mobileInput = By.id("userNumber");

// Date of Birth
private By dateOfBirthInput = By.id("dateOfBirthInput");

// Subjects
private By subjectsInput = By.id("subjectsInput");

// Hobbies checkboxes
private By hobbiesSportsCheckbox = By.xpath("//label[text()='Sports']");
private By hobbiesReadingCheckbox = By.xpath("//label[text()='Reading']");
private By hobbiesMusicCheckbox = By.xpath("//label[text()='Music']");

// Picture upload
private By uploadPictureButton = By.id("uploadPicture");

// Current Address
private By currentAddressTextarea = By.id("currentAddress");

// State and City dropdowns
private By stateDropdown = By.id("state");
private By cityDropdown = By.id("city");

// Submit button
private By submitButton = By.id("submit");

 public demoqaForms(WebDriver driver) {
        this.driver = driver;
    }

   
    // Actions

// Name fields
public void enterFirstName(String firstName) {
    driver.findElement(firstNameInput).sendKeys(firstName);
}

public void enterLastName(String lastName) {
    driver.findElement(lastNameInput).sendKeys(lastName);
}

// Email


// Gender radio buttons
public void selectGenderMale() {
    driver.findElement(genderMaleRadio).click();
}

public void selectGenderFemale() {
    driver.findElement(genderFemaleRadio).click();
}

public void selectGenderOther() {
    driver.findElement(genderOtherRadio).click();
}

// Mobile number
public void enterMobileNumber(String mobile) {
    driver.findElement(mobileInput).sendKeys(mobile);
}

// Date of Birth
public void enterDateOfBirth(String dob) {
    driver.findElement(dateOfBirthInput).sendKeys(dob);
}

// Subjects
public void enterSubject(String subject) {
    driver.findElement(subjectsInput).sendKeys(subject);
}

// Hobbies checkboxes
public void selectHobbySports() {
    driver.findElement(hobbiesSportsCheckbox).click();
}

public void selectHobbyReading() {
    driver.findElement(hobbiesReadingCheckbox).click();
}

public void selectHobbyMusic() {
    driver.findElement(hobbiesMusicCheckbox).click();
}

// Picture upload
public void uploadPicture(String filePath) {
    driver.findElement(uploadPictureButton).sendKeys(filePath);
}

// Current Address
public void enterCurrentAddress(String address) {
    driver.findElement(currentAddressTextarea).sendKeys(address);
}

// State and City dropdowns
public void selectState(String state) {
    driver.findElement(stateDropdown).sendKeys(state);
}

public void selectCity(String city) {
    driver.findElement(cityDropdown).sendKeys(city);
}

// Submit button








































//old code
    public void enterFullName(String name) {
        driver.findElement(fullNameInput).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public void clickFormsButton() {
        driver.findElement(formsButton).click();
    }
    public void clickPracticeform(){
        driver.findElement(PracticeForm).click();
    }

}
