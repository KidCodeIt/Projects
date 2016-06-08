
/**
 * Write a description of class Operators here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Operators
{
    public static void main(String [] args){
        /*
         * The math operators are +,-,*,/, and %
         * They can be used with ints, and doubles
         * and also variables that are ints and doubles
         * They can be used with chars as well but not as often
         * 
         */
        
        System.out.println(1 + 2);
        //result: 3
        
        //Lets create variables to use with our math operators
        int num1 = 1;
        int num2 = 2;
        int result;
        int num3 = 3;
        int num4 = 4;
        
        
        //Adding
        result = num1 + num2;
        System.out.println("1 + 2 = " + result);
        
        //Subtraction
        result = num2 - num1;
        System.out.println("2 - 1 = " + result);
        
        //Multiplacation
        result = num1 * num2;
        System.out.println("1 * 2 = " + result);
        
        //Division
        result = num2 / num1;
        System.out.println("2 / 1 = " + result);
        
        //Modulist
        result = num2 % num1;
        System.out.println("2 % 1 = " + result);
        
        result = num4 % num3;
        System.out.println("4 % 3 = " + result);
        
        //using the operators with doubles
        double dub1 = 1.0;
        double dub2 = 2.5;
        double dub3 = 3.0;
        double dub_Result;
        
        //Adding doubles
        dub_Result = dub1 + dub2;
        System.out.println("1.0 + 2.5 = " + dub_Result);
        
        //Subtracting doubles
        dub_Result = dub2 - dub1;
        System.out.println("2.5 - 1.0 = " + dub_Result);
        
        //Multiplying doubles
        dub_Result = dub3 * dub2;
        System.out.println("3.0 * 2.5 = " + dub_Result);
        
        //Dividing doubles
        dub_Result = dub3 / dub1;
        System.out.println("3.0 / 1.0 = " + dub_Result);
        
        //Modulist wiht doubles
        dub_Result = dub3 % dub1;
        System.out.println("3.0 % 1.0 = " + dub_Result);
        
        dub_Result = dub2 % dub1;
        System.out.println("2.5 % 1.0 = " + dub_Result);
        
        
        
    }
}
