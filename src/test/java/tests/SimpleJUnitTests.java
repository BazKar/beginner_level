package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("simple")
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
