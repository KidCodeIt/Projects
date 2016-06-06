
/**
 * Write a description of class ZooKeeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZooKeeper
{
    public static void main(String [] args){
        System.out.println("Hello we are going to make a Zoo");
        
        //Zoo zoo = new Zoo();
        Zoo[] myZoo = new Zoo[10];
        for(int i = 0; i < 10; i++){
            Zoo zoo = new Zoo();
            myZoo[i] = zoo;
        }
        
        myZoo[0].setName("Mickey");
        myZoo[1].setName("Goofy");
        myZoo[2].setName("Donald");
        myZoo[3].setName("Minnie");
        myZoo[4].setName("Bugs");
        myZoo[5].setName("Daffy");
        myZoo[6].setName("Elmer");
        myZoo[7].setName("Martian");
        myZoo[8].setName("Spud");
        myZoo[9].setName("Pluto");
        
        System.out.println(myZoo[0].getName());
        System.out.println(myZoo[1].getName());
        System.out.println(myZoo[2].getName());
        System.out.println(myZoo[3].getName());
        System.out.println(myZoo[4].getName());
        System.out.println(myZoo[5].getName());
        System.out.println(myZoo[6].getName());
        System.out.println(myZoo[7].getName());
        System.out.println(myZoo[8].getName());
        System.out.println(myZoo[9].getName());
        
        
        //notice how it still creates an animal like those above
        //but this time it doesn't need to set the name and animal type after it is created
        //it is created and assigned a name and animal type all in one line
        Zoo myAnimal = new Zoo("Tazmanian Devil", "Taz");
        
        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAnimal());
        
        
        
        
        
    }
}
