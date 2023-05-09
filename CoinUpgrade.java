import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinUpgrade extends Actor
{
    int coins;
    int cost;
    CoinAmount cA;
    public CoinUpgrade(CoinAmount cA) {
        this.cA = cA;
        this.cost = 100;
    }
    
    /**
     * Act - do whatever the CoinUpgrade wants to do. This method is called whenever
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
            if(this.coins >= cost) {
                this.cA.decCoins(this.cost);
                this.cA.incCF();
                this.cost *= 1.75;
            }
        }
        
        
    }
}
