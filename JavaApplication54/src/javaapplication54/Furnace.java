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
public class Furnace {
    UserInterface ui = new UserInterface(); 
    Toolbox toolbox = new Toolbox();
    FilingCabinet cabinet = new FilingCabinet();
    String userInput = ""; 
    
    void printStatement()
    {
        ui.printGameOutput("\n\nYou walked towards the furnace. It is a very "
                + "old and rusty furnace but you are able to read the model number."
                + " The model number is: 46 AJD 0605"); 
        ui.printGameOutput("\nWhere do you want to go?");
        ui.printGameOutput("\nEnter TOOLBOX or CABINET");
        userInput = ui.getGameInput(); 
        ToolBoxOrCabinet(userInput); 
    }
    
    void ToolBoxOrCabinet(String u)
    {
        if(userInput == null)
        {
            System.exit(0);
        }
        else if(keys.TOOLBOX.name().equalsIgnoreCase(userInput))
        {
            toolbox.printStatement();
        }
        else 
        {
            cabinet.printStatement();
            
        }       
    }
}
