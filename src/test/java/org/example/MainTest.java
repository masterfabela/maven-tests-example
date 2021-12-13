package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @DisplayName("Test hello world")
    @Test
    void testHelloWorld(){
        Assertions.assertEquals("Hello world", Main.makeHelloWorld());
    }
}
