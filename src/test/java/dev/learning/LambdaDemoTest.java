package dev.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LambdaDemoTest {

    @Test
    public void shouldReturnHelloMessage(){
        var lambda = new LambdaDemo();
        Assertions.assertEquals("Hello Ravi Lambda!!", lambda.handleRequest("Ravi"));
    }
}
