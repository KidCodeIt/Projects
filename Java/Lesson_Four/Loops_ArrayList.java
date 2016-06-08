import java.util.*;
/**
 * Write a description of class Loops_ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loops_ArrayList
{
    public static void main(String [] args){
        // looping through ArrayList
        
        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        
        for(int i = 0; i < 5; i++){
            intArrList.add(i);
        }
        
        for(int j = 0; j < 5; j++){
            System.out.println(intArrList.get(j));
        }
        
        //creates an array of strings
        ArrayList<String> strArrList = new ArrayList<String>();
        
        strArrList.add("Bugs");
        strArrList.add("Daffy");
        strArrList.add("Lola");
        strArrList.add("Taz");
        strArrList.add("Tweety bird");
        
        
        //prints out each element of strArr
        for(int j = 0; j < 5; j++){
            System.out.println(strArrList.get(j));
        }
    }
}
