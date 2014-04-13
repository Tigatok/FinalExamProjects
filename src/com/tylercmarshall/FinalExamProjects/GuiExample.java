package com.tylercmarshall.FinalExamProjects;

import javax.swing.*;
import java.awt.event.WindowEvent;

/**
 * Created by Tyler on 4/12/2014.
 */
public class GuiExample extends JFrame {
    public GuiExample() {
        //Frame Settings
        JFrame frame = new JFrame();
        frame.setTitle("Gui Example - Started");
        frame.setVisible(true);
        frame.pack();
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        System.out.println("Starting GuiExample...");
        //End Frame Settings


        /**
         * Sets the output text to ended on the
         * Interface GUI
         */
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                Interface.output.setText("GuiExample ended. Please select another example!");
            }
        }); //End WindowListener
    }
}
