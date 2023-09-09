import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Head here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Head extends Actor
{
    Mob m;
    String[] sprites;
    Random rand = new Random();
    
    Head(Mob m) {
        this.m = m;
        this.sprites = new String[] {"images/Heads/Head1.png", "images/Heads/Head2.png", "images/Heads/Head3.png"};
        this.setImage(sprites[rand.nextInt(3)]);
    }
    
    /**
     * Act - do whatever the Head wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.setLocation(m.getX(), m.getY() - 32);
    }
}
