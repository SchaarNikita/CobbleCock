import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SellPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SellPoint extends Actor
{
    CobbleAmount cobA;
    CoinAmount ca;
    public SellPoint(CobbleAmount cobA, CoinAmount ca) {
        this.cobA = cobA;
        this.ca = ca;
    }
    /**
     * Act - do whatever the SellPoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor c = getOneIntersectingObject(Character.class);
        if(c != null) {
            this.ca.incCoins(this.cobA.cobble);
            this.cobA.zeroCobble();
        }
    }
}
