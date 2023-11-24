import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo) 


/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage bg = new GreenfootImage("Background.png");
        // bg.scale(960, 540);

        // GreenfootSound gs = new GreenfootSound("Minecraft.mp3");
        // gs.playLoop();

        this.setBackground(bg);

        //Cloud1 c1 = new Cloud1();

        //this.addObject(c1, 300, 200);

        LavaGen lg = new LavaGen();

        this.addObject(lg, 515, 231);

        Cobblestone cobble = new Cobblestone();

        this.addObject(cobble, 490, 231);

        CoinCount cc = new CoinCount();

        this.addObject(cc, 380, 40);

        CoinAmount ca = new CoinAmount();

        this.addObject(ca, 415, 40);

        CobbleCount cobC = new CobbleCount();

        this.addObject(cobC, 525, 40);

        

        // Adds a Nametag which follows the player
        

        

        // Adds a Shop which can be opened by pressing E
        Shop shop = new Shop();

        this.addObject(shop, 300, 200);

        WaitCount waitC = new WaitCount();

        this.addObject(waitC, 0, 0);

        SellTent sT = new SellTent();

        this.addObject(sT, 40, 215);

        CoinUpgrade moreCoins = new CoinUpgrade(ca);

        this.addObject(moreCoins, 246, 80);
        
        HasteUpgrade haste = new HasteUpgrade(ca,cobble);

        this.addObject(haste, 246, 128);
        
        CobbleAmount cobA = new CobbleAmount();

        this.addObject(cobA, 560, 40);

        SellPoint sp = new SellPoint(cobA, ca);

        this.addObject(sp, 40, 255);
        
        PickaxeUpgrade moreCobble = new PickaxeUpgrade(ca, cobA);

        this.addObject(moreCobble, 246, 177);
        
        Character steve = new Character(cobA, moreCobble);

        this.addObject(steve, 100, 230);
        
        Nametag nt = new Nametag(steve);

        this.addObject(nt, 100, 177);
        
        PickaxeStone sP = new PickaxeStone(steve, moreCobble);

        this.addObject(sP, 40, 215);

        CoinUpgradeText cUT = new CoinUpgradeText();

        this.addObject(cUT, 332, 80);
        
        HasteUpgradeText hUT = new HasteUpgradeText();

        this.addObject(hUT, 332, 128);
        
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
