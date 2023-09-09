import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Torso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torso extends Actor
{
    Mob m;
    String[] sprites;
    Random rand = new Random();
    
    Torso(Mob m) {
        this.m = m;
        this.sprites = new String[] {"images/Torsos/Torso1.png", "images/Torsos/Torso2.png", "images/Torsos/Torso3.png"};
        this.setImage(sprites[rand.nextInt(3)]);
    }
    
    /**
     * Act - do whatever the Head wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.setLocation(m.getX(), m.getY() - 6);
    }
}
