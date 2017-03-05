package snake;

import gamelogic.SnakeAction;
import gamelogic.SnakeHolder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Snake extends JFrame implements ActionListener,KeyListener{

    SnakePointObj obj;
    SnakeHolder holder ;
    JComponent component;
    SnakeWindow snakeWindow;
//     static Snake snake ;
    static SnakeAction action;

    Snake() {
        super();
//        obj = new SnakePointObj();    
        action = new SnakeAction();
//        holder = new SnakeHolder();
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
        
//        add(holder);
//        pack();
//        addKeyListener(this);
        repaint();
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }

    public static void main(String[] args) {

        // TODO code application logic here
        //// JPanel jPanel = new JPanel();
        // jPanel.paint();
        Snake snake = new Snake();
        ActionEvent ae = new ActionEvent(snake, WIDTH, "111");
        
        snake.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        action.actionPerformed(ae);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        action.keyPressed(ke);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
