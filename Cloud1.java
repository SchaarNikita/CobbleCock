import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud1 extends Actor
{
    GifImage c1 = new GifImage("Cloud1.gif");
    /**
     * Act - do whatever the Cloud1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       this.setImage(c1.getCurrentImage());
    }
}
