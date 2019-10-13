/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;
import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author Gab
 */
public class UserInterface extends JFrame{
    static private JTextArea gameText;
    static Scanner keyboard;
    static JFrame frame;
    
    static final int FRAME_LENGTH = 800;
    static final int FRAME_WIDTH = 600;
    
    static final String GAME_TEXT = "The Defeated Presents: Escape Room";
    static final String DEFAULT_PROMPT = "> ";
    
     /**
     * Constructor - set up JFRAME for Game Output
     */
    UserInterface() {}
    void setInterface()
    {
        frame = new JFrame();
        frame.add( new JLabel(GAME_TEXT ), BorderLayout.NORTH );

        gameText = new JTextArea();
        gameText.setLineWrap(true);
        gameText.setWrapStyleWord(true);

        frame.add(new JScrollPane(gameText));

        // frame.pack();   not needed for now, revisit
        frame.setVisible( true );
        frame.setSize(FRAME_WIDTH,FRAME_LENGTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // was used for gameInput2() method
        //   no longer used w/ switch to JOptionPane
        keyboard = new Scanner(System.in);
        
    }
    static void printGameOutput(String printString) {
        gameText.append(printString);
    }
    static void printConsole(String printString) {
        System.out.print(printString);
    }
     static String getGameInput(String output) {
        String input = JOptionPane.showInputDialog(frame, output);
        return input;
    }
    static String getGameInput() {
        String input = JOptionPane.showInputDialog(frame, DEFAULT_PROMPT);
        return input;
    }
    /*
    static String getGameInput2() {
        String userInput = keyboard.nextLine();
        return (userInput);
    }
    static String getGameInput2(String output) {
        System.out.print(output);
        return getGameInput2();
    }*/
}

