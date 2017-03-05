/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import gamelogic.SnakeHolder;
import java.awt.Color;
import static java.awt.Color.GREEN;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;
import util.GameParams;

/**
 *
 * @author Master
 */
public class SnakeWindow extends JPanel {

    public SnakeHolder snakeParts ;

//    public SnakeWindow(SnakeHolder holder) {
//        snakeParts = holder;
//        System.out.println(" x " +holder.getX());
//    }

    
//    @Override
//    protected void paintComponent(Graphics grphcs) {
//        super.paintComponent(grphcs);
//
//        grphcs.setColor(Color.GREEN);
//
//        grphcs.fillRect(0, 0, 800, 700);
//
//        grphcs.setColor(Color.BLUE);
//
//        handleSnakeGraphics(grphcs);
//    }

    public void handleSnakeGraphics(Graphics graphics) {
        for (SnakePointObj point : snakeParts.getSnakePart()) {
            graphics.fillRect(point.getX() * GameParams.SNAKEWIDTH, GameParams.SNAKEHEIGHT * GameParams.SNAKEWIDTH,
                    GameParams.SNAKEWIDTH, GameParams.SNAKEWIDTH);
            System.out.println("point x " + point.getX() + " " + point.getY());
        }
    }
    
    
    
    @Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Snake snake = Snake.snake;

		g.setColor(GREEN);
		
		g.fillRect(0, 0, 800, 700);

		g.setColor(Color.BLUE);

		for (SnakePointObj point : snake.holder.getSnakePart())
		{
			g.fillRect(point.getX() * 10, point.getY() * 10, 10, 10);
                        System.out.println("point x "+point.getX() + " "+point.getY());
		}
		
		g.fillRect(snake.holder.getSnakeHead().getX()* 10, snake.holder.getSnakeHead().getY() * 10, 10, 10);
		
		g.setColor(Color.RED);
        }

}
