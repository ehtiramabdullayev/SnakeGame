/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;


/**
 *
 * @author Master
 */
public class SnakePointObj  {

    private int x;
    private int y;

    public SnakePointObj(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SnakePointObj() {
    }
    
    

    public int getX() {

        System.out.println("X : " + x);

        return x;
    }

    public void setX(int x) {
        System.out.println("setted");
        this.x = x;

    }

    public int getY() {
        System.out.println("Y : " + y);
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   
}
