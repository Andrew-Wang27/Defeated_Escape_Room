/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
/**
 *
 * @author Gab
 */
public class Couch {
    String userInput; 
    Room1 room1 = new Room1(); 
    //create a desk object here
    UserInterface ui = new UserInterface();
    Desk desk = new Desk();
    void printStatement()
    {
        //unsure if we should hint to the user that there might be something 
        //under these cushions?? to get the matches. Not sure yet. 
        ui.printGameOutput("What do you want to do?\n\n");
        userInput = ui.getGameInput(); 
        ExploreORLeft(userInput);
        //looking for either EXPLORE (to move cushions and find matches) OR LEFT towards desk
    }
    void ExploreORLeft(String u)
    {
        //handles exception thrown when user clicks cancel
        if(u == null)
        {
            System.exit(0); 
        }
        else if(keys.EXPLORE.name().equalsIgnoreCase(u))
        {
            //move the cushions to find a box of matches 
            ui.printGameOutput("While moving the cushions around, you find a small box\n"
                    + "with matches inside! Congrats, these might be useful for later.\n");
           desk.printStatement(); 
        }
        else if(keys.LEFT.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("Walking left, you run into a desk\n");
            desk.printStatement();
        }
         /*else if(u.equalsIgnoreCase(keyWords[7]))
        {
            //call timer class and function to display the time
            //call the opening scenario again 
        }*/
        else
        {
             //else = a word we dont recognize or a word that will not get the 
            //user out of this situation
            ui.printGameOutput("Sorry, we do not recognize that word\n"); 
            printStatement(); 
        }
    }
}

