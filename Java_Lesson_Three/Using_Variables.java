
/**
 * Write a description of class Using_Variables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Using_Variables
{
    public static void main(String [] args){
        //using variables in if-else statements
        
        //The different relational and logic operations
        // <, <=, >, >=, ==, !=
        
        int num1 = 2;
        int num2 = 3;
        
        //Less than
        if(num1 < num2){
            System.out.println("if: num1 is less than num2");
        }
        else{
            System.out.println("This won't be printed");
        }
        
        //Less than or equal to
        if(num1 <= num2){
            System.out.println("if: num1 is less than or equal to num2");
        }
        else{
            System.out.println("This won't be printed");
        }
        
        //Greater than
        if(num1 > num2){
            System.out.println("This won't be printed");
        }
        else{
            System.out.println("else: num1 is not greater than num2");
        }
        
        //Greater than or equal to
        if(num1 >= num2){
            System.out.println("This won't be printed");
        }
        else{
            System.out.println("else: num1 is not greater than or equal to num2");
        }
        
        //Equal too
        if(num1 == num2){
            System.out.println("This won't be printed");
        }
        else{
            System.out.println("else: num1 is not equal to num2");
        }
        
        //Not equal too
        if(num1 != num2){
            System.out.println("if: num1 is not eqaul to num2");
        }
        else{
            System.out.println("This won't be printed");
        }
    }
}
