import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinUpgradeText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinUpgradeText extends Actor
{
    /**
     * Act - do whatever the CoinUpgradeText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().setTransparency(0);
        
        if(Greenfoot.isKeyDown("E")) {
            getImage().setTransparency(255);
        }
        // Add your action code here.
    }
}
