package ex42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class MainTest {
    @Test
    void name() {
        File file = new File("/Users/emperorshiv/Desktop/COP3330/untitled/Assignment3/exercise42_input.txt");
        Assertions.assertTrue(file.exists());
    }
}