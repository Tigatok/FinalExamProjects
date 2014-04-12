package com.tylercmarshall.FinalExamProjects;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by Tyler on 4/12/2014.
 */

public class Interface extends JPanel implements ActionListener {

    private static final long serialVersionUID = 42L;

    //Declaring the JRadioButtons for the selection
    private JRadioButton guiRB;
    private JRadioButton linkedListRB;
    private JRadioButton fileRB;
    private JRadioButton listenersRB;
    private JRadioButton recursiveRB;
    private JRadioButton stackRB;
    //End JRadioButtons

    //Declares the JButtons
    private JButton confirmSelection;
    //End JButtons


    /**
     * interface
     *
     * @description Loads the interface settings
     */
    public Interface() {

        //Sets the layout to BorderLayout
        setLayout(new BorderLayout());
        //End Layout Settings

        //JPanel instantiations
        JPanel centerPanel = new JPanel();
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel westPanel = new JPanel();
        //End JPanels

        //JButtonGroup Instantiations
        ButtonGroup buttonGroup1 = new ButtonGroup();
        //End JButtonGroups

        //JRadioButton Instantiations
        guiRB = new JRadioButton("Gui Example");
        linkedListRB = new JRadioButton("Linked List Example");
        fileRB = new JRadioButton("File I/O Example");
        listenersRB = new JRadioButton("Listeners Example");
        recursiveRB = new JRadioButton("Recursive Examples");
        stackRB = new JRadioButton("Stack Examples");
        //End JRadioButtons Instantiations

        //JButton Instantiations
        confirmSelection = new JButton("Confirm");
        //End Button instantiations


        //centerPanel settings
        centerPanel.setLayout(new GridLayout(2, 3));
        //End centerPanel settings

        //Adding JRadioButtons to buttonGroup1
        buttonGroup1.add(guiRB);
        buttonGroup1.add(linkedListRB);
        buttonGroup1.add(fileRB);
        buttonGroup1.add(listenersRB);
        buttonGroup1.add(recursiveRB);
        buttonGroup1.add(stackRB);
        //End Adding

        //Adding JRadioButtons to centerPanel
        centerPanel.add(guiRB);
        centerPanel.add(linkedListRB);
        centerPanel.add(fileRB);
        centerPanel.add(linkedListRB);
        centerPanel.add(listenersRB);
        centerPanel.add(recursiveRB);
        centerPanel.add(stackRB);
        //End Adding

        //Adding JButtons to southPanel
        southPanel.add(confirmSelection);
        //End Adding

        //Adding JPanels to interface
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        //End Adding

    }//End Interface Constructor


    /**
     *
     * @description ActionPerformed method
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     *main
     *  @description Creates the JFrame
     */
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

    }//End main
}
