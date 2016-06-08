import java.util.Scanner;
/**
 * Write a description of class Scan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scan
{
    public static void main(String [] args){
        
        String name;
        int num;
        double dub;
        
        //using Scanner to read in data
        Scanner scan = new Scanner(System.in);  
        //This line is necessary and you'll learn more about it in a different lesson
        
        System.out.println("Please enter your name ");
        name = scan.next(); //this saves whatever you typed to the variable name
        
        System.out.println("Your name is " + name);
        
        //use scan.next(); for Strings and chars
        //scan.nextInt(); is for reading in ints
        //scan.nextDouble(); is for reading in doubles
        //lets try reading in ints
        
        System.out.println("what is your favorite number?");
        num = scan.nextInt();
        
        System.out.println("Your favorite number is " + num);
        
        //Reading in a double
        System.out.println("Please enter a double");
        dub = scan.nextDouble();
        
        System.out.println("The double you entered is " + dub);
        
    }
}
