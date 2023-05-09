import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CobbleAmount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CobbleAmount extends Actor
{
    int cobble;
    public CobbleAmount() {
        this.cobble = 0;
    }
    /**
     * Act - do whatever the CobbleAmount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.setImage(new GreenfootImage("" + this.cobble, 25, Color.BLACK, null));
        
    }
    
    public void incCobble() {
        this.cobble += 1;
    }
    
    public void zeroCobble() {
        this.cobble = 0;
    }
}
