/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.*;
import java.util.*;
/**
 *
 * @author Guest 1
 */
public class JavaApplication54 {

   static Room1 room1 = new Room1(); 
    static UserInterface ui = new UserInterface(); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get user input
        ui.setInterface();
        int userInput;
        Scanner keyboard = new Scanner(System.in); 
        //welcoming message
        //System.out.println("Welcome!"); 
        ui.printGameOutput("Welcome to Escape Room!\n The rules are as follows:\n" +
                "1. You have 1 hour to escape these rooms.\n"
                + "2. Enter key words to move ahead in the game\n"
                + "***Correct input will only be ONE word long***\n"
                + "Helpful key words: MOVE, WAIT, THROW, LEFT, RIGHT, FORWARD...\n"
                + "The first room will now begin\nGOOD LUCK\n\n\n");
        
        
        //open room 1
        room1.OpeningScenario();
    }
    }
    
}
