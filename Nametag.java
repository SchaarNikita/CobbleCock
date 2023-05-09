import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nametag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nametag extends Actor
{
    Character c;
    public Nametag(Character c) {
        this.c = c;
    }
    /**
     * Act - do whatever the Nametag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.setLocation(c.getX(), c.getY() - 53);
        getImage().setTransparency(210);
    }
}
