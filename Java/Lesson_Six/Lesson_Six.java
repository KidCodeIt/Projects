import java.util.Scanner;
/**
 * Write a description of class Lesson_Six here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lesson_Six
{
    public static void main(String [] args){
        Dog waldo = new Dog();
        Dog scott = new Dog();
        
        //when we use Scanner it is the same thing as making a dog, and we use Scanner to read in information
        Scanner scan = new Scanner(System.in);
        
        //creating an Array of Dogs
        Dog[] myDogs = new Dog[3];
        myDogs[0] = waldo;
        myDogs[1] = scott;
        Dog goofy = new Dog();
        myDogs[2] = goofy;
        
        Animal bear = new Animal();
        
    }
}
