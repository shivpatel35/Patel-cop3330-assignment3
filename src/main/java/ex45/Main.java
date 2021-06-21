/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shiv Patel
 */


package ex45;

//pre-processor directives
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//main
public class Main {

    public static void main(String[] args) {

        //scanner declaration
        Scanner sc = new Scanner(System.in);

        //try-catch statement finds words, replaces them, and prints into output file
        try {
            File f = new File("exercise45_input.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));

           // Strings for input
            // file text
            String input = "";
            String fileText = "";

            //while statement to read in file text into input string and separating words
            while((input = br.readLine()) != null) {
                fileText += input + "\r\n";
            }
            br.close();

           // creation of string for output text and using replace modifier to replace words
            String outputText = fileText.replaceAll("utilize", "use");

            //statement to ask user what is the name of the output file
            System.out.print("What is the name of the output file? : ");
            String outputFile = sc.nextLine();

            //File write creation
            //writes to output file
            FileWriter writer = new FileWriter(outputFile);
            writer.write(outputText);
            writer.close();

            System.out.println("Output has been written to " + outputFile + ".");

            //catch exception to check
            //for invalid file
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}