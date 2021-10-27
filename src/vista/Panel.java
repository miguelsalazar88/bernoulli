package vista;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private Image ecuacion = new ImageIcon(getClass().getResource("/images/bernoulli3.png")).getImage();

    public Panel(){
        this.setSize(477,123);
        this.setVisible(true);
        this.setBackground(Color.WHITE);
    }

    public void paint(Graphics g){
        g.drawImage(ecuacion,0,0,null);
    }

}
