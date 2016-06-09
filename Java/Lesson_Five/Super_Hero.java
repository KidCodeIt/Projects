import java.util.*;
/**
 * Write a description of class Super_Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Super_Hero
{
    public static void main(String [] args){
        HashMap<String, String> myHero = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        String userIN;
        
        myHero.put("SuperMan", "Strength");
        myHero.put("Batman", "Money");
        myHero.put("Spiderman", "Web-Slinging");
        myHero.put("Ironman","a IronMan Suite");
        myHero.put("Thor","a Magical Hammer");
        
        System.out.println("You have a group of Super Heros");
        System.out.println(myHero.keySet());
        
        System.out.println("type the name of a superhero to see their special ability");
        userIN = scan.nextLine();
        
        if(myHero.containsKey(userIN)){
            System.out.println("Your Super Hero " + userIN + " has the power of " + myHero.get(userIN));
        }
        else{
            System.out.println("The Super Hero you named isn't in our group");
        }
    }
}
