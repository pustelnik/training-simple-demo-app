package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoolTests {

    @Test
    public void test1() {
        var value = 5;
        Assertions.assertEquals(5, value);
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Testing...");
    }

    @Test
    public void test3() {
        System.out.println("demo.CoolTests.test3");
    }
}
