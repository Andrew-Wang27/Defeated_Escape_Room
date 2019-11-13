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
public class FilingCabinet {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    
    /**
     * printStatement describes the filing cabinet and what the user options are 
     * userInput is accepted and sent to method YesOrNo
     */
    void printStatement()
    {
        ui.printGameOutput("\n\nThe filing cabinet is large with one drawer "
                + "that does not appear to be locked.\n Would you like to open it?\n"
                + "Enter YES or NO"); 
        userInput = ui.getGameInput(); 
        YesOrNo(userInput); 
    }
    
    /**
     * YesOrNo method accepts userInput and compares it to YES or NO key words
     * If user enters YES then ask for a file number to read, pass this String to method File
     * If user enters NO then asks user whether they want to go to the Furnace or stay at the cabinet
     * Input under NO is passed to a method in the Table file called CabinetOrFurnace
     * @param u - userInput String passed from the printStatement
     */
    void YesOrNo(String u)
    {
        if(u == null)
        {
            System.exit(0); 
        }
        else if(keys.YES.name().equalsIgnoreCase(u))
        {
            
            ui.printGameOutput("\n\nThe drawer slides open and creaks loudly. Inside\n"
                    + "there are around 20 files stuffed with papers.\n"
                    + "Enter a number in the range of 1-20 to investigate. ");
            userInput = ui.getGameInput(); 
            File(userInput); 
        }
        else if(keys.NO.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nDo you want to go to the FURNACE or stay at the CABINET?");
            userInput = ui.getGameInput(); 
            Table table = new Table(); 
            table.CabinetOrFurnace(userInput);
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
    }
    /**
     * File method accepts user input and compares it to different file numbers
     * is user enters 18 (the desired file number), output will be displayed that contains secret code
     * any other file number entered (in 1-20 range) will have a random file content displayed (meaningless)
     * all options given 3 options: FURNACE, TOOLBOX, or CABINET
     * @param u - userInput String passed from YesOrNo method
     */
    void File(String u)
    {
        if(u == null)
        {
            System.exit(0); 
        }
        else if(u.equals("18"))
        {
            ui.printGameOutput("\nThe file says: 1002 Park Ave, Florham Park, NJ");
            ui.printGameOutput("\nWould you like to go to the TOOLBOX, FURNACE, or stay at the CABINET?"); 
            userInput = ui.getGameInput(); 
            ToolBoxOrFurnaceOrCabinet(userInput); 
        }
        else if(u.equals("4") || u.equals("20") || u.equals("11")|| u.equals("8") || u.equals("15") || u.equals("10")|| u.equals("17"))
        {
            ui.printGameOutput("\nThe file says: YOU'LL NEVER LEAVE THIS ROOM\n"); 
            ui.printGameOutput("Would you like to go to the TOOLBOX, FURNACE or stay at the CABINET?"); 
            userInput = ui.getGameInput(); 
            ToolBoxOrFurnaceOrCabinet(userInput); 
        }
        else if(u.equals("1") || u.equals("13") || u.equals("5") || u.equals("19") || u.equals("7") || u.equals("12")|| u.equals("16"))
        {
            ui.printGameOutput("\nThe file says: YOU AREN'T SMART ENOUGH TO ESCAPE\n"); 
            ui.printGameOutput("Would you like to go to the TOOLBOX, FURNACE or stay at the CABINET?"); 
            userInput = ui.getGameInput(); 
            ToolBoxOrFurnaceOrCabinet(userInput); 
        }
         else if(u.equals("2") || u.equals("3") || u.equals("6") || u.equals("7") || u.equals("9") || u.equals("14"))
        {
            ui.printGameOutput("\nThe file says: HAHA\n"); 
            ui.printGameOutput("Would you like to go to the TOOLBOX, FURNACE or stay at the CABINET?"); 
            userInput = ui.getGameInput(); 
            ToolBoxOrFurnaceOrCabinet(userInput); 
        }
        
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that file number\n"); 
            ui.printGameOutput("\nEnter a number 1 - 20\n");  
            userInput = ui.getGameInput(); 
            File(userInput);
        }
    }
    /**
     * if user enters TOOLBOX - object created of that class and print statement called
     * if user enters FURNACE - object created of that class and print statement called
     * if user enters CABINET - user prompted to enter another file number (user input sent to File method)
     * @param u - userinput from File method
     */
    void ToolBoxOrFurnaceOrCabinet(String u)
    {
        if(u == null)
        {
            System.exit(0); 
        }
        else if(keys.TOOLBOX.name().equalsIgnoreCase(u))
        {
            //Toolbox toolbox = new Toolbox();
            //toolbox.printStatement(); 
        }
        else if(keys.FURNACE.name().equalsIgnoreCase(u))
        {
            //Furnace furnace = new Furnace(); 
            //furnace.printStatement(); 
        }
        else if(keys.CABINET.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nEnter a file 1-20:\n");
            userInput = ui.getGameInput(); 
            File(userInput); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            ui.printGameOutput("Would you like to go to the TOOLBOX, FURNACE or stay at the CABINET?"); 
            userInput = ui.getGameInput(); 
            ToolBoxOrFurnaceOrCabinet(userInput);
        }
    }
}