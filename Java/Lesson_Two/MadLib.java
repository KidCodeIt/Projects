import java.util.Scanner;
/**
 * Write a description of class MadLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MadLib
{
    public static void main(String [] args){
         
        //all of the variables and the scan object creation
        String animal;
        String food;
        String noun1;
        String noun2;
        String verb1;
        String verb2;
        String verb3;
        String verb4;
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("We are going to make a MadLib");
        
        //asking and recieving the input
        System.out.println("Please enter an animal: ");
        animal = scan.next();
        
        System.out.println("Please enter a food: ");
        food = scan.next();
        
        System.out.println("Please enter a noun: ");
        noun1 = scan.next();
        
        System.out.println("Please enter a verb: ");
        verb1 = scan.next();
        
        System.out.println("Please enter a verb: ");
        verb2 = scan.next();
        
        System.out.println("Please enter a verb: ");
        verb3 = scan.next();
        
        System.out.println("Please enter a verb: ");
        verb4 = scan.next();
        
        System.out.println("Please enter a noun: ");
        noun2 = scan.next();
        
        
        System.out.println();   //for spacing
        
        
        //The complete madlib
        System.out.println("If you give a " + animal + " a " + food + ". ");
        System.out.println("He/She is going to ask for a " + noun1 + ". ");
        System.out.println("When you give him/her the " + noun1 + ", he/she will want to " + verb1 + ". ");
        System.out.println("When he/she is finished, he/she will " + verb2 + ". ");
        System.out.println("Then he/she will " + verb3 + " and " + verb4 + " to the " + noun2 + ". ");
        
    }
}
