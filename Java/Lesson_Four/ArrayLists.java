import java.util.*;
/**
 * Write a description of class ArrayLists here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayLists
{
    public static void main(String [] args){
        //creating an arrayList for different data types
        
        //creating an arrayList of ints
        
        //we don't need to specify a size
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        
        //saves ints to the ArrayList
        //see how this is different from adding elemets to an Array
        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);
        
        //prints each item saved in the ArrayList
        System.out.println("The int at index 0 is " + intArrayList.get(0));
        System.out.println("The int at index 1 is " + intArrayList.get(1));
        System.out.println("The int at index 2 is " + intArrayList.get(2));
        System.out.println("The int at index 3 is " + intArrayList.get(3));
        System.out.println("The int at index 4 is " + intArrayList.get(4));
        
        //creates an ArrayList that holds doubes
        ArrayList<Double> dubArrayList = new ArrayList<Double>();
        
        //adds elements to dubArrayList
        dubArrayList.add(1.0);
        dubArrayList.add(2.3);
        dubArrayList.add(3.7);
        dubArrayList.add(4.2);
        dubArrayList.add(5.0);
        
        //prints each item saved in the doubles ArrayList
        System.out.println("The double at index 0 is " + dubArrayList.get(0));
        System.out.println("The double at index 1 is " + dubArrayList.get(1));
        System.out.println("The double at index 2 is " + dubArrayList.get(2));
        System.out.println("The double at index 3 is " + dubArrayList.get(3));
        System.out.println("The double at index 4 is " + dubArrayList.get(4));
        
        //creating an ArrayList for Strings
        ArrayList<String> strArrayList = new ArrayList<String>();
        
        strArrayList.add("Bugs");
        strArrayList.add("Daffy");
        strArrayList.add("Lola");
        strArrayList.add("Taz");
        strArrayList.add("Tweety Bird");
        
        System.out.println("The string at index 0 is " + strArrayList.get(0));
        System.out.println("The string at index 1 is " + strArrayList.get(1));
        System.out.println("The string at index 2 is " + strArrayList.get(2));
        System.out.println("The string at index 3 is " + strArrayList.get(3));
        System.out.println("The string at index 4 is " + strArrayList.get(4));
        
    }
}
