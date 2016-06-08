
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
        Animal[] myZoo = new Animal[10];
        for(int i = 0; i < 10; i++){
            Animal zoo = new Animal();
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
        
        Dog myDog = new Dog();
        
        //see how I can still use setName and getName even though I didn't make them in the Dog class
        //The Dog class is a child class of the Animal class
        //Since the Animal class is the parent and it has a get/setName then I can use it with dog
        myDog.setName("Spot");
        myDog.setBreed("Beagle");
        
        System.out.println(myDog.getName());
        System.out.println(myDog.getBreed());
        
        
        
    }
}
