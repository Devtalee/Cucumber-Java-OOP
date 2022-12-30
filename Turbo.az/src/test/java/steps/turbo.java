package steps;

import Drivers.Driver;
import Elements.element;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class turbo {

    protected WebDriver chr = Driver.getDriver();
    element sss = new element(chr);

    @Given("Go to turbo")
    public void M01(){
        chr.get("https://turbo.az");
    }

    @When("Click to marka")
    public void marka() {
        sss.A01();
    }

    @Then("Input text Abarth")
    public void M03(){
        sss.A02();
    }
    @And("Click Abarth")
    public void M04(){
        sss.A03();
    }
    @And("Input 595")
    public void aa() throws InterruptedException {
        sss.A04();
        sss.A05();
        Thread.sleep(2000);
        sss.A06();
        sss.A07();
        Thread.sleep(2000);
    }
    @And("Price range")
    public void M05(){
        sss.A08();
        sss.A09();
    }
    @And("Click Barter")
    public void M06() throws InterruptedException {
        sss.A10();
    }
    @And("Click Used")
        public void U7() throws InterruptedException {
        sss.A11();
    }
    @And("Open details")
    public void M07() throws InterruptedException {
        sss.A12();
    }
    @And("Click Personal")
    public void M08() {
        sss.A13();
    }
    @And("Click not crashed")
    public void M09() throws InterruptedException {
        sss.A14();
    }
    @And("CLick wheel")
    public void h1() throws InterruptedException {
        sss.A15();
    }
    @And("CLick ABS")
    public void h2() throws InterruptedException {
        sss.A16();
    }
    @And("Click hatch")
    public void h3() throws InterruptedException {
        sss.A17();
    }
    @And("Click rain")
    public void h4() throws InterruptedException {
        sss.A18();
    }
    @And("CLick lock")
    public void h5() throws InterruptedException {
        sss.A19();
    }
    @And("Click park")
    public void h6() throws InterruptedException {
        sss.A20();
    }
    @And("Click cond")
    public void h7(){
        sss.A21();
    }
    @And("Click seat heater")
    public void h9(){
        sss.A22();
    }
    @And("Click leather")
    public void h8() {
        sss.A23();
    }
    @Then("Click Enter")
    public void M11() {
        sss.A24();
    }
}