import java.util.*;

public class Game {
    private static String[][] gameBoard = new String[3][3];

    public Game(){
    }

    public void checkVictory(String gameBoard[][]){
            for(int i = 0; i < 2; i++){
                if(gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2])){
                    if(gameBoard[i][0].equals("x")){
                        messageHandler.playerXWonMessage();
                        break;
                    } else if (gameBoard[i][0].equals("o")){
                        messageHandler.playerYWonMessage();
                        break;
                    }
                } else if(gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[2][i].equals(gameBoard[2][i])){
                    if(gameBoard[0][i].equals("x")){
                        messageHandler.playerXWonMessage();
                        break;
                    } else if (gameBoard[0][i].equals("o")){
                        messageHandler.playerYWonMessage();
                        break;
                    }
                } else if(gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[0][0].equals(gameBoard[2][2])){
                    if(gameBoard[0][0].equals("x")){
                        messageHandler.playerXWonMessage();
                        break;
                    } else if (gameBoard[0][0].equals("o")){
                        messageHandler.playerYWonMessage();
                        break;
                    }
                } else if(gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[0][2].equals(gameBoard[2][0])){
                    if(gameBoard[0][2].equals("x")){
                        messageHandler.playerXWonMessage();
                        break;
                    } else if (gameBoard[0][2].equals("o")){
                        messageHandler.playerYWonMessage();
                        break;
                    }
                } else {
                    System.out.println("No winner yet");
                    break;
                }
            }
    }
}