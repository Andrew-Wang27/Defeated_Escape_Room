/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

/**
 *
 * @author ahmed
 */
public class Toolbox {
    UserInterface ui = new UserInterface(); 
    Table table = new Table();
    String userInput = ""; 
    
    /**
     * printStatement describes the toolbox, location in the room, and what the user options are 
     * userInput is accepted and sent to method UnderOrCandle
     */
    void printStatement()
    {
        ui.printGameOutput("\n\nYou walked towards the workbench and examined the"
                + " toolbox. The toolbox is locked! \n"
                + "Enter a code to unlock the toolbox "); 
        userInput = ui.getPassword(); 
        code(userInput); 
    }
    
     void code(String u)
    {
        //ui.printGameOutput("\nEnter the code: \n");
        //userInput = ui.getGameInput(); 
        //userInput = ui.getPassword();
        if(userInput == null)
        {
            System.exit(0);
        }
        else if(keys.WAIKA.name().equals(userInput))
        {
            ui.printGameOutput("Congrats! You got the code right!\n"
                    + "You opened the toolbox and acquired the key"); 
        }
        else 
        {
            ui.printGameOutput("\nWrong code! What would you like to do now?\n"); 
            ui.printGameOutput("Enter TRYAGAIN or MOVE");
            tryAgainOrMove();
            
            
        }       
        
    }
     
     void tryAgainOrMove()
     {
        userInput = ui.getGameInput(); 
        if(userInput == null)
           {
               System.exit(0);
           }
           else if(keys.TRYAGAIN.name().equalsIgnoreCase(userInput))
           {
               printStatement();
           }
           else if(keys.MOVE.name().equalsIgnoreCase(userInput))
           {
               ui.printGameOutput("\nWhere do you want to go?");
               ui.printGameOutput("\nEnter CABINET or FURNACE");
               userInput = ui.getGameInput();
               table.CabinetOrFurnace(userInput);
           }
         
     }
}
