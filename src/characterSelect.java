import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class characterSelect extends JFrame implements ActionListener {
    private JFrame f = new JFrame("Character Select");
    private JButton c1,c2,c3,c4,c5,c6,c7,c8,c9;

    public String xImage = "/images/redX.jpg";
    public String oImage = "/images/blue.jpg";

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

        c1 = new JButton();
        c2 = new JButton();
        c3 = new JButton();
        c4 = new JButton();
        c5 = new JButton();
        c6 = new JButton();
        c7 = new JButton();
        c8 = new JButton();
        c9 = new JButton();

        //Allows button to take action when pressed
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);
        c6.addActionListener(this);
        c7.addActionListener(this);
        c8.addActionListener(this);
        c9.addActionListener(this);

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
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == c1){
            //SET IMAGE TO CHARACTER
        }
    }
}