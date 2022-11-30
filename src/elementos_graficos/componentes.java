package elementos_graficos;

import java.awt.Font;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class componentes extends JPanel implements botones, ActionListener {

    public JPanel lamina = new JPanel();
    public JLabel nombre = new JLabel();
    public static JTextField txtnombre2 = new JTextField();
    public JLabel edad = new JLabel();
    public static JTextField txtedad = new JTextField();
    public JLabel etapaVida = new JLabel();
    public static JTextField textEtapa = new JTextField();   
    JMenuItem guardar = new JMenuItem("Agregar");
    JMenuItem eliminar = new JMenuItem("Eliminar");
    public JTable tbtoriginal = new JTable();
    public DefaultTableModel tbtmodelo = new DefaultTableModel();
    public JScrollPane scroll = new JScrollPane();
    public JPanel laminaPanel = new JPanel();

    public componentes() {
        setLayout(null);
        panel();
        label();
        cuadroText();
        cuadrotext2();
        cuadroText3();
        menu();
        tablaSolucion();
    }

    @Override
    public void label() {
        // TODO Auto-generated method stub
        nombre.setBounds(5, 10, 90, 20);
        nombre.setText("Nombre:");
        nombre.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
        lamina.add(nombre);
        edad.setBounds(5, 50, 90, 20);
        edad.setText("Edad: ");
        edad.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
        lamina.add(edad);
        etapaVida.setText("Etapa de vida: ");
        etapaVida.setBounds(5, 90, 90, 20);
        etapaVida.setFont(new Font("Bodoni MT", Font.PLAIN, 14));
        lamina.add(etapaVida);
    }

    @Override
    public void cuadroText() {
        // TODO Auto-generated method stub
        txtnombre2.setBounds(65, 10, 250, 25);
        lamina.add(txtnombre2);
        txtnombre2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int letra = e.getKeyChar();
                boolean mayus = letra >= 65 && letra <= 90;
                boolean minus = letra >= 97 && letra <= 122;
                Boolean space = letra == 32;
                if (!(minus || mayus || space)) {
                    e.consume();
                }
            }
        });
    }

    @Override
    public void cuadrotext2() {
        // TODO Auto-generated method stub
        txtedad.setBounds(65, 50, 250, 25);
        lamina.add(txtedad);
        txtedad.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e1) {
                if (txtedad.getText().length() >= 3) {
                    e1.consume();
                }
                int evento = e1.getKeyChar();
                boolean num = evento >= 48 && evento <= 57;
                if (!num) {
                    e1.consume();
                }
            }
        });
    }

    @Override
    public void cuadroText3() {
        // TODO Auto-generated method stub
        textEtapa.setBounds(120, 90, 195, 25);
        lamina.add(textEtapa);
        textEtapa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e2) {
                int letter = e2.getKeyChar();
                boolean mayus = letter >= 65 && letter <= 90;
                boolean minus = letter >= 97 && letter <= 122;
                Boolean space = letter == 32;
                if (!(minus || mayus || space)) {
                    e2.consume();
                }

            }
        });

    }

    @Override
    public void panel() {
        // TODO Auto-generated method stub
        lamina.setLayout(null);
        lamina.setBounds(10, 90, 560, 200);
        lamina.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        add(lamina);

    }

    public void menu() {
        JMenuBar menu1 = new JMenuBar();
        menu1.setBounds(0, 5, 580, 50);
        menu1.setBorder(BorderFactory.createEtchedBorder());
        add(menu1);
        JMenu mnguardar = new JMenu();
        mnguardar.setText("Agregar");
        mnguardar.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        guardar.addActionListener(this);
        menu1.add(mnguardar);
        guardar.setFont(new Font("Bahnschrift", Font.PLAIN, 14));       
        mnguardar.add(guardar);
        JMenu mnEliminar = new JMenu();
        mnEliminar.setText("Eliminar");
        mnEliminar.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        menu1.add(mnEliminar);
       
        eliminar.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
        eliminar.addActionListener(this);
        mnEliminar.add(eliminar);
        
    }

    public void tablaSolucion() {
        laminaPanel.setBounds(5, 300, 565, 350);
        laminaPanel.setBorder(BorderFactory.createEtchedBorder());
        laminaPanel.setLayout(null);
        add(laminaPanel);
        tbtoriginal.setModel(tbtmodelo);
        scroll = new JScrollPane(tbtoriginal);
        scroll.setBounds(5, 5, 555, 340);
        laminaPanel.add(scroll);
        String[] columna = new String[] { "nombre", "edad", "etapa de vida" };
        tbtmodelo.setColumnIdentifiers(columna);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object evento = e.getSource();
        if (evento == guardar) {
            tbtmodelo.addRow(new Object[] {
                    txtnombre2.getText(), txtedad.getText(), textEtapa.getText()
            });

        }else if(evento==eliminar){
            int variable=tbtoriginal.getSelectedRow();
            if(variable>=0){
                tbtmodelo.removeRow(variable);
            }
        }

    }
}
