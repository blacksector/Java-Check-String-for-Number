// This is a "Ready to Program" example:

import hsa.Console;

public class ReadyToProgram extends StringtoNumber {


    public static void main(String args[]) {
        
        Console c = new Console();
        c.println("*NOTE: Please enter 'exit' to exit program.*\n\n");

        while (true) {
            c.println("Please enter a number:");
             String theInput = c.readLine();
             String a = StringtoNumber.containsNum(theInput);
             if (theInput == "exit") {
                 break;
             }
             if (a == "1") {
                 c.println("That is a number! :D");
             } else {
                 c.println("That has characters!");
             }
        
    }




}
