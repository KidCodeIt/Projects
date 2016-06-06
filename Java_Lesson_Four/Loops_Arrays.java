
/**
 * Write a description of class Loops_Arrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loops_Arrays
{
    public static void main(String [] args){
        //creates and array and an arrayList and fills it using a for loop
        
        
        //creates an array for ints
        int[] intArr = new int[5];
        
        //for loop that adds ints to the array
        for(int i = 0; i < 5 ; i++){
            intArr[i] = i;
        }
        
        //for loop that prints out each value saved in intArr
        for(int j = 0; j < 5; j++){
            System.out.println(intArr[j]);
        }
        
        
        //creates an array of strings
        String[] strArr = new String[5];
        
        strArr[0] = "Bugs";
        strArr[1] = "Daffy";
        strArr[2] = "Lola";
        strArr[3] = "Tweety";
        strArr[4] = "Taz";
        
        //prints out each element of strArr
        for(int j = 0; j < 5; j++){
            System.out.println(strArr[j]);
        }
    }
}
