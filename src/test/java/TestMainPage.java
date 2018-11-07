import org.testng.annotations.Test;
import page.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class TestMainPage {

    @Test(description = "After clicking on the button \"INTERNET BANK\" popup appears")
    void appearingPopupAfterClickingBtn(){

        //Arrange
            open("https://www.bankorange.ru/");
        //Act
            new MainPage().clickBtnInternetBank()
        //Assert
            .checkPresenceBtnForClocePopup();

    }

}
