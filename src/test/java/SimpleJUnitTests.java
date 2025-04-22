import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTests {

    @Test
    void fisrtTest(){
        System.out.println("###  firstTest()");
        Assertions.assertTrue(3>2);
    }
    @Test
    void secondTest(){
        System.out.println("###  secondTest()");
        Assertions.assertTrue(3>2);
    }
    @Test
    void thirdTest(){
        System.out.println("###  thirdTest()");
        Assertions.assertTrue(3>2);
    }
}
