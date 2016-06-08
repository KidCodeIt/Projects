import java.util.*;
/**
 * Write a description of class Hashmap_Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hashmap_Strings
{
    public static void main(String [] args){
        HashMap<String, String> person = new HashMap<String, String>();
        
        person.put("name", "Mickey");
        person.put("age", "80");
        person.put("gender", "boy");
        
        System.out.println(person.get("name"));
        
        //This prints out all of the values saved
        System.out.println(person.values());
        
        //This prints out all of the keys
        System.out.println(person.keySet());
    }
}
