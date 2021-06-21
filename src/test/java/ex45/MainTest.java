package ex45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main() {
        File file = new File("/Users/emperorshiv/Desktop/COP3330/untitled/Assignment3/exercise45_input.txt");
        Assertions.assertTrue(file.exists());

    }

}