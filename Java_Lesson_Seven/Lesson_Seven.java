
/**
 * Write a description of class Lesson_Seven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lesson_Seven
{
    public static void main (String [] args){
        Animal animal = new Animal();
        
        animal.setName("Scott");
        System.out.println(animal.getName());
        
        animal.setType("dog");
        System.out.println(animal.getType());
        
        animal.setColor("Green");
        System.out.println(animal.getColor());
        
        animal.setAge(21);
        System.out.println(animal.getAge());
        
    }
}
