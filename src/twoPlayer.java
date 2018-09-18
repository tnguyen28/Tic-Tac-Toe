import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class twoPlayer extends JFrame implements ActionListener{
   // private JFrame f = new JFrame("Two player mode");
    private String[][] gameBoard = new String[3][3];
    private int count = 0;

    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JLabel playerLabel;
    private String playerTurn = "x";

    String imageX = "src/redX.jpg";
    String imageO = "src/blueO";

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

    public twoPlayer() {

        //Allows players to click a tile to draw their turn
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();

        //shows what player turn it is
        playerLabel = new JLabel();
        playerLabel.setForeground(Color.RED);

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

        //adds button to jframe
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(playerLabel);

        //sets the size for first button which defaults the others to the same size
        b1.setPreferredSize(new Dimension(100,100));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,3,3,3));
        setSize(500,500);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);

    }
    //button interactions
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            if(b1Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[0][0] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[0][0] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b1);
                b1Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }

        }
        if(ae.getSource() == b2){
            if(b2Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[0][1] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[0][1] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b2);
                b2Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b3){
            if(b3Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[0][2] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[0][2] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b3);
                b3Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b4){
            if(b4Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[1][0] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[1][0] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b4);
                b4Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b5){
            if(b5Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[1][1] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[1][1] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b5);
                b5Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b6){
            if(b6Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[1][2] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[1][2] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b6);
                b6Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b7){
            if(b7Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[2][0] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[2][0] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b7);
                b7Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b8){
            if(b8Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[2][1] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[2][1] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b8);
                b8Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }     
        if(ae.getSource() == b9){
            if(b9Check == false){
                //places tile into logic game
                if(playerTurn.equals("x")){
                    gameBoard[2][2] = "x";
                    System.out.println(Arrays.deepToString(gameBoard));
                } else if(playerTurn.equals("o")){
                    gameBoard[2][2] = "o";
                    System.out.println(Arrays.deepToString(gameBoard));
                }
                buttonPressed(b9);
                b9Check = true;
            } else {
                messageHandler.buttonAlreadyPressed();
            }
        }
    }

    //If a button is pressed, it changes the turn and shows an alert to see whose turn it is
    public void buttonPressed(JButton button){
        count++;
        if(playerTurn.equals("x")) {
            changeXImage(button);
            checkForWinner();
            playerTurn = "o";
            playerLabel.setText("player o's turn");

            messageHandler.playerYMessage();

        } else if(playerTurn.equals("o")){
            changeOImage(button);
            checkForWinner();
            playerTurn = "x";
           playerLabel.setText("player x's turn");

           messageHandler.playerXMessage();
        }


    }
    public void checkForWinner(){
        Game g = new Game();
        if(count >= 5){
            g.checkVictory(gameBoard);
        } else {
            System.out.println("impossible to have a winner so far.");
        }
    }
    
    //Changes the buttton's icon image to corresponding turn
    public void changeOImage(JButton b){
        try{
            java.net.URL imgURL = getClass().getResource("/images/blue.jpg");
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);
            b.setIcon(icon);
            b.setBorder(BorderFactory.createEmptyBorder());
        } catch(Exception e) {
            e.printStackTrace();
        
        }

    }
    public void changeXImage(JButton b){
        try{
            java.net.URL imgURL = getClass().getResource("/images/redX.jpg");
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage();
            Image scaledImg = img.getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImg);
            b.setIcon(icon);
            b.setBorder(BorderFactory.createEmptyBorder());
        } catch(Exception e) {
            e.printStackTrace();
        
        }
    }
}