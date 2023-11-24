import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class CoinAmount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinAmount extends Actor
{
    int coins;
    double cF;
    public CoinAmount() {
        this.coins = 1000000000;
        this.cF = 1;
    }
    /**
     * Act - do whatever the CoinAmount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        this.setImage(new GreenfootImage("" + this.formatCoins(), 25, Color.BLACK, null));
    }
    

    
    public void incCoins(int cobA) {
        this.coins += this.cF * cobA;
    }
    
    public void zeroCoins() {
        this.coins = 0;
    }
    
    public void decCoins(int coinA) {
        this.coins -= coinA;
    }
    
    public void incCF() {
        this.cF *= 2;
    }
    
    public int getCoins() {
        return this.coins;
    }
    
    private String formatCoins() {
        if (this.coins >= 1000000000) {
            double billions = this.coins / 1000000000.0;
            return billions + "B";
        } else if (this.coins >= 1000000) {
            double millions = this.coins / 1000000.0;
            return millions + "M";
            //return String.format("%2f.");
        } else if (this.coins >= 1000) {
            double thousands = this.coins / 1000.0;
            return thousands + "k";
        } else {
            return "" + this.coins;
        }
    }
}
