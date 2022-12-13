

import java.util.Random;
import java.util.Scanner;
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

        String NombreJugador = JOptionPane.showInputDialog("***** Bienvenido "
                + "Jugador! *****\nIntroduzca su nombre: ");
        JOptionPane.showMessageDialog(null, NombreJugador + " el juego esta "
                + "comenzando, suerte!");

        Tablero Tab1 = new Tablero();
        Tab1.CrearTablero();

        Naves Nav1 = new Naves();
        Nav1.NavesJugador();
        Nav1.NavesComputadora();

        Batalla Bat1 = new Batalla();

        byte opcion = 0;
        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(NombreJugador
                    + ", Seleccione la acción a realizar: \n"
                    + "1 - Atacar \n"
                    + "2 - Ver el tablero de ataque \n3 - Ver el tablero propio\n"
                    + "4 - Hacer trampa\n5 - Salir del juego"));
            switch (opcion) {
                case 1:
                    Bat1.MovJugador();
                    Bat1.MovCompu();
                    break;
                case 2:
                    Tab1.ImprimirTableroA();
                    break;
                case 3:
                    Tab1.ImprimirTableroP();
                    break;
                case 4:
                    Tab1.ImprimirTableroT();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción Inválida");
            }
        } while (opcion != 5 || Bat1.getEndgame() == 5);
    }
      
}
    

