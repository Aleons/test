package page;

import io.qameta.allure.Step;
import widget.Button;

import static utils.Locators.MainPage.*;

public class MainPage {

    Button internetBank = new Button(buttonInternetBank);
    Button close = new Button(buttonPopupClose);

    @Step("Click on the button <<INTERNET BUNK>>")
    public MainPage clickBtnInternetBank(){
        internetBank.clickButton();
        return  this;
    }

    @Step("Check the presence of a button to close the popup")
    public MainPage checkPresenceBtnForClocePopup(){
        close.checkIsExists();
        return this;
    }

}
