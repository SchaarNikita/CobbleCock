import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cave extends Actor
{
    Character c;
    public Cave(Character c) {
        this.c = c;
    }
    
    /**
     * Act - do whatever the Cave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(this.isTouching(c.getClass())) {
            if(Greenfoot.isKeyDown("UP")) {
                Greenfoot.setWorld(new CaveWorld());
            }
        }
    }
}
