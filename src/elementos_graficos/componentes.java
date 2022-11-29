package elementos_graficos;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class componentes extends JPanel implements botones{
    JPanel lamina=new JPanel();
    public componentes(){
        setLayout(null);
        panel();
    }

    @Override
    public void panel() {
        // TODO Auto-generated method stub
        lamina.setBounds(10, 20, 300, 100);
        lamina.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        add(lamina);
        
    }

    
}
