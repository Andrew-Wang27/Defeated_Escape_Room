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
public class DartBoard {
    UserInterface ui = new UserInterface(); 
    String userInput = ""; 
    /**
     * method prints a description of the dartboard 
     * asks for user input: CARDS or TABLE
     * passes user input to CardsOrTable method
     */
    void printStatement()
    {
        ui.printGameOutput("\nThe dartboard is hung on the wall with 8 darts scattered\n"
                + "around the board. Half are at 10 points and the other half are on 2 points.\n"
                + "Do you want to investigate the CARDS on the floor or\n"
                + "the small TABLE with objects littered across it?\n"); 
        userInput = ui.getGameInput();
        CardsOrTable(userInput);
    }
    /**
     * if user entered CARDS - cards object and print statement called (commented out for now)
     * if user entered TABLE - table object and print statement called
     * @param u - userinput passed from print statement method
     */
    void CardsOrTable(String u)
    {
        if(u == null)
        {
            System.exit(0); 
        }
        else if(keys.CARDS.name().equalsIgnoreCase(u))
        {
           //Cards cards = new Cards(); 
           //cards.printStatement(); 
        }
        else if(keys.TABLE.name().equalsIgnoreCase(u))
        {
            //Table3 table3 = new Table3(); 
            //table3.printStatement(); 
        }
        else
        {
            ui.printGameOutput("\nSorry, we do not recognize that word\n"); 
            printStatement();  
        }
    }
}
