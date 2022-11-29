package elementos_graficos;

import java.awt.Font;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class componentes extends JPanel implements botones{
    private JPanel lamina=new JPanel();
    private JLabel nombre=new JLabel();
    private JTextField txtnombre2=new JTextField();
    private JLabel edad=new JLabel();
    private JTextField txtedad=new JTextField();
    private JLabel etapaVida=new JLabel();
    private JTextField textEtapa= new JTextField();
    public componentes(){
        setLayout(null);
        panel();
        label();
        cuadroText();
        cuadrotext2();
        cuadroText3();
    }

    @Override
    public void label() {
        // TODO Auto-generated method stub
        nombre.setBounds(5, 10, 90, 20);
        nombre.setText("Nombre:");
        nombre.setFont(new Font("Bodoni MT",Font.PLAIN,14));
        lamina.add(nombre);
        edad.setBounds(5, 50, 90, 20);
        edad.setText("Edad: ");
        edad.setFont(new Font("Bodoni MT",Font.PLAIN,14));
        lamina.add(edad);
        etapaVida.setText("Etapa de vida: "); 
        etapaVida.setBounds(5,90,90,20); 
        etapaVida.setFont(new Font("Bodoni MT",Font.PLAIN,14));  
        lamina.add(etapaVida);  
    }
    
    @Override
    public void cuadroText() {
        // TODO Auto-generated method stub
        txtnombre2.setBounds(65,10,250,25);
        lamina.add(txtnombre2);
        txtnombre2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
                int letra=e.getKeyChar();
                boolean mayus=letra>=65 && letra<=90;
                boolean minus=letra>=97 && letra<=122;
                Boolean space=letra==32;
                if(!(minus||mayus|| space)){
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
        txtedad.addKeyListener(new KeyAdapter(){
            @Override 
            public void keyTyped(KeyEvent e1) {
                if(txtedad.getText().length()>=3){
                    e1.consume();
                }
                int evento=e1.getKeyChar();
                boolean num= evento>=48&&evento<=57;
                if(!num){
                    e1.consume();
                }                
            }
        });        
    } @Override
    public void cuadroText3() {
        // TODO Auto-generated method stub
        textEtapa.setBounds(120, 90, 195, 25);
        lamina.add(textEtapa);        
        textEtapa.addKeyListener(new KeyAdapter(){
            @Override 
            public void keyTyped(KeyEvent e2) {
                    int letter=e2.getKeyChar();
                    boolean mayus=letter>=65 && letter<=90;
                    boolean minus=letter>=97 && letter<=122;
                    Boolean space=letter==32;
                    if(!(minus||mayus|| space)){
                        e2.consume();
                    }
                    
            }
        });        
        
    }

    @Override
    public void panel() {
        // TODO Auto-generated method stub
        lamina.setLayout(null);
        lamina.setBounds(10, 20, 560, 200);
        lamina.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        add(lamina);
        
    }

   
   

   
    
   


    
}
