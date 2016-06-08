import java.util.Scanner;
/**
 * Write a description of class Adventure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adventure
{
    public static void main(String [] args){
        //this is your choose your own adventure game
        String name;
        String weapon;
        String travel;
        String time;
        String door;
        String goIn;
        String cluck;
        String escape;
        String vent;
        String action;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("We have an urgent misson for you!");
        System.out.println("What is your code name?");
        
        name = scan.next();
        
        System.out.println("Great! Agent " + name);
        
        System.out.println("The Evil DR. Fox is chicken napping chickens everywhere!");
        System.out.println("We need your help to rescue them, and Stop DR. Fox");
        System.out.println("First you will need to choose your weapon. Do you want to use a Fox Mask or a Tennis Raquet?(Mask/Raquet)");
        
        weapon = scan.next();
        
        if(weapon.equals("Mask")){
            System.out.println("Great choice, you picked the Fox Mask");
        }
        else if(weapon.equals("Raquet")){
            System.out.println("Excellent choice, you picked the Tennis Raquet");
        }
        
        System.out.println("Our intel has told us that DR. Fox is hiding away in his secret layer Mount FoxHole");
        System.out.println("The plane is waiting in the hanger for you, good luck on your mission we are counting on you"); 
        System.out.println("Do you want to airdrop in at night or during the day? (night/day)");
        
        time = scan.next();
        
        if(time.equals("night")){
            System.out.println("Great choice, you were able to land without being detected");
            System.out.println("Their looks like there is a door in the side of the mountain. Do you want to try going through the door?(yes/no)");
            door = scan.next();
            
            if(door.equals("yes")){
                if(weapon.equals("Mask")){
                    System.out.println("You put on your Fox Mask and tried opening the door");
                    System.out.println("The door was unlocked and you enter DR. Fox's layer.");
                    System.out.println("You wander around DR. Fox's Layer");
                    System.out.println("Eventually you hear clucking. Do you follow the noise of the clucking?(yes/no)");
                        
                    cluck = scan.next();
                        
                    if(cluck.equals("yes")){
                        System.out.println("You eventually make it to the are where the clucking is.");
                        System.out.println("You peak around the corner to see all of the chickens in a cage.");
                        System.out.println("The chickens are guarded by two Henchmen.");
                        System.out.println("You still have your Fox Mask on and walk out towards the gaurds.");
                        System.out.println("Your Mask works and they don't realize you aren't a hentchmen.");
                        System.out.println("You are approaching them what do you do?(talk/attack)");
                        action = scan.next();
                        if(action.equals("talk")){
                            System.out.println("You tell the hentchmen that DR. Fox needs them immediately, and that you are their to guard the chickens.");
                            System.out.println("The immediately know you are an intruder because they are Foxes and can't understand you.");
                            System.out.println("One of them attacks you, and the other runs to alert DR. Fox and get back up.");
                            System.out.println("Back up shows up and they are able to capture you.");
                            System.out.println("You have failed your mission.");
                        }
                        else if(action.equals("attack")){
                            System.out.println("When you get close enough, you surprise attack the two guards.");
                            System.out.println("Your plan works and you are able to defeat them.");
                            System.out.println("You then break the chickens out and now you need to escape.");
                            System.out.println("You look around and notice a vent in the wall");
                            System.out.println("How do you want to escape?(vent/other)");
                            escape = scan.next();
                            if(escape.equals("vent")){
                                System.out.println("You lead the chickens through the vent and outside, you signal for a helicopter.");
                                System.out.println("Everyone makes it onboard safely.");
                                System.out.println("Misson Accomplished. Good Work.");
                            }
                            else if(escape.equals("other")){
                                System.out.println("You wander through the tunnels with all of the chickens.");
                                System.out.println("Eventually other henchmen return to the empty cage and the knocked out guards.");
                                System.out.println("They alert DR.Fox and they begin searching the layer.");
                                System.out.println("You don't make it outside in time, and you are found and captured with all of the chickens.");
                                System.out.println("You have failed your mission.");
                            }
                        }
                    }
                
                    else if(cluck.equals("no")){
                    System.out.println("You decided to ignore the clucking and continue to crawl around in the vents.");
                    System.out.println("As you crawl around DR. Fox's henchmen hear you and they eventually track you down in the vents and capture you.");
                    System.out.println("You have failed your mission.");
                    }
                }
                else if(weapon.equals("Raquet")){
                    System.out.println("You try opening the door");
                    System.out.println("The door is unlocked, do you want to go in?(yes/no)");
                    goIn = scan.next();
                        
                    if(goIn.equals("yes")){
                        System.out.println("You walk in and are immediatly detected, after putting up a hard fight you are captured.");
                        System.out.println("You have failed your mission.");
                    }
                    else if(goIn.equals("no")){
                        System.out.println("You look around nearby and you notice a vent slightly open.");
                        System.out.println("You choose to go in that way.");
                        System.out.println("As you crawl through the vent you hear clucking.");
                        System.out.println("Do you want to go towards the clucking? (yes/no)");
                        cluck = scan.next();
                        if(cluck.equals("yes")){
                            System.out.println("As you crawl closer to the clucking you begin hearing barks from DR. Fox's Henchmen");
                            System.out.println("You crawl out of the vent, and peak around the corner to see all of the chickens in a cage.");
                            System.out.println("The chickens are guarded by two Henchmen.");
                            System.out.println("You notice a Tennis Ball on the ground and you get an idea.");
                            System.out.println("You take your Tennis Raquet and you hit the tennis ball down the hall past the gaurds.");
                            System.out.println("Your idea works and the henchmen take off after the ball.");
                            System.out.println("The Chickens are unguarded, you go up and break them out.");
                            System.out.println("How do you want to escape?(vent/other)");
                                
                            escape = scan.next();
                            if(escape.equals("vent")){
                                System.out.println("You lead the chickens through the vent and outside, you signal for a helicopter.");
                                System.out.println("Everyone makes it onboard safely.");
                                System.out.println("Misson Accomplished. Good Work.");
                            }
                            else if(escape.equals("other")){
                                System.out.println("You wander through the tunnels with all of the chickens.");
                                System.out.println("Eventually the henchmen return the the cage and find it empty.");
                                System.out.println("They alert DR.Fox and they begin searching the layer.");
                                System.out.println("You don't make it outside in time, and you are found and captured with all of the chickens.");
                                System.out.println("You have failed your mission.");
                            }
                        }
                        else if(cluck.equals("no")){
                            System.out.println("You decided to ignore the clucking and continue to crawl around in the vents.");
                            System.out.println("As you crawl around DR. Fox's henchmen hear you and they eventually track you down in the vents and capture you.");
                            System.out.println("You have failed your mission.");
                        }
                    }
                }
            }
            else if(door.equals("no")){
                System.out.println("You look around nearby and you notice a vent slightly open.");
                System.out.println("Do you want to go in using the vent?(yes/no)");
                vent = scan.next();
                if(vent.equals("yes")){
                    //Doing now
                    System.out.println("You choose to go in that way.");
                    System.out.println("As you crawl through the vent you hear clucking.");
                    System.out.println("Do you want to go towards the clucking? (yes/no)");
                    cluck = scan.next();
                    if(cluck.equals("yes")){
                        System.out.println("As you crawl closer to the clucking you begin hearing barks from DR. Fox's Henchmen");
                        System.out.println("You crawl out of the vent, and peak around the corner to see all of the chickens in a cage.");
                        System.out.println("The chickens are guarded by two Henchmen.");
                        if(weapon.equals("Raquet")){
                            System.out.println("You notice a Tennis Ball on the ground and you get an idea.");
                            System.out.println("You take your Tennis Raquet and you hit the tennis ball down the hall past the gaurds.");
                            System.out.println("Your idea works and the henchmen take off after the ball.");
                            System.out.println("The Chickens are unguarded, you go up and break them out.");
                            System.out.println("How do you want to escape?(vent/other)");
                            escape = scan.next();
                            if(escape.equals("vent")){
                                System.out.println("You lead the chickens through the vent and outside, you signal for a helicopter.");
                                System.out.println("Everyone makes it onboard safely.");
                                System.out.println("Misson Accomplished. Good Work.");
                            }
                            else if(escape.equals("other")){
                                System.out.println("You wander through the tunnels with all of the chickens.");
                                System.out.println("Eventually the henchmen return the the cage and find it empty.");
                                System.out.println("They alert DR.Fox and they begin searching the layer.");
                                System.out.println("You don't make it outside in time, and you are found and captured with all of the chickens.");
                                System.out.println("You have failed your mission.");
                            }
                        }
                        else if(weapon.equals("Mask")){
                            System.out.println("You put on your Fox Mask and walk out towards the gaurds.");
                            System.out.println("Your Mask works and they don't realize you aren't a hentchmen.");
                            System.out.println("You are approaching them what do you do?(talk/attack)");
                            action = scan.next();
                            if(action.equals("talk")){
                                System.out.println("You tell the hentchmen that DR. Fox needs them immediately, and that you are their to guard the chickens.");
                                System.out.println("The immediately know you are an intruder because they are Foxes and can't understand you.");
                                System.out.println("One of them attacks you, and the other runs to alert DR. Fox and get back up.");
                                System.out.println("Back up shows up and they are able to capture you.");
                                System.out.println("You have failed your mission.");
                            }
                            else if(action.equals("attack")){
                                System.out.println("When you get close enough, you surprise attack the two guards.");
                                System.out.println("Your plan works and you are able to defeat them.");
                                System.out.println("You then break the chickens out and now you need to escape.");
                                System.out.println("How do you want to escape?(vent/other)");
                                escape = scan.next();
                                if(escape.equals("vent")){
                                    System.out.println("You lead the chickens through the vent and outside, you signal for a helicopter.");
                                    System.out.println("Everyone makes it onboard safely.");
                                    System.out.println("Misson Accomplished. Good Work.");
                                }
                                else if(escape.equals("other")){
                                    System.out.println("You wander through the tunnels with all of the chickens.");
                                    System.out.println("Eventually other henchmen return the the cage empty and the two guards where knocked out.");
                                    System.out.println("They alert DR.Fox and they begin searching the layer.");
                                    System.out.println("You don't make it outside in time, and you are found and captured with all of the chickens.");
                                    System.out.println("You have failed your mission.");
                                }
                            }
                        }
                    }
                    else if(cluck.equals("no")){
                        System.out.println("You decided to ignore the clucking and continue to crawl around in the vents.");
                        System.out.println("As you crawl around DR. Fox's henchmen hear you and they eventually track you down in the vents and capture you.");
                        System.out.println("You have failed your mission.");
                    }
                }
                else if(vent.equals("no")){
                    System.out.println("You decide to look for a different way in.");
                    System.out.println("You wander around the mountain, you eventually get lost and are never heard from again.");
                    System.out.println("You have failed your mission.");
                }  
            }
        }
        else if(time.equals("day")){
            System.out.println("Unfortunately DR. Fox detected you while dropping in, they are on high alert.");
            System.out.println("you notice a door that leads into the layer.");
            System.out.println("As you approach the door, guards come running out.");
            System.out.println("They are able to capture you");
            System.out.println("You have failed your mission.");
        }
    }
}

