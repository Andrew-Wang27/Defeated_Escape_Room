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
public class Cards {
    UserInterface ui = new UserInterface(); 
    Table3 littletable = new Table3();
    bar Bar = new bar();
    String userInput = ""; 
    
    /**
     * printStatement describes the bar with a laptop, and what the user options are 
     * userInput is accepted and sent to method CODE.
     */
    void printStatement()
    {
        ui.printGameOutput("\n\nYou walked over by the cards. The cards are"
                + "randomly mixed on the floor. Each card has a letter.\n"
                + "The letters include:\n"
                + "H F R Y A S L U O L"); 
        ui.printGameOutput("\nWhere do you want to go?\n"
                + "Enter BAR or LITTLETABLE\n");
        userInput = ui.getGameInput(); 
        barOrLittleTable(userInput); 
    }

    /**
     * this method checks the userinput. if the input is ROYALFLUSH, the laptop and the user can either go to the POOLTABLE or LITTLETABLE.This input will be sent to the pooltableOrLittleTable method.
     * if the input is wrong then the user gets a choice of CARDS or DARTBOARD. This input will be sent to the cardsOrPoolTable method.
     * 
     * @param u 
     */

     void barOrLittleTable(String u)
    {
        
        if(u == null)
        {
            System.exit(0);
        }
        else if(keys.BAR.name().equalsIgnoreCase(u))
        {
            Bar.printStatement();

        }
        else if(keys.LITTLETABLE.name().equalsIgnoreCase(u))
        {
            littletable.printStatement();


        }     
        else
        {
            ui.printGameOutput("\nEnter a valid choice:");
            printStatement();
        }

    }
}
