package Vistas;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

public class EscritorioPersonalizado extends JDesktopPane{
    private BufferedImage img;
    
    public EscritorioPersonalizado() {
        try {                           
            img = ImageIO.read(getClass().getResourceAsStream("/imagenes/ulp.png"));            
        } catch (Exception ex) {
            System.out.println("ERROR: IMAGEN");
            ex.printStackTrace();
        }      
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponents(g); 
        g.drawImage(img, 230, 150,null);
    }
    
    
}
