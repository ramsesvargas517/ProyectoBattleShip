/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sc202.proyectoprograbattleship;

import javax.swing.JOptionPane;
/**
 *
 * @author Pablo
 */

String NombreJugador = JOptionPane.showInputDialog ( "Introduzca el nombre del jugador: " );
        System.out.println ("Se registro el nombre " + NombreJugador + "correctamente" )

public class ProyectoPrograBattleShip {

    public static void main(String[] args) {
      
        String NombreJugador = JOptionPane.showInputDialog ( "Introduzca el nombre del jugador: " );
        System.out.println ("Se registro el nombre " + NombreJugador + "correctamente" )
        
        byte contrincante=0;
      
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
      
      }
      
      
      
      
        
    }

