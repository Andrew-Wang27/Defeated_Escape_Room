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
    void printStatement()
    {
        //unsure if we should hint to the user that there might be something 
        //under these cushions?? to get the matches. Not sure yet. 
        ui.printGameOutput("What do you want to do?\n\n");
        userInput = ui.getGameInput(); 
        MoveORLeft(userInput);
        //looking for either MOVE (to move cushions and find matches) OR LEFT towards desk
    }
    void MoveORLeft(String u)
    {
        //set this function up exactly like the function from the flowers file.
        if(u.equalsIgnoreCase(room1.keyWords[0]))
        {
            //move the cushions to find a box of matches 
            ui.printGameOutput("While moving the cushions around, you find a small box\n"
                    + "with matches inside! Congrats, these might be useful for later.\n");
           // desk.printStatement(); 
        }
        else if(u.equalsIgnoreCase(room1.keyWords[3]))
        {
            ui.printGameOutput("Walking left, you run into a desk\n");
            //desk.printStatement();
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

