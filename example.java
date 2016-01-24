// This is an example on how to USE the string to number converter!
// No need to import anything if the strToInt.java file is in the same directory
// as this java file.

public class NumberConverter {
  public static void main(String args[]) {
  
    // Assign the convert variable as the object holding strToInt class:
    strToInt convert = new strToInt();
    
    // Finally enter a test value as parameter and print out:
    // true: if the string entered is a number and can be type casted by Java
    // false: if the string entered is not a number and cannot be type casted by Java.
    System.out.println(convert.converter("-45"));
    
  } 
}
