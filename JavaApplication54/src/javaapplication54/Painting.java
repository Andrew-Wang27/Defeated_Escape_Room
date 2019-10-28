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
public class Painting {
  String userInput = " "; 
    UserInterface ui = new UserInterface(); 
    void printStatement()
    {
        ui.printGameOutput("The painting is of Toto and Dorothy from the Wizard of Oz\n"
                + "walking down the yellow brick road. There is a quote written\n"
                + "at the bottom: We Aren't In Kansas Anymore\nWhat do you want to do now?"); 
        userInput = ui.getGameInput(); 
        CodeBookshelf(userInput); 
    }
    void CodeBookshelf(String u)
    {
        if(u == null)
        {
            System.exit(0); 
        }
        else if(keys.CODE.name().equalsIgnoreCase(u))
       {
           CracktheCode code = new CracktheCode(); 
           code.code(); 
       }
       else if(keys.BOOKSHELF.name().equalsIgnoreCase(u))
       {
           Bookshelf bookshelf = new Bookshelf();
           bookshelf.printStatement();
       }
       else
        {
            ui.printGameOutput("Sorry, we do not recognize that word\n");
            printStatement(); 
        }
    }
    /*
    void printStatement
    print: painting of wizard of oz w/ quote "We arent in Kansas anymore"
    ask user what they want to do
    get userinput 
    call CodeBookshelf w/userinput as argument
    
    
    void CodeBookshelf(userInput)
     if userinput = code 
            call code function of code class 
    else if userinput = bookshelf
            call bookshelf print scenario 
    else if userinput= timer
            call timer
            call printstatement of bookshelf
    else 
        ERROR statement 
        call printstatement of bookshelf
    */
}