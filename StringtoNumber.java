
public class StringtoNumber {


    public static void main(String args[]) {

        Console c = new Console();
        
        boolean hasLetter = false;
        boolean hasNumber = false;
        
        c.println("Enter a number:");
        String userInput = c.readLine();
        
        for (int x = 0; x < userInput.length(); x++) {
        
            char a = userInput.charAt(x);
            
            int j = (int) a;
            
            if ((j < 42) || (j > 57)) {
                hasLetter = true;
                break;
            }
            if ((j >= 48) && (j <= 57)) {
                hasNumber = true;
            }       
        }
        
        if (hasLetter) {
            c.println( "This is fake!");
        } else {
            if (hasNumber) {
                c.println("This has numbers!");
            } else {
                c.println("Why are you entering symbols only? o.O");
            }
        }
        
    }




}
