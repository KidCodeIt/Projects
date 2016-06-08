
/**
 * Write a description of class Nested here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nested
{
    public static void main(String [] args){
        //nesting if-else statements
        
        boolean boolt = true;
        boolean boolf = false;
        
        //if if
        if(boolt){
            if(boolt){
                System.out.println("This is inside two if's");
            }
            else{
                
            }
        }
        else{
            
        }
        
        //else if
        if(boolf){
            
        }
        else{
            if(boolt){
                System.out.println("This is inside and else, then an if");
            }
            else{
                
            }
        }
        
        //if else
        if(boolt){
            if(boolf){
                
            }
            else{
                System.out.println("This is inside an if then an else");
            }
        }
        else{
            
        }
        
        //else else
        if(boolf){
            
        }
        else{
            if(boolf){
                
            }
            else{
                System.out.println("This is inside of two else's");
            }
        }
    }
}
