import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mob extends Actor
{
    Character c;
    
    Mob(Character c) {
        this.c = c;
    }
    /**
     * Act - do whatever the Mob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.turnTowards(c.getX(), this.getY());
        this.move(1);
        this.setRotation(0);
    }
}
