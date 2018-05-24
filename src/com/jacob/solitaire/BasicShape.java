import java.awt.Graphics.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

/**
 * Abstract class Basic_Shape - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Basic_Shape
{
    // instance variables - replace the example below with your own
    protected int x, y;

    
     /**
     * constructor
     */
    public Basic_Shape()
    {
        this.x = 50;
        this.y = 150;
    }
     /**
     * constructor
     */
    public Basic_Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * set the positions of the object
     * @param  x    the x coordinate of the object
     * @param  y    the y coordinate of the object
     */
    public void setPosition(int x,int y)
    {
       this.x = x; 
       this.y = y;
    }
    /**
     * get the x coordinate of the object
     * 
     * 
     * @return        the value of x 
     */
    public int getX()
    {
        return x;
    }
     /**
     * get the y coordinate of the object
     * 
     * 
     * @return        the value of y 
     */
    public int getY()
    {
        return y;
    }
    
    public abstract void draw(Graphics g);
    public abstract boolean contains (int x, int y);
    
}
