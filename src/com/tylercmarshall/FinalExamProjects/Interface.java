package com.tylercmarshall.FinalExamProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tyler on 4/12/2014.
 */

public class Interface extends JPanel implements ActionListener {

    private static final long serialVersionUID = 42L;
    //Color Varialbe
    Color bg = new Color(0x5995B3);
    //Declaring the JRadioButtons for the selection
    private JRadioButton guiRB;
    private JRadioButton linkedListRB;
    private JRadioButton fileRB;
    private JRadioButton listenersRB;
    private JRadioButton recursiveRB;
    //End JRadioButtons
    private JRadioButton stackRB;
    //Declaring Class variables
    private GuiExample gui;
    private LinkedListExample linkedList;
    private FileReaderExample file;
    private ListenerExample listener;
    private RecursiveExample recursive;
    //End Class Variables
    private StackExample stack;
    //End JButtons
    //Declares the JButtons
    private JButton confirmSelection;

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

        //Aligns the JRadioButtons to the center of each Cell
        guiRB.setHorizontalAlignment(AbstractButton.CENTER);
        linkedListRB.setHorizontalAlignment(AbstractButton.CENTER);
        fileRB.setHorizontalAlignment(AbstractButton.CENTER);
        listenersRB.setHorizontalAlignment(AbstractButton.CENTER);
        recursiveRB.setHorizontalAlignment(AbstractButton.CENTER);
        stackRB.setHorizontalAlignment(AbstractButton.CENTER);
        //End Alignment

        //Adding JRadioButtons to centerPanel
        centerPanel.add(guiRB);
        centerPanel.add(linkedListRB);
        centerPanel.add(fileRB);
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

        //Sets Background colour to BG
        guiRB.setBackground(bg);
        linkedListRB.setBackground(bg);
        fileRB.setBackground(bg);
        listenersRB.setBackground(bg);
        recursiveRB.setBackground(bg);
        stackRB.setBackground(bg);
        southPanel.setBackground(bg);
        //End Settings

        //Listener Settings
        guiRB.addActionListener(this);
        linkedListRB.addActionListener(this);
        fileRB.addActionListener(this);
        listenersRB.addActionListener(this);
        recursiveRB.addActionListener(this);
        stackRB.addActionListener(this);
        confirmSelection.addActionListener(this);
        //End Settings

    }//End Interface Constructor

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
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //End Frame settings
        System.out.println("test");

    }//End main

    /**
     *
     * @description ActionPerformed method
     */
    @Override
    public void actionPerformed(ActionEvent ae) {

        /**
         * Method checks to see which radio button is selected
         * Instantiates a new object of that class when
         * the confirm button is selected.
         */
        if (ae.getSource() == confirmSelection) {
            if (guiRB.isSelected()) {
                gui = new GuiExample();
            }

            else if (linkedListRB.isSelected())
                linkedList = new LinkedListExample();

            else if (fileRB.isSelected())
                file = new FileReaderExample();

            else if (listenersRB.isSelected())
                listener = new ListenerExample();

            else if (recursiveRB.isSelected())
                recursive = new RecursiveExample();

            else if (stackRB.isSelected())
                stack = new StackExample();

            else
                System.err.println("Error\n\tPlease make a selection!");
        }

    }
}
