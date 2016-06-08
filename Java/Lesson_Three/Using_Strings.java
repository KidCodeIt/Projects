
/**
 * Write a description of class Using_Strings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Using_Strings
{
    public static void main(String [] args){
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "World";
        
        if(string1.equals("Hello")){
            System.out.println("string1 is the same as Hello");
        }
        if(string1.equals(string2)){
            System.out.println("string1 is the same as string2");
        }
        if(string1.equals(string3)){
            System.out.println("string1 is not the same as string3");
            //This won't get printed
        }
    }
    
}
