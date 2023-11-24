import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cobblestone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cobblestone extends Actor
{
    int delayFrames;
    int maxFrames;
    
    Cobblestone() {
        this.delayFrames = 0;
        this.maxFrames = 60;
    }
    /**
     * Act - do whatever the Cobblestone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(this.maxFrames <= 0) {
            this.maxFrames = 1;
        }
        if(this.delayFrames == maxFrames) {
            this.delayFrames = 0;
            this.getImage().setTransparency(255);
        }
         else if(this.getImage().getTransparency() == 0) {
            Greenfoot.delay(1);
            delayFrames++;
        }
    }
    
    
    public void breakCob() {
        this.getImage().setTransparency(0);
    }
}
