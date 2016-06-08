
/**
 * Write a description of class Zoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    
    String animal_Type;
    int age;
    String name;
    String gender;
    
    public Animal()
    {
        
    }
    
    public Animal(String type, String named){
        animal_Type = type;
        name = named;
    }
    
    public Animal(String type, int years, String named, String gen){
        animal_Type = type;
        age = years;
        name = named;
        gender = gen;
    }
    
    public void setType(String type){
        animal_Type = type;
    }
    public String getType(){
        return animal_Type;
    }
    
    public void setAge(int years){
        age = years;
    }
    public int getAge(){
        return age;
    }
    
    public void setName(String named){
        name = named;
    }
    public String getName(){
        return name;
    }
    
    public void setGender(String gen){
        gender = gen;
    }
    public String getGender(){
        return gender;
    }
}
