package com.tylercmarshall.FinalExamProjects;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by Tyler on 4/12/2014.
 */

public class Interface extends JPanel implements ActionListener {

    private static final long serialVersionUID = 42L;

    //Declaring the Radio Buttons for the selection
    private JRadioButton guiRB;
    private JRadioButton linkedListRB;
    private JRadioButton fileRB;
    private JRadioButton listenersRB;
    private JRadioButton recursiveRB;
    private JRadioButton stackRB;
    //End RadioButtons

    //Instantiates the Buttons
    private JButton confirmSelection = new JButton("Confirm");
    //End Buttons






    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        //Instantiates a new JFrame object
        JFrame frame = new JFrame();
        //End JFrame

        //Instantiates a new Interface Object
        Interface inter = new Interface();
        //End Interface

        //Frame Settings
        frame.setTitle("Interface - Select an Item");
        frame.add(inter);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //End Frame settings
    }
}
