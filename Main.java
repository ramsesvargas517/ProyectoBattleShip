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
        int matriz[][] = new int [6][6];
        //este for se utiliza para listar el contenido de la matriz
        //se puede utilizar mas adelante en el proyecto
        for (int x= 0; x < matriz.length; x++){
            for (int y= 0 ; y<matriz[x].length; y++){
                System.out.println (matriz[x][y]);
            }
        }
    }
    
}
