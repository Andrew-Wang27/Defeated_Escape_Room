/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.*;
import java.util.*;
import java.util.Scanner; 
/**
 *
 * @author Gab
 */

//room 1 class. 
//contains room1 functions and calls other files
//files include "objects" scattered around the room that the user can interact with
public class Room1 {
    public static final String keyWords[] = {"move", "wait", "right", "left", "throw", "smell", "forward", "timer", "phone", "lamp", "code", "bookshelf", "painting"};
    static UserInterface ui = new UserInterface();
    Scanner keyboard = new Scanner(System.in); 
    Room1(){}
    String userInput;
    //the setters and getters go here
    String getUser()
    {
        return userInput;
    }
    
    //gets called from the main
    //explains the opening scenario for the user
    //takes in userinput and passes it to another function to decide where to send the user
    void OpeningScenario()
    {
        //set the room1 scene for the user
        ui.printGameOutput("You wake up in a dark room, tied to a chair.\n"
                + "You are able to free one arm, but the other is tied too tightly.\n"
                + "Both legs are tied to the chair legs and cannot move.\n"
                + "You cannot see anything in the room, but your sense of smell has picked\n"
                + "up the aroma of flowers. You need to escape.\n\n"); //expand later
        
        //ask the user what they want to do
        //the answers we are looking for: either move or wait
        ui.printGameOutput("What do you want to do?\n\n"); //expand later to describe number value
        userInput = ui.getGameInput();
         
        //call the move or wait function to find out what the user typed in
        MoveOrWait(userInput);
        
    }
    //this function decides where to send the user, depending on if they chose
    //to MOVE or to WAIT
    void MoveOrWait(String u)
    {
        //if the user entered move, then prompt the user 
        if(u.equalsIgnoreCase(keyWords[0]))
        {
            ui.printGameOutput("You have decided to move! In which direction would you like to move?\n\n");
            //the answer we are looking for here is left or right
            userInput = ui.getGameInput();  
            //call the flowers or fall function. 
            //pass the userinput 
            FlowersORFall(userInput); 
        }
        else if(u.equalsIgnoreCase(keyWords[1]))
        {
            //if the user entered WAIT, then they eat up 10 minutes from the clock
            ui.printGameOutput("You have decidedd to wait!\n"); 
            ui.printGameOutput("10 minutes has been docked from the timer!\n");
            //display timer here?????
            OpeningScenario(); //call the opening scenario again, until user enters MOVE
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
            OpeningScenario(); 
        }
        
        
    }
    void FlowersORFall(String u)
    {
        //if user types right
        if(u.equalsIgnoreCase(keyWords[2]))
        {
             Flower flower = new Flower(); 
             flower.printStatement();
        }
        //if user types left
        else if(u.equalsIgnoreCase(keyWords[3]))
        {
            getKnife knife = new getKnife(); 
            knife.printStatement(); 
        }
         /*else if(u.equalsIgnoreCase(keyWords[7]))
        {
            //call timer class and function to display the time
            //call the opening scenario again 
        }*/
        else
        {
            ui.printGameOutput("Sorry, we do not recognize that word\n");
            ui.printGameOutput("Which direction would you like to move?");
            userInput = ui.getGameInput();
            FlowersORFall(userInput);
        }
       
     

    }
    
}

