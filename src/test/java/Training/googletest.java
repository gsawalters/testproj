package Training;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class googletest {

    //my first test using power of selenide
    @Test
    public void usercanopengoogle() {
    open("http://google.com");
    $(By.name("q")).setValue("testing").pressEnter();
    }
}