
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    /**
     * Constructor for objects of class Animal
     */
    
    String name;
    String animal_Type;
    String color;
    int age;
    
    public Animal()
    {
        
        
    }
    
    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public void setType(String type){
        animal_Type = type;
    }
    public String getType(){
        return animal_Type;
    }
    public void setColor(String clr){
        color = clr;
    }
    public String getColor(){
        return color;
    }
    public void setAge(int ag){
        age = ag;
    }
    public int getAge(){
        return age;
    }
}
