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
        
        Floor floor = new Floor();
        
        this.addObject(floor, 300, 340);

        LavaGen lg = new LavaGen();

        this.addObject(lg, 515, 231);

        Cobblestone cobble = new Cobblestone();

        this.addObject(cobble, 490, 231);

        CobbleCount cobC = new CobbleCount();

        this.addObject(cobC, 525, 40);

        CobbleAmount cobA = new CobbleAmount();

        this.addObject(cobA, 560, 40);

        Character steve = new Character(cobA);
        
        Cave cave = new Cave(steve);
        
        this.addObject(cave, 300, 155);
        
        CoinCount cc = new CoinCount();

        this.addObject(cc, 380, 40);

        CoinAmount ca = new CoinAmount();

        this.addObject(ca, 415, 40);

        this.addObject(steve, 100, 230);

        SellPoint sp = new SellPoint(cobA, ca);

        this.addObject(sp, 40, 255);

        PickaxeStone sP = new PickaxeStone(steve);

        this.addObject(sP, 40, 215);

        // Adds a Shop which can be opened by pressing E
        Shop shop = new Shop();

        this.addObject(shop, 300, 200);

        WaitCount waitC = new WaitCount();

        this.addObject(waitC, 0, 0);

        SellTent sT = new SellTent();

        this.addObject(sT, 40, 215);

        CoinUpgrade moreCoins = new CoinUpgrade(ca);

        this.addObject(moreCoins, 246, 80);

        CoinUpgradeText cUT = new CoinUpgradeText();

        this.addObject(cUT, 332, 80);
        
        /* Mob mob = new Mob(steve);
        
        this.addObject(mob, 500, 230);
        
        Head head = new Head(mob);
        
        this.addObject(head, 500, 230);
        
        Torso torso = new Torso(mob);
        
        this.addObject(torso, 500, 230);
        
        Legs legs = new Legs(mob);
        this.addObject(legs, 500, 230); */
        
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
