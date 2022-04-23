package edu.vt.cs5044;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * ButtonDemo class for Homework 6
 *
 * @author James Smith
 * @version 1.0
 *
 */
public class ButtonDemo extends JPanel implements ActionListener
{
    JButton button;

    public ButtonDemo()
    {
        button = new JButton("Click me!");

        button.addActionListener(this);

        this.add(button);
    }

    public void actionPerformed(ActionEvent e)
    {
        button.setText("Ouch!");
    }

    private static void createAndShowGUI()
    {
        JFrame frame = new JFrame("ButtonDemo by jfs8888");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new ButtonDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();

            }
        });
    }

}