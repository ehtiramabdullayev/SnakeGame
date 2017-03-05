package snake;

import gamelogic.SnakeHolder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.xml.ws.Holder;

/**
 *
 * @author Master
 */
public class Snake extends JFrame {

    SnakePointObj obj;
    SnakeHolder holder ;
    JComponent component;
    SnakeWindow snakeWindow ;
//     static Snake snake ;

    Snake() {
        super();
//        obj = new SnakePointObj();    
           snakeWindow = new SnakeWindow();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setBounds(100, 100, 500, 500);
//        component = new JComponent() {
//        };

      //  component.add(obj);
        // component.add(obj);

        // obj = new PointObj();
//        add(component);
        //add()
        add(snakeWindow);
//        pack();
//        addKeyListener(this);
        repaint();
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        // TODO code application logic here

        //// JPanel jPanel = new JPanel();
        // jPanel.paint();
         Snake snake =  new Snake();
        
        snake.setVisible(true);
        
    }

}
