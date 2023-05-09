import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class StockGraph here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockGraph extends Actor
{
    Random rand = new Random();
    int lastX = 0;
    int lastY = 200;
    boolean doN = false;
    /**
     * Act - do whatever the StockGraph wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("R")) {
            this.getWorld().setBackground("Background.png");
            lastX = 0;
            lastY = 200;
        } else if(lastX == 600) {
            this.getWorld().setBackground("Background.png");
            lastX = 0;
        } else if(Greenfoot.isKeyDown("Space")) {
        int newX = lastX + 1;
        int newY = 0;
        
        if(doN) {
            newY = lastY + rand.nextInt(20);
        } else {
            newY = lastY - rand.nextInt(20);
        }
        
        this.getWorld().getBackground().drawLine(lastX, lastY, newX, newY);
        
        lastX = newX;
        lastY = newY;
        
        if(Greenfoot.isKeyDown("H")) {
            doN = false;
        } else if(Greenfoot.isKeyDown("L")) {
            doN = true;
        } else {
            doN = !doN;
        }
        
        }
    }
}
