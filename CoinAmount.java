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
        this.coins = 9999;
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
        this.cF *= 1.5;
    }
    
    public int getCoins() {
        return this.coins;
    }
    
    private String formatCoins() {
        if (this.coins >= 1000000000) {
            double billions = this.coins / 1000000000.0;
            billions = Math.floor(billions * 100);
            billions /= 100;
            return String.format("%.2fB", billions);
        } else if (this.coins >= 1000000) {
            double millions = this.coins / 1000000.0;
            millions = Math.floor(millions * 100);
            millions /= 100;
            return String.format("%.2fM", millions);
        } else if (this.coins >= 1000) {
            double thousands = this.coins / 1000.0;
            thousands = Math.floor(thousands * 100);
            thousands /= 100;
            return String.format("%.2fk", thousands);
        } else {
            return "" + this.coins;
        }
    }
}
