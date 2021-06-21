package ex41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;


public class maintest {
    @Test
    void main() {
        File file = new File("/Users/emperorshiv/Desktop/COP3330/untitled/Assignment3/exercise41_output.txt");
        Assertions.assertTrue(file.exists());

    }


    }


