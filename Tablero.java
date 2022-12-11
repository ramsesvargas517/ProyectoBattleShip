/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
public class Tablero {
    public static String[][] Tablero = new String[6][6];
    public static String[][] TableroT = new String[6][6];
    public static String[][] TableroA = new String[6][6];
    public static String[][] TableroP = new String[6][6];
    
    public Tablero() {
    }

    public static void CrearTablero() {

        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();

        for (int i = 0; i < Tablero.length; i++) {
            for (int j = 0; j < Tablero[i].length; j++) {
                Tablero[i][j] = " _ ";
                if (j == 0) {
                    System.out.print(i + "|" + Tablero[i][j]);
                } else if (j == Tablero[i].length - 1) {
                    System.out.print(Tablero[i][j] + "|" + i);
                } else {
                    System.out.print(Tablero[i][j]);
                }
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
    
        public static void ImprimirTablero(){
            
        System.out.println();
        System.out.print("  ");
        for(int i = 0; i < 6 ; i++)
            System.out.print(" " + i + " ");
        System.out.println();

        for(int x = 0; x < Tablero.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < Tablero[x].length; y++){
                System.out.print(Tablero[x][y]);
            }

            System.out.println("|" + x);
        }
        
        System.out.print("  ");
        for(int i = 0; i < 6; i++)
            System.out.print(" " + i + " ");
        System.out.println();
    }
        
        public static void ImprimirTableroT(){
            
        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();

        for (int i = 0; i < TableroT.length; i++) {
            for (int j = 0; j < TableroT[i].length; j++) {
                if (Tablero[i][j] == " @ " || Tablero[i][j] == " x " || 
                        Tablero[i][j] == " + ") {
                TableroT[i][j] = " _ ";
                } else if (Tablero[i][j] == " $ "){
                    TableroT[i][j] = " $ ";
                } else if (Tablero[i][j] == " * "){
                    TableroT[i][j] = " * ";
                } else if (Tablero[i][j] == " O "){
                    TableroT[i][j] = " O ";
                } else if (Tablero[i][j] == " _ "){
                    TableroT[i][j] = " _ ";
                }
                if (j == 0) {
                    System.out.print(i + "|" + TableroT[i][j]);
                } else if (j == TableroT[i].length - 1) {
                    System.out.print(TableroT[i][j] + "|" + i);
                } else {
                    System.out.print(TableroT[i][j]);
                }
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
        public static void ImprimirTableroA(){
            
        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();

        for (int i = 0; i < TableroA.length; i++) {
            for (int j = 0; j < TableroA[i].length; j++) {
                if (Tablero[i][j] == " $ " || Tablero[i][j] == " + " || 
                        Tablero[i][j] == " x " || Tablero[i][j] == " @ ") {
                TableroA[i][j] = " _ ";
                } else if (Tablero[i][j] == " * "){
                    TableroA[i][j] = " * ";
                } else if (Tablero[i][j] == " O "){
                    TableroA[i][j] = " O ";
                } else if (Tablero[i][j] == " _ "){
                    TableroA[i][j] = " _ ";
                }
                if (j == 0) {
                    System.out.print(i + "|" + TableroA[i][j]);
                } else if (j == TableroA[i].length - 1) {
                    System.out.print(TableroA[i][j] + "|" + i);
                } else {
                    System.out.print(TableroA[i][j]);
                }
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
        
            public static void ImprimirTableroP(){
            
        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();

        for (int i = 0; i < TableroP.length; i++) {
            for (int j = 0; j < TableroP[i].length; j++) {
                if (Tablero[i][j] == " $ " || Tablero[i][j] == " O " ||
                        Tablero[i][j] == " * ") {
                TableroP[i][j] = " _ ";
                } else if (Tablero[i][j] == " + "){
                    TableroP[i][j] = " + ";
                } else if (Tablero[i][j] == " * "){
                    TableroP[i][j] = " * ";
                } else if (Tablero[i][j] == " @ "){
                    TableroP[i][j] = " @ ";
                } else if (Tablero[i][j] == " _ "){
                    TableroP[i][j] = " _ ";
                }
                if (j == 0) {
                    System.out.print(i + "|" + TableroP[i][j]);
                } else if (j == TableroP[i].length - 1) {
                    System.out.print(TableroP[i][j] + "|" + i);
                } else {
                    System.out.print(TableroP[i][j]);
                }
            }
            System.out.println();
        }

        System.out.print("  ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
}
