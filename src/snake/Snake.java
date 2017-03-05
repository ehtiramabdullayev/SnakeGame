package snake;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static util.StaticDataHolder.*;

/**
 *
 * @author Master
 */
public class Snake extends SnakeWindow {

    SnakePointObj obj;
    JComponent component;

    Snake() {
        super();
//        obj = new SnakePointObj();
//
//        component = new JComponent() {
//        };

      //  component.add(obj);
        // component.add(obj);

        // obj = new PointObj();
        add(component);
        //add()
        //add(obj);
//        pack();
//        addKeyListener(this);
//        repaint();
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        // TODO code application logic here
        Rectangle rectangle = new Rectangle(SCREENWIDTH, SCREENHEIGHT);

        //// JPanel jPanel = new JPanel();
        // jPanel.paint();
        Snake snake = new Snake();

        snake.setBounds(rectangle);
        snake.setVisible(true);

    }

}
