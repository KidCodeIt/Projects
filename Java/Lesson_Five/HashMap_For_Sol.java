import java.util.*;
/**
 * Write a description of class HashMap_For here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMap_For_Sol
{
    public static void main(String [] args){
        /*
         * Use the HashMap that us created that takes a String as the key and the stored object
         * read in 5 strings for the keys and 5 to associate with the key
         * Use a for loop so you don't need to just retype the same line over and over
         * 
         */
        String key;
        String value;
        
        HashMap<String, String> myMap = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        
        //create the for loop that loops through 5 times
        for(int i = 0; i < 5; i++){
            System.out.println("Please enter a String to use as a Key");
            key = scan.next();
            
            System.out.println("Please enter a String to save as the value.");
            value = scan.next();
            
            myMap.put(key, value);
        }
        //inside the loop
        //it should ask for two Strings, one as the Key and one as the value
        
        //if everything is saved into the HashMap correctly this will print all of the values
        System.out.println(myMap.values());
        
        //This will print out all of the keys that you used
        System.out.println(myMap.keySet());
    }
}