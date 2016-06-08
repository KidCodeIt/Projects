import java.util.Scanner;
/**
 * Write a description of class Math_Is_Fun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Math_Is_Fun
{
    public static void main(String [] args){
        //goal: to read in two ints and perform each of the math operations on them
        //secondary goal: read in two doubles and perform each of the math operations on them
        
        int num1;
        int num2;
        int num_Result;
        double dub1;
        double dub2;
        double dub_Result;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the first int");
        num1 = scan.nextInt();
        
        System.out.println("Please enter the second int");
        num2 = scan.nextInt();
        
        //Adding
        num_Result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num_Result);
        
        //Subtracting
        num_Result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + num_Result);
        
        //Multiple
        num_Result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + num_Result);
        
        //Dividing
        num_Result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + num_Result);
        
        //Modulist
        num_Result = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + num_Result);
        
        
        //Using doubles
        
        System.out.println("Please enter the first double");
        dub1 = scan.nextDouble();
        
        System.out.println("Please enter the second double");
        dub2 = scan.nextDouble();
        
        //Adding
        dub_Result = dub1 + dub2;
        System.out.println(dub1 + " + " + dub2 + " = " + dub_Result);
        
        //Subtracting
        dub_Result = dub1 - dub2;
        System.out.println(dub1 + " - " + dub2 + " = " + dub_Result);
        
        //Multiple
        dub_Result = dub1 * dub2;
        System.out.println(dub1 + " * " + dub2 + " = " + dub_Result);
        
        //Dividing
        dub_Result = dub1 / dub2;
        System.out.println(dub1 + " / " + dub2 + " = " + dub_Result);
        
        //Modulist
        dub_Result = dub1 % dub2;
        System.out.println(dub1 + " % " + dub2 + " = " + dub_Result);
    }
}
