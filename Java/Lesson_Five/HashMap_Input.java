import java.util.*;
/**
 * Write a description of class HashMap_Input here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap_Input
{
    public static void main(String [] args){
        
        int key;
        String stuff;
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        
        System.out.println("We are going to store information into a HashMap.");
        System.out.println("Please enter an int to use as a Key.");
        
        key = scan.nextInt();
        
        System.out.println("Please enter a String to store.");
        
        stuff = scan.next();
        
        myMap.put(key, stuff);
        
        System.out.println("You stored the string " + stuff + " with the key " + key);
        
    }
}
