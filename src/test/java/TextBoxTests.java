import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl="https://demoqa.com";
        Configuration.holdBrowserOpen=true;
    }
    @Test
    void fillFormTest(){
        open("/automation-practice-form");
        $("#firstName").setValue("Alex");
        $("#lastName").setValue("who");
        $("#userEmail").setValue("alex@egorov.com");
        $("label[for='gender-radio-1']").click();
        $("#userNumber").setValue("1234567808");
        $("#subjectsInput").setValue("informatica");
        $("#currentAddress").setValue("some address");
        $("#submit").click();


    }
}
