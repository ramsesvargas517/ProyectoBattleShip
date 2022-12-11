


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ramse
 */
public class Naves {
    private int Almirante = 4;
    private int Capitan = 3;
    private int Teniente = 1;
    private int NavesJugador = 6;
    private int NavesComputadora = 6;

    public Naves() {
    }

    public int getAlmirante() {
        return Almirante;
    }

    public void setAlmirante(int Almirante) {
        this.Almirante = Almirante;
    }

    public int getCapitan() {
        return Capitan;
    }

    public void setCapitan(int Capitan) {
        this.Capitan = Capitan;
    }

    public int getTeniente() {
        return Teniente;
    }

    public void setTeniente(int Teniente) {
        this.Teniente = Teniente;
    }

    public int getNavesJugador() {
        return NavesJugador;
    }

    public void setNavesJugador(int NavesJugador) {
        this.NavesJugador = NavesJugador;
    }

    public int getNavesComputadora() {
        return NavesComputadora;
    }

    public void setNavesComputadora(int NavesComputadora) {
        this.NavesComputadora = NavesComputadora;
    }
    
    public void NavesJugador() {

        JOptionPane.showMessageDialog(null, "Seleccione la posicion "
                + "de sus naves :");
        NavesJugador = 5;
        for (int i = 0; i <= NavesJugador;) {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese la coordenada X de su nave numero " + i + " :"));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese la coordenada Y de su nave numero " + i + " :"));

            if ((x >= 0 && x < 6) && (y >= 0 && y < 6) && 
                    (Tablero.Tablero[x][y] == " _ ")) {
                Tablero.Tablero[x][y] = " + ";
                i++;
            } else if ((x >= 0 && x < 6) && (y >= 0 && y < 6) && 
                    Tablero.Tablero[x][y] == " + ") {
                    JOptionPane.showMessageDialog(null, "No puedes "
                            + "colocar dos naves en la misma coordenada");
            } else if ((x < 0 || x >= 6) || (y < 0 || y >= 6)) {
                    JOptionPane.showMessageDialog(null, "La "
                            + "coordenada seleccionada esta fuera de rango");
            }
        }
    }
    
        public void NavesComputadora(){
        JOptionPane.showMessageDialog(null, "La computadora esta "
                + "seleccionando sus naves");
        NavesComputadora = 5;
        for (int i = 0; i <= NavesComputadora; ) {
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);

            if((x >= 0 && x < 6) && (y >= 0 && y < 6) && 
                    (Tablero.Tablero[x][y] == " _ "))
            {
                Tablero.Tablero[x][y] = " $ ";
                i++;
            }
        }
    }
}
