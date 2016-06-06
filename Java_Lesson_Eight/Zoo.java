
/**
 * Write a description of class Zoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoo
{
    
    String animal;
    int age;
    String name;
    String gender;
    
    public Zoo()
    {
        
    }
    
    public Zoo(String anml, String nm){
        animal = anml;
        name = nm;
    }
    
    public Zoo(String anml, int years, String nm, String gend){
        animal = anml;
        age = years;
        name = nm;
        gender = gend;
    }
    
    public void setAnimal(String anml){
        animal = anml;
    }
    public String getAnimal(){
        return animal;
    }
    
    public void setAge(int years){
        age = years;
    }
    public int getAge(){
        return age;
    }
    
    public void setName(String nm){
        name = nm;
    }
    public String getName(){
        return name;
    }
    
    public void setGender(String gend){
        gender = gend;
    }
    public String getGender(){
        return gender;
    }
}
