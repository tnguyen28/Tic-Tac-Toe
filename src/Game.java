import java.util.*;

public class Game {
    private static String[][] gameBoard = new String[3][3];

    public Game(){
    }
    // public boolean checkForWinner(String[][] gb){
    //     for(int i = 0; i < 3; i++){
    //         if(){

    //         }
    //     }
    //     return false;
    // }

    public boolean checkVictory(String gameBoard[][]){
        boolean victory = false;
            //Check diag
            if (gameBoard[1][1].equals("x")){
                if(gameBoard[0][0].equals("x")){
                    if(gameBoard[2][2].equals("x")){
                        victory = true;
                        messageHandler.playerXWonMessage();
                    }
                }
                else if(gameBoard[0][2].equals("x")){
                    if(gameBoard[2][0].equals("x")){
                       victory = true;
                       messageHandler.playerXWonMessage();
                    }
                }
            }

            for(int i = 0; i < 2; i++){
                if(gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2])){
                    if(gameBoard[i][0].equals("x")){
                        messageHandler.playerXWonMessage();
                    } else if (gameBoard[i][0].equals("o")){
                        messageHandler.playerYWonMessage();
                    }
                    victory = true;
                } else if(gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[2][i].equals(gameBoard[2][i])){
                    victory = true;
                } else if(gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[0][0].equals(gameBoard[2][2])){
                    victory = true;
                } else if(gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[0][2].equals(gameBoard[2][0])){
                    victory = true;
                } else {
                    victory = false;
                }
            }
        return victory;
    }
    public static void checkWhoWon(Int i){
        
    }
}