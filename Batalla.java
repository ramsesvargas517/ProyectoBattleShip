
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ramse
 */
public class Batalla {
    private int[][] fallos = new int[6][6];
    private int endgame;

    public int getEndgame() {
        return endgame;
    }

    public void setEndgame(int endgame) {
        this.endgame = endgame;
    }

    Naves Nav2 = new Naves();
    
    public void MovJugador() {
        JOptionPane.showMessageDialog(null, "Es tu turno!");
        int x = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese la coordenada X:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese la coordenada Y:"));
        do {
            if ((x >= 0 && x < 6) && (y >= 0 && y < 6)) {
                if (Tablero.Tablero[x][y] == " $ ") {
                    JOptionPane.showMessageDialog(null, "Has"
                            + " hundido una nave!");
                    Tablero.Tablero[x][y] = " * ";
                    Nav2.setNavesComputadora(Nav2.getNavesComputadora()-1);
                } else if (Tablero.Tablero[x][y] == " + ") {
                    JOptionPane.showMessageDialog(null, "Oh no! "
                            + "Has hundido tu "
                            + "propia nave");
                    Tablero.Tablero[x][y] = " * ";
                    Nav2.setNavesJugador(Nav2.getNavesJugador()-1);
                } else if (Tablero.Tablero[x][y] == " _ ") {
                    JOptionPane.showMessageDialog(null, 
                            "Miss!");
                    Tablero.Tablero[x][y] = " O ";
                }
            } else if ((x < 0 || x >= 6) || (y < 0 || y >= 6)) {
                JOptionPane.showMessageDialog(null, "La coordenada "
                        + "seleccionada esta fuera de rango");
            }
        } while ((x < 0 || x >= 6) || (y < 0 || y >= 6));
    }
    
        public void MovCompu(){
            
        JOptionPane.showMessageDialog(null, "Turno de la "
                + "computadora...");
        int x, y;
        do {
            x = (int)(Math.random() * 10);
            y = (int)(Math.random() * 10);

            if ((x >= 0 && x < 6) && (y >= 0 && y < 6))
            {
                if (Tablero.Tablero[x][y] == " + ")
                {
                    JOptionPane.showMessageDialog(null,"La "
                            + "computadora hundido tu nave!");
                    Tablero.Tablero[x][y] = " * ";
                    Nav2.setNavesJugador(Nav2.getNavesJugador()-1);
                }
                else if (Tablero.Tablero[x][y] == " * ") {
                    JOptionPane.showMessageDialog(null,"La "
                            + "computadora ha hundido su propia nave!");
                    Tablero.Tablero[x][y] = " * ";
                    Nav2.setNavesComputadora(Nav2.getNavesComputadora()-1);
                }
                else if (Tablero.Tablero[x][y] == " _ ") {
                    JOptionPane.showMessageDialog(null,"Miss!");
                    Tablero.Tablero[x][y] = " O ";
                    if(fallos[x][y] != 1)
                        fallos[x][y] = 1;
                }
            }
        }while((x < 0 || x >= 6) || (y < 0 || y >= 6));
        Contador();
    }
        
        
    public void Contador(){
        JOptionPane.showMessageDialog(null, "Naves jugador: "
                + Nav2.getNavesJugador() + "\nNaves computadora: " 
                + Nav2.getNavesComputadora());
        if(Nav2.getNavesJugador() > 0 && Nav2.getNavesComputadora() <= 0) {
            JOptionPane.showMessageDialog(null,"Has ganado "
                    + "el juego!");
            JOptionPane.showMessageDialog(null,"Gracias por "
                    + "jugar!");
        } else if (Nav2.getNavesJugador() <= 0 && Nav2.getNavesComputadora() > 0){
            JOptionPane.showMessageDialog(null,"La computadora "
                    + "ha ganado");
            JOptionPane.showMessageDialog(null,"Gracias por "
                    + "jugar!");
            endgame = 0;
        }
    }
}
