import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaitCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaitCount extends Actor
{
    int waitC;
    public WaitCount() {
        this.waitC = 0;
    }
    /**
     * Act - do whatever the WaitCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void incCount() {
        this.waitC++;
    }
    
    public void zeroCount() {
        this.waitC = 0;
    }
}
