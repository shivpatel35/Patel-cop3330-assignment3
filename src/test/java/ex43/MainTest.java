package ex43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    @Test
    void name() {
        File file = new File("/Users/emperorshiv/Desktop/COP3330/untitled/Assignment3/website");
        Assertions.assertTrue(file.exists());
    }
}