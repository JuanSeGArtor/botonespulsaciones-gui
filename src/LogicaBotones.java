/*
Nombre: Juan Sebastian Gomez Ayala
Ficha: 2501469
Fecha: 01/08/2023
*/

import javax.swing.JButton;

public class LogicaBotones extends JButton {
    
    int click;
    
    public LogicaBotones() {
        click = 0;
    }
    
    
    //METODOS
    public void setClick(int p) {
        click = p;
    }

    public int getClick() {
        return click;
    }

    public void incrementar() {
        click++;
    }

    public void reiniciar() {
        click = 0;
    }
}






