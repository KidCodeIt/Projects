
/**
 * Write a description of class Arrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String [] args){
        //creating an Array to store different data types
        
        //creates an array with 5 places
        int[] intArray = new int[5];
        
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        //notice how I made the array 5 slots but the index intArray[4] only goes to 4
        
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
        
        //creating an array for doubles
        
        double[] doubleArray = new double[5];
        
        //places values in each element of the doubleArray
        doubleArray[0] = 1.5;
        doubleArray[1] = 2.1;
        doubleArray[2] = 3.0;
        doubleArray[3] = 4.2;
        doubleArray[4] = 5.5;
        
        //prints out each element of the doubleArray
        System.out.println(doubleArray[0]);
        System.out.println(doubleArray[1]);
        System.out.println(doubleArray[2]);
        System.out.println(doubleArray[3]);
        System.out.println(doubleArray[4]);
        
        //creates an array to store 5 strings
        String[] strArray = new String[5];
        
        //stores each string to a place in the array
        strArray[0] = "Bugs";
        strArray[1] = "Daffy";
        strArray[2] = "Lola";
        strArray[3] = "Tweety";
        strArray[4] = "Taz";
        
        //prints each string in the array
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println(strArray[3]);
        System.out.println(strArray[4]);
        
        
    }
}
