public class strToInt {


    public boolean converter(String input) {
        
        // These are our main variables. Nothing to explain, just read!
        boolean hasLetter = false;
        boolean hasMinus = false;
        boolean hasNumber = false;
        boolean hasDecimal = false;
        
        // Lets loop through all the characters in the string!
        for (int x = 0; x < input.length(); x++) {
        
            // Get that specific character we need save it into "a" variable
            char a = input.charAt(x);
            // Save it into an int variable by type casting it. This will convert it
            // into an ascii value.
            
            int j = (int) a;
            
            // Check if there is a minus
            if(j == 45) {
                if (hasMinus) {
                    // This CANNOT be a REAL value as we have tested to have found another
                    // Plus/Minus symbol in the string.
                    return false;
                } else {
                    hasMinus = true;
                }
            }
            // Check if there is a decimal 
            else if (j == 46) {
                if (hasDecimal) {
                    // You cannot have more than one decimal in a number!
                    // This is a fake number!
                    return false;
                } else {
                    hasDecimal = true;
                }
            } // Check if in the ranges of a number
            else if ((j >= 48) && (j <= 57)) {
                hasNumber = true;
            } // Anything else? its false! (Other symbols etc/spaces)
            else {
                return false;
            }
        }
        
        // If it has a number we know it could POSSIBLY be valid
        if (hasNumber) {
            // Has a minus sign but not in the first position? BAD NUMBER!
            if (hasMinus && input.indexOf("-") != 0) {
                return false;    
            } // All works! Has numbers, the minus position is in the right place (first value)
              // No letters and nothing bad! PERFECT! 
            else {
                return true;
            }
        } // No numbers but symbols? Nahhh not a real number
        else {
            return false;
        }    
    }

}
