/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import static util.StaticDataHolder.*;

/**
 *
 * @author Master
 */
public class PointObj  extends JPanel{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void update(Graphics grphcs) {
        super.update(grphcs);
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        grphcs.setColor(Color.red);
        grphcs.drawRect(x, y,SNAKEWIDTH , SNAKEHEIGHT);
        grphcs.setPaintMode();
    }
    
    public void keyPressed (KeyEvent event){
        int keyCode = event.getKeyCode();

    }
    
    
    
}
