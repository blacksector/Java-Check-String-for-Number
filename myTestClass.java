
public class myTestClass extends StringtoNumber {


    public static void main(String args[]) {
        
        Console c = new Console();
        
        // Change this around to get user input. Send the containsNum 
        // method a STRING input from user.
        String a = StringtoNumber.containsNum("1");

        
        if (a == "1") {
            c.println("That is a number! :D");
        } else {
            c.println("That has characters!");
        }
        
    }




}
