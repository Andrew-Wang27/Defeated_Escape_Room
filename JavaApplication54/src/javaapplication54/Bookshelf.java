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
public class Bookshelf {
 //add class objects here to access their functions
    UserInterface ui = new UserInterface(); 
    CracktheCode code = new CracktheCode(); 
    Painting painting = new Painting(); 
    String userInput = " "; 
    
    void printStatement()
    {
        ui.printGameOutput("You are standing in front of a bookshelf with 5 books on the shelves.\n"
                + "You open each book and flip through the pages. In each book,\n"
                + "there is a note with a letter on it. The letters are: KIAAW\n\n"
                + "What do you want to do now?");
        userInput = ui.getGameInput(); 
        CodeOrPainting(userInput); 
    }
    
    void CodeOrPainting(String u)
    {
        if(u == null)
        {
            System.exit(0); 
        }
        else if(keys.CODE.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nYou walk back over to the desk to attempt the code.\n");
            code.code();
        }
        else if(keys.PAINTING.name().equalsIgnoreCase(u))
        {
            ui.printGameOutput("\nYou walk over to the painting above the couch.\n");
            painting.printStatement(); 
        }
        else
        {
            ui.printGameOutput("Sorry, we do not recognize that word\n"); 
            printStatement(); 
        }
    }
    
    //all pseudocode below has been implemented**************************
    /*
    void printStatement--no arguments
         print:  “there is a bookshelf with 5 books. You open each book and flip through the pages. 
        You notice that in each book, there is a note with a letter on each. You realize, 
        the letters may be used to unlock the drawer. The letters are: kiaaw"
    
        ask user what they want to do
    
        get userInput
        send userInput to CodePainting function
        end of function
    
    void CodePainting(userInput)
        if userinput = code 
            call code function of code class 
    else if userinput = painting
            call painting print scenario 
    else if userinput= timer
            call timer
            call printstatement of bookshelf
    else 
        ERROR statement 
        call printstatement of bookshelf
    
        
    */
}

