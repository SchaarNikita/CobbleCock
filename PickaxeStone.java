import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PickaxeStone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PickaxeStone extends Actor
{ 
    Character c;
    PickaxeUpgrade a;
    public PickaxeStone(Character c, PickaxeUpgrade a) {
        this.c = c;
        this.a = a;
    }
    /**
     * Act - do whatever the PickaxeStone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {this.setLocation(c.getX() +30, c.getY());
        
        
        // Add your action code here.
    }
}
