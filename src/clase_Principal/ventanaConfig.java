package clase_Principal;

import javax.swing.JFrame;

import elementos_graficos.componentes;


class ventanaConfig extends JFrame {    
    componentes result = new componentes();     
    public ventanaConfig() {
        setVisible(true);
        setTitle("practica de recuperacion 7PTS");
        setSize(600, 710);
        setLocation(10, 0);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);             
        add(result);
        
    }
    
}
