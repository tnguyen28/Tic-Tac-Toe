import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;


public class characterSelect {
    private JFrame f = new JFrame("Character Select");

    //Checks if the tile has already been pressed
    Boolean b1Check = false;
    Boolean b2Check = false;
    Boolean b3Check = false;
    Boolean b4Check = false;
    Boolean b5Check = false;
    Boolean b6Check = false;
    Boolean b7Check = false;
    Boolean b8Check = false;
    Boolean b9Check = false;

    public characterSelect() {
        JPanel panel = (JPanel)f.getContentPane();
        panel.setLayout(new GridLayout(3,3,4,3));

        JButton c1 = new JButton();
        JButton c2 = new JButton();
        JButton c3 = new JButton();
        JButton c4 = new JButton();
        JButton c5 = new JButton();
        JButton c6 = new JButton();
        JButton c7 = new JButton();
        JButton c8 = new JButton();
        JButton c9 = new JButton();

        //Allows button to take action when pressed
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(c5);
        panel.add(c6);
        panel.add(c7);
        panel.add(c8);
        panel.add(c9);

        c1.setPreferredSize(new Dimension(100,100));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.getContentPane().setBackground(Color.BLACK);
        f.setVisible(true);
        tttGame.centerFrame(f);
    }
}