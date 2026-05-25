import javax.swing.*;
import java.awt.*;

public class ExemploToolTip extends JFrame{
    private final JLabel label = new JLabel("Rótulo man");
    private final Icon icon = new ImageIcon("img/black-cat.jpg");
    
    
    
    public ExemploToolTip() {
        super("Exemplo de ToolTip");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        label.setToolTipText("Dica de algo aí po");
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);

        Container c = getContentPane();
        c.add(label);

        label.setIcon(icon);
        

        

    }
    
}
