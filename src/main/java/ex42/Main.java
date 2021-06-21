/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex42;

//pre-processor directives
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//main
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        //print out table format
        System.out.println("Last\t\tFirst\t\tSalary");
        System.out.println("-----------------------------------------");

        //create file pointer for input file
        File inputFile = new File("exercise42_input.txt");

        //create reader for input file
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        //create string to split
        String info = "";

        //while statement to read in lines until reader reaches null
        //    split each value of salary, first, and last name into token array
        //    print out based on table specifications
        //}
        while((info = reader.readLine()) != null) {
            String[] tokens = info.split(",");
            String last = tokens[0];
            String first = tokens[1];
            int salary = Integer.parseInt(tokens[2]);

            System.out.printf("%-15s %-10s %10d\n", last, first, salary);
        }

    }

}

