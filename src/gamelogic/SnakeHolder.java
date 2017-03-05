/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelogic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import snake.SnakePointObj;
import util.SnakeDirection;
import static util.SnakeDirection.*;

/**
 *
 * @author Master
 */
public class SnakeHolder extends JPanel{
    private ArrayList<SnakePointObj>snakePart = new ArrayList<>();
    private SnakeDirection direction;
    
    public ArrayList<SnakePointObj> getSnakePart() {
        return snakePart;
    }

    public void setSnakePart(ArrayList<SnakePointObj> snakePart) {
        this.snakePart = snakePart;
    }
    
    
     @Override
    public void update(Graphics grphcs) {
        super.update(grphcs);
        paint(grphcs);
    }

    @Override
    public void paint(Graphics grphcs) {
        // super.paint(grphcs); //To change body of generated methods, choose Tools | Templates.
        grphcs.setColor(Color.red);
     //   grphcs.drawRect(x, y, SNAKEWIDTH, SNAKEHEIGHT);
        //    grphcs.setPaintMode();
    }

   

	public void defineSnakeDirection(KeyEvent e)
	{
		int i = e.getKeyCode();

		if ((i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT) && direction != RIGHT)
		{
			direction = LEFT;
		}

		if ((i == KeyEvent.VK_D || i == KeyEvent.VK_RIGHT) && direction != LEFT)
		{
			direction = RIGHT;
		}

		if ((i == KeyEvent.VK_W || i == KeyEvent.VK_UP) && direction != DOWN)
		{
			direction = UP;
		}

		if ((i == KeyEvent.VK_S || i == KeyEvent.VK_DOWN) && direction != UP)
		{
			direction = DOWN;
		}

//		if (i == KeyEvent.VK_SPACE)
//		{
//			if (over)
//			{
//				startGame();
//			}
//			else
//			{
//				paused = !paused;
//			}
//		}
	}


    
}
