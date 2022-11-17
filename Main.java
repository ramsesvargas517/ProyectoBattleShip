
import javax.swing.JOptionPane;

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
