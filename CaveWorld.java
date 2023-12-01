import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CaveWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaveWorld extends World
{

    /**
     * Constructor for objects of class CaveWorld.
     * 
     */
    public CaveWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        CobbleAmount cobA = new CobbleAmount();
        
        Floor floor = new Floor();
        
        this.addObject(floor, 300, 352);
        
        ScrollingBackground bg = new ScrollingBackground();
        
        this.addObject(bg, 600, 176);
        
        Character steve = new Character(cobA);
        
        this.addObject(steve, 100, 300);
        
    }
}
