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
    //Color Variables
    Color bg = new Color(0x5995B3);
    //End Color Variables

    //Declaring the JRadioButtons for the selection
    private JRadioButton guiRB;
    private JRadioButton linkedListRB;
    private JRadioButton fileRB;
    private JRadioButton listenersRB;
    private JRadioButton recursiveRB;
    private JRadioButton stackRB;
    //End JRadioButtons

    //Declaring Class variables
    private GuiExample gui;
    private LinkedListExample linkedList;
    private FileReaderExample file;
    private ListenerExample listener;
    private RecursiveExample recursive;
    private StackExample stack;
    //End Class Variables

    //Declares the JButtons
    private JButton confirmSelection;
    //End JButtons

    //Declares the JLabels
    static JLabel output = new JLabel("Please make a selection!");
    //End JLables

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
        recursiveRB = new JRadioButton("Recursive Example");
        stackRB = new JRadioButton("Stack Example");
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

        //Adding JLabels to southPanel
        northPanel.add(output);
        //End Adding

        //Adding JPanels to interface
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);
        //End Adding

        //Sets Background colour to BG
        guiRB.setBackground(bg);
        linkedListRB.setBackground(bg);
        fileRB.setBackground(bg);
        listenersRB.setBackground(bg);
        recursiveRB.setBackground(bg);
        stackRB.setBackground(bg);

        southPanel.setBackground(bg);
        northPanel.setBackground(bg);
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
     *
     * @description ActionPerformed method
     *  Handles all of the actions within the JFrame
     */
    @Override
    public void actionPerformed(ActionEvent ae) {

        /**
         * Method checks to see which radio button is selected
         * Instantiates a new object of that class when
         * the confirm button is selected.
         */
        if (ae.getSource() == confirmSelection) {
            output.setForeground(Color.BLACK);
            if (guiRB.isSelected()) {
                output.setText("Starting " + guiRB.getText() + "...");
                new GuiExample();
            } else if (linkedListRB.isSelected()) {
                output.setText("Starting" + linkedListRB.getText() + "...");
                new LinkedListExample();
            } else if (fileRB.isSelected()) {
                output.setText("Starting " + fileRB.getText() + "...");
                new FileReaderExample();
            } else if (listenersRB.isSelected()) {
                output.setText("Starting " + listenersRB.getText() + "...");
                new ListenerExample();
            } else if (recursiveRB.isSelected()) {
                output.setText("Starting " + recursiveRB.getText() + "...");
                new RecursiveExample();
            } else if (stackRB.isSelected()) {
                output.setText("Starting " + stackRB.getText() + "...");
                new StackExample();
            } else {
                output.setForeground(new Color(0xDB2121));
                output.setText("Error: You must select to continue");
            }
        }//End if

    }//End actionPerformed method


    /**
     * main
     *
     * @description Creates the JFrame
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
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        //End Frame settings

    }//End main
}
