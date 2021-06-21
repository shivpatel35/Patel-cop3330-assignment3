/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Shiv Patel
 */

package ex46;

//pre-processor directives
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//main
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner declaration for input file
        Scanner input = new Scanner(new File("exercise46_input.txt"));

        //creates new empty tree map
        Map<String, Integer> words = new TreeMap<String, Integer>();

        //reads input and adds to key
        while (input.hasNext()) {
            String next = input.next();
            if (!words.containsKey(next)) {
                words.put(next, 1);
            } else {
                words.put(next, words.get(next) + 1);
            }
        }

        //creates new array and sorts
        Object[] sorted = words.entrySet().toArray();
        Arrays.sort(sorted, new Comparator() {

            //compare function
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue().compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });

        //prints out put of word and number of stars correlating to how many times it was seen in the input file
        for (Object x : sorted) {
            System.out.print(((Map.Entry<String, Integer>) x).getKey() + " : ");
            for (int i = 0; i < ((Map.Entry<String, Integer>) x).getValue(); ++i) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
