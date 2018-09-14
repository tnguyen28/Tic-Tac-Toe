import javax.swing.*;

public class messageHandler {
    public static void playerXMessage(){
        JOptionPane.showMessageDialog(null, "player x's turn");
    }
    public static void playerYMessage(){
        JOptionPane.showMessageDialog(null, "player y's turn");
    }
    public static void playerWonMessage(){

    }
    public static void buttonAlreadyPressed(){
        JOptionPane.showMessageDialog(null, "This button has already been pressed.");
    }
}