import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class twoPlayer {
    private JFrame f = new JFrame("Two player mode");

    public twoPlayer() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel)f.getContentPane();
        panel.setLayout(new GridLayout(4,3,3,3));

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JButton b5 = new JButton();
        JButton b6 = new JButton();
        JButton b7 = new JButton();
        JButton b8 = new JButton();
        JButton b9 = new JButton();
        
        JLabel l1 = new JLabel("Hello world");
        l1.setForeground(Color.RED);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(l1);

        b1.setPreferredSize(new Dimension(100,100));

        f.setSize(500,500);
        f.getContentPane().setBackground(Color.BLACK);
        
        f.setVisible(true);

    }
}