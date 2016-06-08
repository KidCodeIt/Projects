import java.util.*;
/**
 * Write a description of class Basic_Hash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basic_Hash
{
    public static void main(String [] args){
        //creating a hashMap
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        hMap.put(1, "Hello");
        hMap.put(4, "World");
        
        //allows you to add values to your HashMap
        System.out.println(hMap.get(1));
        System.out.println(hMap.get(4));
        
        //prints all the values stored in the HashMap but not the associated keys
        System.out.println(hMap.values());
        
    }
}
