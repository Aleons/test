package widget;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button {

    SelenideElement button;

    public Button(By locator) {
        button = $(locator);
    }

    public void clickButton(){
        button.click();
    }

    public void checkIsExists(){
        button.exists();
    }
}
