/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import snake.SnakePointObj;
import snake.SnakeWindow;
import util.SnakeDirection;
import static util.SnakeDirection.*;

/**
 *
 * @author Master
 */
public class SnakeAction implements ActionListener, KeyListener {

    SnakeHolder holder;// = new SnakeHolder();

    SnakeWindow snakeWindow;//= new SnakeWindow(holder);

    public SnakeAction(SnakeWindow window) {
        if (window != null) {
            System.out.println("Not null");
            System.out.println("not null");
        }
        this.snakeWindow = window;
        this.holder = window.snakeParts;

    }

    public void controlSnake() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        snakeAct(ae);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        holder.defineSnakeDirection(ke);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public void snakeAct(ActionEvent arg0) {
        boolean over = false;
        boolean paused = false;
        int ticks = 0;
        SnakePointObj head =holder.getSnakeHead();

        snakeWindow.repaint();
        SnakeDirection direction = holder.getDirection();
        ticks++;
        System.out.println("here" + ticks);
        System.out.println("direction " + holder.getDirection());

        if (ticks % 2 == 0 && holder.getSnakeHead() != null && !over && !paused) {
            //time++;
            ArrayList<SnakePointObj> snakeParts = holder.getSnakePart();
            snakeParts.add(new SnakePointObj(head.getX(), head.getY()));

            if (direction == UP) {
                if (head.getY() - 1 >= 0) {
                    head = new SnakePointObj(head.getX(), head.getY());
                } else {
                    over = true;

                }
            }

            if (direction == DOWN) {
                if (head.getY() + 1 < 67) {
                    head = new SnakePointObj(head.getX(), head.getY() + 1);
                } else {
                    over = true;
                }
            }

            if (direction == LEFT) {
                if (head.getX() - 1 >= 0) {
                    head = new SnakePointObj(head.getX() - 1, head.getY());
                } else {
                    over = true;
                }
            }

            if (direction == RIGHT) {
                if (head.getX() + 1 < 80) {
                    head = new SnakePointObj(head.getX() + 1, head.getY());
                } else {
                    over = true;
                }
            }

//            System.out.println("tail len " + tailLength);
//            System.out.println("snake part " + snakeParts.size());
////			if (snakeParts.size() > tailLength)
////			{
////				snakeParts.remove(0);
////
////			}
//
//            if (cherry != null) {
//                if (head.equals(cherry)) {
//                    score += 10;
//                    tailLength++;
//                    cherry.setLocation(random.nextInt(79), random.nextInt(66));
//                }
//            }
        }
    }

}
