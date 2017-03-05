/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import gamelogic.SnakeHolder;
import java.awt.Graphics;
import javax.swing.JPanel;
import util.GameParams;

/**
 *
 * @author Master
 */
public class SnakeWindow extends JPanel {

    SnakeHolder snakeParts = new SnakeHolder();



    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        handleSnakeGraphics(grphcs);
    }

    public void handleSnakeGraphics(Graphics graphics) {
        for (SnakePointObj point : snakeParts.getSnakePart()) {
            graphics.fillRect(point.getX() * GameParams.SNAKEWIDTH, GameParams.SNAKEHEIGHT * GameParams.SNAKEWIDTH, 
                    GameParams.SNAKEWIDTH, GameParams.SNAKEWIDTH);
            System.out.println("point x " + point.getX() + " " + point.getY());
        }
    }

}
