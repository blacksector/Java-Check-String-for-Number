# Java Check String for Number
This small program can be used to determine if a string contains numbers. This is useful for programs that want only number input from the user and Try Catch or for what ever reason other libraries cannot be used.

In my case this was built for school as I didn't want to import all the extra apache commons library code and Ready to Program didn't have a fool proof method. So I implemented this myself.

## How to use
1. Download strToInt.java
2. Import into project/create the strToInt object
3. Call the converter() method with the user input as the parameter, example:
```java
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
```

Good luck! And Enjoy!

If you have any improvements you would like to suggest, just create a pull request or fork it and make your own!
