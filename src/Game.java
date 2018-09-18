import java.util.*;
import javax.swing.*;

public class Game {

    public Game(){
    }

    public void checkVictory(String gameBoard[][], JFrame frame){
            for(int i = 0; i < 2; i++){
                if(gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2])){
                    if(gameBoard[i][0].equals("x")){
                        messageHandler.playerXWonMessage(frame);
                        break;
                    } else if (gameBoard[i][0].equals("o")){
                        messageHandler.playerYWonMessage(frame);
                        break;
                    
                    }
                } else if(gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[2][i].equals(gameBoard[2][i])){
                    if(gameBoard[0][i].equals("x")){
                        messageHandler.playerXWonMessage(frame);
                        break;
                   
                    } else if (gameBoard[0][i].equals("o")){
                        messageHandler.playerYWonMessage(frame);
                        break;
                        
                    }
                } else if(gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[0][0].equals(gameBoard[2][2])){
                    if(gameBoard[0][0].equals("x")){
                        messageHandler.playerXWonMessage(frame);
                        break;
                    
                    } else if (gameBoard[0][0].equals("o")){
                        messageHandler.playerYWonMessage(frame);
                        break;
                       
                    }
                } else if(gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[0][2].equals(gameBoard[2][0])){
                    if(gameBoard[0][2].equals("x")){
                        messageHandler.playerXWonMessage(frame);
                        break;
                   
                    } else if (gameBoard[0][2].equals("o")){
                        messageHandler.playerYWonMessage(frame);
                        break;
                      
                    }
                } else {
                    messageHandler.gameTie(frame);
                    break;
                }
            }
    }

}