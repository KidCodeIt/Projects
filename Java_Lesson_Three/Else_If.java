
/**
 * Write a description of class Else_If here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Else_If
{
    public static void main(String [] args){
        //using else-if statements
        
        if(false){
            
        }
        else if(true){
            System.out.println("This is an else-if");
            
        }
        
        
        //multiple else-ifs
        
        if(false){
            System.out.println("This won't print");
        }
        else if(false){
            System.out.println("This won't print");
        }
        else if(false){
            System.out.println("This won't print");
        }
        else if(true){
            System.out.println("This is true and prints out.");
        }
        
        if(false){
            System.out.println("This won't print");
        }
        else if(false){
            System.out.println("This won't print");
        }
        else if(true){
            System.out.println("This is true and prints out");
        }
        else if(false){
            System.out.println("This doesn't print");
            
        }
    }
}
