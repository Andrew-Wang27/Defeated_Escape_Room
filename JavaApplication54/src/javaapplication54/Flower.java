/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.util.Scanner; 
/**
 *
 * @author Gab
 */
public class Flower {
    static Couch couch = new Couch();
    static UserInterface ui = new UserInterface();
    static Room1 room1 = new Room1(); //room object
    Scanner keyboard = new Scanner(System.in);
    //String keyWords[] = {"throw", "smell"}; 
    void printStatement()
    {
        ui.printGameOutput("The aroma of flowers has grown. You feel around and\n"
                + "there are flowers in a glass vase.\n\n");
        ui.printGameOutput("What do you want to do with the flowers in the glass vase?\n\n"); 
        //looking for answers: THROW OR SMELL
        String userInput = ui.getGameInput();
        
        //room1.setUserInput(userInput); 
        ThrowOrSmell(userInput); 
    }
    void ThrowOrSmell(String u)
    {
        if(u.equalsIgnoreCase(room1.keyWords[4]))
        {
            ui.printGameOutput("You threw the vase\n"); 
            ui.printGameOutput("You managed to grab a piece of broken glass and cut yourself free!\n");
            ui.printGameOutput("You begin to feel your way through the dark and bump into a couch!\n");
            couch.printStatement();
        }
        else if(u.equalsIgnoreCase((room1.keyWords[5])))
        {
            ui.printGameOutput("The flowers smell beautifully\n");
            ui.printGameOutput("Now you are walking forward and bump into a couch!\n");
           couch.printStatement();
            
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

