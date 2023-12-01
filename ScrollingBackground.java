import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollingBackground extends Actor
{
    /**
     * Act - do whatever the Floor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("RIGHT") || Greenfoot.isKeyDown("D")) {
            move(-3);
        }
        
        if(Greenfoot.isKeyDown("LEFT") || Greenfoot.isKeyDown("A")) {
            move(3);
        }
    }
}