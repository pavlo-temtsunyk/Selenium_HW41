package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class KatalonFormPage {

    @FindBy(id = "first-name")
    private WebElement firstNameInput;


    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "comment")
    private WebElement commentinput;


    @FindBy(id = "submit")
    private WebElement submitFormBtn;

    @FindBy(id = "dob")
    private WebElement dob;

    @FindBy(id = "role")
    private Select roleDropdown;

    @FindBys(@FindBy(name = "gender"))
    private List<WebElement> genderselect;

    @FindBys(@FindBy(id = "role"))
    private List<WebElement> roledropdown;


    @FindBy(id = "address")
    private WebElement address;

    @FindBy(name = "email")
    private WebElement emailinput;

    @FindBy(id = "password")
    private WebElement passwordinput;

    @FindBy(id = "company")
    private WebElement companyinput;

    @FindBys(@FindBy(css = ".development-ways input[type=checkbox]"))
    private List<WebElement> waysOfDevelopment;

    @FindBy(id ="expectation")
    private WebElement expectation;



    public void selectThreeRandomWaysOfDevelopment(){
        Random random = new Random();
        HashSet<Integer> set = new HashSet<Integer>(3);
        while (set.size() < 3) {
            set.add(random.nextInt(waysOfDevelopment.size()));
        }
        System.out.println(set);
        for(int i : set) {
            waysOfDevelopment.get(i).click();
        }
    }

    public void submitForm()  {
        submitFormBtn.click();

    }

    public void setFirstName(String firstName){
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }

    public void setLastName(String lastname){
        lastNameInput.clear();
        lastNameInput.sendKeys(lastname);
    }

    public void setdob(String date){
        dob.click();
        dob.clear();
        dob.sendKeys(date);
    }


    public void setGender(int gender){
        genderselect.get(gender).click();
    }

    public void setAddress(String addressparam){
        address.clear();
        address.sendKeys(addressparam);


    }


    public void setEmail(String email){
        emailinput.clear();
        emailinput.sendKeys(email);
    }

    public void setPassword(String pass){
        passwordinput.clear();
        passwordinput.sendKeys(pass);
    }

    public void setCompany(String com){
        companyinput.clear();
        companyinput.sendKeys(com);
    }

    public void setRole(int role){
        roledropdown.get(role).click();
    }

    public void setExpectation(String exp){
        Select expectationSelect = new Select(expectation);
        expectationSelect.selectByVisibleText(exp);

    }

    public void setcomment(String comment){
        commentinput.clear();
        commentinput.sendKeys(comment);
    }


    public KatalonFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }



}