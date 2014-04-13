package com.tylercmarshall.FinalExamProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Created by Tyler on 4/12/2014.
 */
public class GuiExample extends JPanel implements ActionListener {

    private JRadioButton blue = new JRadioButton("Blue");
    private JRadioButton red = new JRadioButton("Red");
    ;
    private JRadioButton green = new JRadioButton("Green");
    ;

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
        newFrame();
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void newFrame() {
//
        setLayout(new BorderLayout());
        //

        //
        JPanel centerPanel = new JPanel();
        JPanel southPanel = new JPanel();
        //

        southPanel.setLayout(new GridLayout(3, 1));


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(blue);
        buttonGroup1.add(red);
        buttonGroup1.add(green);

        //
        blue.setHorizontalAlignment(AbstractButton.CENTER);
        red.setHorizontalAlignment(AbstractButton.CENTER);
        green.setHorizontalAlignment(AbstractButton.CENTER);
        //

        southPanel.add(blue);
        southPanel.add(red);
        southPanel.add(green);

        //
        blue.addActionListener(this);
        red.addActionListener(this);
        green.addActionListener(this);
        //

        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

        System.out.println("done:)");
    }
}
