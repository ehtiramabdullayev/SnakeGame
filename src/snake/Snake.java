package snake;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Master
 */
public class Snake extends JFrame implements KeyListener {

    PointObj obj;

    Snake(){
        super();
        obj = new PointObj();
        add(obj);
        pack();
        addKeyListener(this);
        repaint();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectangle = new Rectangle(400, 600);

        //// JPanel jPanel = new JPanel();
        // jPanel.paint();
        Snake snake = new Snake();

        snake.setBounds(rectangle);
        snake.setVisible(true);
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        obj.keyPressed(ke);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void repaint() {
        super.repaint(); 
    }
    
    

}
