import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HasteUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    
public class HasteUpgrade extends Actor
{
    int coins;
    int cost;
    CoinAmount cA;
    Cobblestone cobble;
    int counter = 0;
    
    public HasteUpgrade(CoinAmount cA, Cobblestone cobble) {
        this.cA = cA;
        this.cost = 1000;
        this.cobble = cobble;
    }
    /**
     * Act - do whatever the HasteUpgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.coins = this.cA.coins;
        getImage().setTransparency(0);
        if(Greenfoot.isKeyDown("E")) {
            getImage().setTransparency(255);
        }
        if(counter != 30) {
            if(Greenfoot.mouseClicked(this)) {
                if(this.coins >= cost) {
                    this.cA.decCoins(this.cost);
                    this.cost *= 1.5;
                    cobble.maxFrames -= 2;
                    counter += 1;
                
                
            }
        }
    }
    }
}
