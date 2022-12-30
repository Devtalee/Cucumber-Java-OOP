package Elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class element {

    public element(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "tz-dropdown")
    WebElement marka; //A01 click

    @FindBy(className = "tz-dropdown__search")
    WebElement input; //A02 sendKeys: Abarth

    @FindBy(className = "tz-dropdown__list")
    WebElement select; //A03 select Abarth from drop

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[1]/div[2]/div")
    WebElement model_click; //A04 click model selection

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[1]/div[2]/div/div[1]/input")
    WebElement input_595; //A05 sendKeys: 595

    @FindBy(xpath = "//label[@for='q_model_3367']/span")
    WebElement click_595; //A06 click 595 from drop

    @FindBy(id = "new_q")
    WebElement form; //A07 click free area

    @FindBy(id = "q_price_from")
    WebElement from_price; //A08 from price

    @FindBy(id = "q_price_to")
    WebElement to_price; //A09 to price

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[2]/div[2]/div[3]")
    WebElement barter; //A10 click Barter button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[1]/div[3]/div/label[3]")
    WebElement used; //A11 click Used cars button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[4]/div[2]/div[2]")
    WebElement details; //A12 click Open other details drop button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[1]/div[8]/div/label[3]")
    WebElement personal; //A13 click Personal car button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[1]/div[12]/label")
    WebElement crashed; //A14 click crashed cars button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[1]/label")
    WebElement wheel; //A15 click wheels button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[2]/label")
    WebElement ABS; //A16 click ABS button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[3]/label")
    WebElement hatch; //A17 click hatch button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[4]/label")
    WebElement rain; //A18 click rain button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[5]/label")
    WebElement lock; //A19 click central lock button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[6]/label")
    WebElement park; //A20 click park button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[7]/label")
    WebElement cond; //A21 click conditioner button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[8]/label")
    WebElement heater; //A22 click seat heater button

    @FindBy(xpath = "//*[@id=\"new_q\"]/div/div[3]/div[2]/span[9]/label")
    WebElement leather; //A23 click leather button

    @FindBy(name = "commit")
    WebElement commit; //A24 click Commit button

    public void A01() {
        marka.click();
    }

    public void A02() {
        input.sendKeys("Abarth");
    }

    public void A03() {
        select.click();
    }

    public void A04() {
        model_click.click();
    }

    public void A05() {
        input_595.sendKeys("595");
    }

    public void A06() {
        click_595.click();
    }

    public void A07() {
        form.click();
    }

    public void A08() {
        from_price.sendKeys("15000");
    }

    public void A09(){
        to_price.sendKeys("29000");
    }

    public void A10(){
        barter.click();
    }

    public void A11(){
        used.click();
    }

    public void A12(){
        details.click();
    }

    public void A13(){
        personal.click();
    }

    public void A14(){
        crashed.click();
    }

    public void A15(){
        wheel.click();
    }

    public void A16(){
        ABS.click();
    }

    public void A17(){
        hatch.click();
    }

    public void A18(){
        rain.click();
    }

    public void A19(){
        lock.click();
    }

    public void A20(){
        park.click();
    }

    public void A21(){
        cond.click();
    }

    public void A22(){
        heater.click();
    }

    public void A23(){
        leather.click();
    }

    public void A24(){
        commit.sendKeys(Keys.ENTER);
    }
}