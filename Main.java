

import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        

        String NombreJugador = JOptionPane.showInputDialog 
        ( "Introduzca el nombre del jugador: " );
        System.out.println ("Se registro el nombre " 
                + NombreJugador + "correctamente" );

       byte contrincante= 0;

      contrincante = Byte.parseByte(JOptionPane.showInputDialog(
              "Para continuar, seleccione su contrincante \n"
              +"1 - Jugador Real \n"
              +"2 - Cpu \n"
             ));
      switch (contrincante){
          case 1:
              JOptionPane.showMessageDialog(null, 
                      "Ha elegido: Jugador Real");
              break;
          case 2:
              JOptionPane.showMessageDialog(null,
                      "Ha elegido: Cpu");
              break;
          default:
              JOptionPane.showMessageDialog(null,
                      "Opción Inválida");
              
           }
           */
        int gameBoardLength = 6;
        char water = '_';
        char ship = 's';
        char hit = 'X';
        char miss = 'O';
        int shipNumber = 6;
        char[][] gameBoard = createGameBoard(gameBoardLength,water,ship,shipNumber);
        printGameBoard(gameBoard,water,ship);
        int undetectedShipNumber = shipNumber;
        while(undetectedShipNumber > 0){
            int[] guessCoordinates = getUserCoordinates(gameBoardLength);
            char locationViewUpdate = evaluateGuessAndGetTheTarget(
                    guessCoordinates,gameBoard,ship,water,hit,miss);
            if(locationViewUpdate == hit){
                undetectedShipNumber--;
            }
            gameBoard = updateGameBoard(gameBoard,guessCoordinates,
                    locationViewUpdate);
            printGameBoard(gameBoard,water,ship);
        }
        System.out.print("You win ");
    } 
    private static int[] getUserCoordinates(int gameBoardLength) {
        int row;
        int col;
        do{
            System.out.print("Row: ");
            row = new Scanner(System.in).nextInt();   
        }while (row < 1 || row > gameBoardLength + 1);
        do{
            System.out.print("Column: ");
            col = new Scanner(System.in).nextInt();
        }while(col < 1 || col > gameBoardLength + 1);
        return new int[]{row - 1, col -1};
    }
    private static char[][] updateGameBoard(char[][] gameBoard, 
            int[] guessCoordinates, char locationViewUpdate) {
        int row = guessCoordinates[0];
        int col = guessCoordinates[1];
        gameBoard[row][col] = locationViewUpdate;
        return gameBoard;
    }
    private static char evaluateGuessAndGetTheTarget(int[] guessCoordinates, 
            char[][] gameBoard, char ship, char water, char hit, char miss) {
    String message;
    int row = guessCoordinates[0];
    int col = guessCoordinates[1];
    char target = gameBoard[row][col];
    if (target == ship){
        message = "Hit!";
        target = hit;
    }else if (target == water){
        message = "Miss!";
        target = water;
    }else{
        message = "Already Hit";
    }
    System.out.print(message);
    return target;
    }
    private static void printGameBoard(char[][] gameBoard, char water, char ship){
        int gameBoardLength = gameBoard.length;
        System.out.print("  ");
        for(int i = 0;i<gameBoardLength;i++){
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for(int row = 0;row < gameBoardLength; row++){
            System.out.print(row + 1 + " ");
            for(int col = 0;col<gameBoardLength;col++){
                char position = gameBoard[row][col];
                if(position == ship){
                System.out.print(water+" ");
            }else{
                 System.out.print(position + " ");
                 }
               
            }
            System.out.println(); 
        }
        System.out.println();
    }
    private static char[][]createGameBoard(int gameBoardLength,char water,
            char ship,int shipNumber){
        char[][]gameBoard = new char[6][6];
        for (int i = 0 ; i < 6; i ++)
            for (int j=0; j<6; j++)
                gameBoard[i][j]= water ;
        return placeShips(gameBoard,shipNumber,water,ship);
    }
    private static char[][]placeShips(char [][] gameBoard,
            int shipNumber,char water, char ship){
        int placedShips = 0;
        int gameBoardLength = gameBoard.length;
        while (placedShips < shipNumber){
            int[] location = generateShipCoordinates(gameBoardLength);
            char possiblePlacement = gameBoard[location[0]][location[1]];
            if (possiblePlacement == water){
                gameBoard[location[0]][location[1]] = ship;
                placedShips++;
            } 
        }
        return gameBoard;
    }
    private static int[] generateShipCoordinates(int gameBoardLength) {
        int[]coordinates = new int[2];
        for (int i = 0;i < coordinates.length; i++){
            coordinates[i] = new Random().nextInt(gameBoardLength);
        }
        return coordinates;
    }     
}
    

