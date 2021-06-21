
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex41;

//pre-processor directives
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//main class
//begin of main
public class main {

    public static void main(String[] args)  {

        //Introduce File points for input and output
        File inputFile = new File("exercise41_input.txt");
        File outputFile = new File("exercise41_output.txt");

        //add in stipulation ot delete output file at beginning of program
        if (outputFile.exists()) {
            outputFile.delete();
        }

        //send to method sortnames()
        sortnames(inputFile,outputFile);

    }

    //Create method sort names with IO exception
    private static void sortnames(File inputFile, File outputFile){

        //create Array to store names
        ArrayList<String> names = new ArrayList<String>();

        //try catch statement to sort names and print to output file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            //create String to store name
            String fullName;

            // while(full name = reader line does not equal null){
            //        add names to full Name string
            //        }
            while ((fullName = reader.readLine()) != null) {
                names.add(fullName);
            }

            //sorts names
            Collections.sort(names);

            //creation of output writer
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFile, true));

            //output append statement to print format of table
            output.append("Total of " + names.size() + " names\n");
            output.append("--------------------\n");

            //for(String name: names)
            //            write names to ouput file sorted
            for (String name : names) {
                output.append(name + "\n");
            }

            output.close();

            //exception to check if file is not found prints statement saying "not found"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

