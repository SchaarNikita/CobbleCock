import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.TimeUnit;

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    CobbleAmount cobA;
    WaitCount waitC;
    int jumpCount;
    Character (CobbleAmount cobA) {
        this.cobA = cobA;
        this.waitC = new WaitCount();
        this.jumpCount = 0;
    }
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if(Greenfoot.isKeyDown("RIGHT") || Greenfoot.isKeyDown("D")) {
            move(3);
        }
        
        if(Greenfoot.isKeyDown("LEFT") || Greenfoot.isKeyDown("A")) {
            move(-3);
        }
        
        if(!this.isTouching(Floor.class)) {
            this.setLocation(this.getX(), this.getY()+4);
        }
        
        if(Greenfoot.isKeyDown("SPACE")) {
            if(this.jumpCount < 8) {
                this.setLocation(this.getX(), this.getY()-13);
                this.jumpCount++;
            }
        }
        
        if(this.isTouching(Floor.class)) {
            this.jumpCount = 0;
        }
        
        
        
        Actor a = getOneIntersectingObject(Cobblestone.class);
        Cobblestone b = (Cobblestone) a;
        if(b != null && Greenfoot.mouseClicked(null) && b.getImage().getTransparency() != 0) 
        {
            cobA.incCobble();
            
            b.breakCob();
        }
            
        }
        
    public int getXPos() {
        return this.getX();
    }
    
    public int getYPos() {
        return this.getY();
    }
}
