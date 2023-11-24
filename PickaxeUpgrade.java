import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HasteUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    
public class PickaxeUpgrade extends Actor
{
    int coins;
    int cost;
    CoinAmount cA;
    Cobblestone cobble;
    CobbleAmount cobA;
    public int counterPickAxe = 0;
    
    public PickaxeUpgrade(CoinAmount cA, CobbleAmount cobA) {
        this.cA = cA;
        this.cost = 1000;
        this.cobA = cobA;
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
        
        if(Greenfoot.mouseClicked(this)) {
            if(counterPickAxe != 6) {
                if(this.coins >= cost) {
                    this.cA.decCoins(this.cost);
                    cobA.incCobbleF();
                    this.cost *= 1.5;
                    counterPickAxe++;
                }
            }
        }
        
    }
    public int getPickAxeCounter() {
        return this.counterPickAxe;
    }
    
}
