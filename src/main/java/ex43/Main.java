/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex43;

//pre-processor directives
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//begin of main
public class Main {

    public static void main(String[] args) throws IOException {

        //String declaration for sitename, author, jsChoice and cssChoice
        String siteName = "";
        String author = "";
        String jsChoice = "";
        String cssChoice = "";

        //scanner declaration
        Scanner sc = new Scanner(System.in);

        //prompts user for site name, author, folder for JavaScript and/or CSS
        System.out.print("Site name: ");
        siteName = sc.nextLine();
        System.out.print("Author: ");
        author = sc.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        jsChoice = sc.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        cssChoice = sc.nextLine();

        //send to method filecreator
        filecreator(siteName, author, jsChoice, cssChoice);


    }
    private static void filecreator(String siteName, String author, String jsChoice, String cssChoice ) throws IOException {

        //path to add to directory
        String path = "website" + File.separator + siteName + File.separator + "index.html";

        File f = new File(path);
        f.getParentFile().mkdirs();
        f.createNewFile();

        //prints output to screen to tell user about creation
        System.out.println("Created ./website/" + siteName);

        //writer writes to index.html file
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html><head><title>" + siteName + "</title><meta name=\"" + author
                + "\" content=\"\"></head><body><p>This is a Body</p></body></html>");
        bw.close();

        ////prints output to screen to tell user about creation
        System.out.println("Created ./website/" + siteName + "/index.html");

        //use an if statement for user choice for folders for js and css in the path
        //print statement in each case to show that the folders have been created
        if (jsChoice.equals("y") || jsChoice.equals("Y")) {
            String JSpath = "Macintosh HD" + File.separator + "Users" + File.separator + "emperorshiv" + File.separator + "Desktop"
                    + File.separator + "COP3330" + File.separator + "website" + File.separator + siteName + File.separator + "js";
            ;
            //point each statement to the path of the directory
            File jsFolder = new File(JSpath);
            jsFolder.mkdirs();
            System.out.println("Created ./website/" + siteName + "/js/");
        }

        if (cssChoice.equals("y") || cssChoice.equals("Y")) {
            String CSSpath =  "website" + File.separator + siteName + File.separator + "css";
            ;
            //point each statement to the path of the directory
            File cssFolder = new File(CSSpath);
            cssFolder.mkdirs();
            System.out.println("Created ./website/" + siteName + "/css/");
        }
    }

}
