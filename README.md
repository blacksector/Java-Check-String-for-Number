# Java-Check-String-for-Number
This small program can be used to determine if a string contains numbers. This is useful for programs that want only number input from the user and Try Catch or for what ever reason other libraries cannot be used.

## How to use
1. Download the StringtoNumber.java file and place it inside the same folder as your source code for the program you want to run the check on.
2. On your source code for the program you want to use edit the main class declaration and add "extends StringtoNumber" eg:
_public class HelloWorld extends StringtoNumber_
3. Call the StringtoNumber.containsNum() function and save it in a variable or use it directly in the if statement.
eg: _String theReturn = StringtoNumber.containsNum(userInput)_
4. If the program returns 0 (ZERO) it contains letters else the program contains only numbers
