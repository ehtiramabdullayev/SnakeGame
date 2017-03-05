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
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.xml.ws.Holder;
import util.SnakeDirection;

/**
 *
 * @author Master
 */
public class Snake extends JFrame implements ActionListener,KeyListener{
    static Snake snake ;
    SnakePointObj obj;
    SnakeHolder holder ;
    JComponent component;
    SnakeWindow snakeWindow;
//     static Snake snake ;
     SnakeAction action;

    Snake() {
        super();
        ArrayList<SnakePointObj> arrayList =new ArrayList<SnakePointObj>();
        holder =new SnakeHolder();
        holder.setSnakeHead(new SnakePointObj(1,1));
        holder.setSnakePart(arrayList);
        System.out.println(" aaa" +holder.getSnakeHead().getX());
        holder.setDirection(SnakeDirection.DOWN);
//        obj = new SnakePointObj();    
        snakeWindow = new SnakeWindow();
        snakeWindow.snakeParts = holder;
        
        action = new SnakeAction(snakeWindow);
        
//        holder = new SnakeHolder();
        //snakeWindow = new SnakeWindow(holder);
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
        //this.addKeyListener(this);
//        add(holder);
//        pack();
        addKeyListener(this);
        setVisible(true);
//        repaint();
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }

    public static void main(String[] args) {

        // TODO code application logic here
        //// JPanel jPanel = new JPanel();
        // jPanel.paint();
         snake = new Snake();
//        ActionEvent ae = new ActionEvent(snake, WIDTH, "111");
        
//        snake.setVisible(true);

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
