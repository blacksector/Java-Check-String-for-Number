/*
Program Written By: Omar Quazi
Last updated: October 2nd, 2015

Simple little "library" to use in a Java Program.

Simply send the "containsNum" method a string and
it will check if the string contains a letter anywhere.
Here is the logic break up:

- Get the user's input
- Loop through the user's input
- Get the string spot and convert to char.
- Convert the char to its ascii value
- Check if the ascii value is in its number range (48 - 57) inclusive
- If there is at least one letter it will trigger the if statement
    - The if statement will make sure when the program is returning a
      true or false statement, it will tell the user that there was a
      number
- If countLetters is true return 0
- If coutLetters is false return 1
*/

public class StringtoNumber {
    
    
    // Java method string type. It checks if a string contains letters and no numbers
    // then re
    public static String containsNum(String userInput) {
        
    
        // Lets keep a track if they entered a number or not
        boolean hasLetter = false;

        // For loop looping through userInput string.
        for (int x = 0; x < userInput.length(); x++) {
                
            // Get the first letter and save it in a char variable
            char a = userInput.charAt(x);
            // Convert the char into its ascii value
            int j = (int) a;
            // If the character doesnt have a ascii value of 0-9 it is a
            // a letter or something else eg symbol
            if ((j < 48) || (j > 57)) { 
                // If it contains a letter add one to the variable
                hasLetter = true;
                break;
                        
            } 
            
            // Contains a letter?
            if (hasLetter) {
                return "0"; // Tell program yes this contains letters
            } else {
                return "1"; // Tell program no it doesnt contain letters
            }   
            
        }    
    }

}
