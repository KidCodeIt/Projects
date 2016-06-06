
/**
 * Write a description of class Logic_Operators here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logic_Operators
{
    public static void main (String [] args){
        System.out.println("Hello this is on Logic Operators");
        
        //new data type
        boolean var1;   //it can be either true or false
        boolean var2;
        boolean var3;
        
        var1 = true;
        var2 = false;
        
        var3 = (2 == 3);     //is 2 equal to 3?
        System.out.println("Is 2 equal to 3? " + var3);
        
        var3 = (2 != 3);     //is 2 not equal to 3?
        System.out.println("Is 2 not equal to 3? " + var3);
        
        //This is a basic if-else statement
        if(true){
            System.out.println("This is true");
        }
        else{
            System.out.println("This was false");
        }
        
        if(false){
            System.out.println("This is true");
        }
        else{
            System.out.println("This was false");
        }
        
        //if-else statement that is comparing two numbers
        System.out.println("Is 2 equal to 3");
        if(2 == 3){
            System.out.println("true: 2 is equal to 3");
        }
        else{
            System.out.println("false: 2 is not equal to 3");
        }
        
        System.out.println("Is 2 not equal to 3?");
        if(2 != 3){
            System.out.println("true: 2 is not equal to 3");
        }
        else{
            System.out.println("false: 2 is equal to 3");
        }
        
        
        //using if- else statements with boolean variables
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        if(bool1){
            System.out.println("The first variable is equal to true");
        }
        else{
            System.out.println("The first variable is equal to false");
        }
        
        if(bool2){
            System.out.println("The second variable is equal to true");
        }
        else{
            System.out.println("The second variable is equal to false");
        }
        
        //if-else statement that use two nonboolean variables
        int num1 = 3;
        int num2 = 5;
        int num3 = 3;
        
        if(num1 < num2){
            System.out.println(num1 + " is less than " + num2);
        }
        else{
            System.out.println(num1 + " is greater than " + num2);
        }
        
        if(num2 < num1){
            System.out.println(num1 + " is less than " + num2);
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
