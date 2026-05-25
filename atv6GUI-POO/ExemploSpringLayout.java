import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.Container;


public class ExemploSpringLayout extends JFrame{
    public ExemploSpringLayout() {
        super("Janela Aí man");
        SpringLayout layout = new SpringLayout(); 
        Container c = getContentPane();
        c.setLayout(layout); 

        JButton butaum = new JButton("Botão 1");
        JButton butaum2 = new JButton("Botão 2");
        
        c.add(butaum);
        c.add(butaum2);
        
        layout.putConstraint(SpringLayout.NORTH, butaum, 20, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.NORTH, butaum2, 20, SpringLayout.SOUTH, butaum); 

        layout.putConstraint(SpringLayout.WEST, butaum, 30, SpringLayout.WEST, c); 
        layout.putConstraint(SpringLayout.WEST, butaum2, 0, SpringLayout.WEST, butaum); 

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}