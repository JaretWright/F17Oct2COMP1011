package f17oct2comp1011;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class F17Oct2COMP1011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an area code or phone number: ");
        String userInput = keyboard.nextLine();
        
        System.out.printf("%s is a%s area code%n", userInput, checkAreaCode(userInput)?
                                                    " valid":"n invalid");
        
        
        System.out.printf("%s is a%s phone #%n", userInput, checkPhoneNum(userInput)?
                                                    " valid":"n invalid");
    }
    
    public static boolean checkPhoneNum(String phoneNum)
    {
        return phoneNum.matches("\\(?[2-9]\\d{2}\\)?[-.\\s]?[2-9]\\d{2}[-.\\s]?\\d{4}");
    }
    
    
    public static boolean checkAreaCode(String areaCode)
    {
        return areaCode.matches("[2-9]\\d{2}");
    }
    
    
}
