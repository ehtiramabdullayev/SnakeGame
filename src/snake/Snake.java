package snake;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Master
 */
public class Snake extends  JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle  rectangle = new Rectangle(400, 600);
        PointObj obj = new PointObj();
       //// JPanel jPanel = new JPanel();
       // jPanel.paint();
        
        
        Snake snake= new Snake();
        
        snake.setBounds(rectangle);
        snake.setVisible(true);
        snake.add(obj);
    }
    
}
