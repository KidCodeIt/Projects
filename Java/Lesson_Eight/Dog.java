
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Animal
{
    String breed;
    int dogAge;    //this should be their age in Dog years
    
    
    public Dog(){
        
    }
    public int getDogAge(){
        return dogAge;
    }
    public void setDogAge(int age){
        dogAge = age * 7;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String type){
        breed = type;
    }
}
