import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StockMarket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockMarket extends World
{

    /**
     * Constructor for objects of class StockMarket.
     * 
     */
    public StockMarket()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage bg = new GreenfootImage("Background.png");
        
        this.setBackground(bg);
        
        StockGraph sg = new StockGraph();
        
        this.addObject(sg, 0, 0);
    }
}
