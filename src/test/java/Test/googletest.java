package Test;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class googletest {

    //my first test
    @Test
    public void usercanopengoogle() {
    open("http://google.com");
    }
}