<a name="title"></a>
# CobbleCock

## Table of contents

- [Title](#title)
- [Information](#mainpart)
	- [Resources Used](#resources)
	- [Images](#images)


<a name="mainpart"></a>
## Information

This is the README.md file to our game "CobbleCock". It is a project that I, Nikita Schaar, and my friends 
Manuel Pirkmann and Janik Gierer are working on. We are working on it for our school's **POS** class and
don't completely know what we're doing, but we're trying our best.

<a name="resources"></a>
### Resources used
Because we're making our game with Java, we're using a library that's intended for Game development, 
that's called Greenfoot. For the version control we're using Git/GitHub and the tool we use for making
game sprites is called Aseprite. The links to all these tools are below this text:

- [Greenfoot](https://greenfoot.org/door)
- [GitHub](https://github.com/)
- [Aseprite](https://aseprite.com)

<a name="images"></a>
### Images
![Screenshot of the temporary start screen.](/images/GitHub_Doc/StartScreen.png)

This is our temporary Start Screen, which we are going to change soon and just used for testing purposes.

![Screenshot of the gameplay.](/images/GitHub_Doc/Gameplay.png)

This is the newest version of our gameplay as of today. It still looks quite unpolished and we'll have
to rework a lot of files, but the gameplay at least works and doesn't have any major bugs ~~(right now)~~

![Screenshot of the item shop with one available item to buy.](/images/GitHub_Doc/Gameplay_Shop.png)

This is how our item shop looks as of today. It has one buyable item for now, but as you can see, we're
working on five other upgrades already (maybe we'll make even more).


<a name="future"></a>
### Plans for the future
- Reduce data redundancy/Make files more compact/readable
	- Our "MyWorld.java" file looks like that right now and is just very barely readable (also only for us who are working on the project).
	```java
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
	
	        CobbleAmount cobA = new CobbleAmount();
	
	        this.addObject(cobA, 560, 40);
	
	        Character steve = new Character(cobA);
	
	        this.addObject(steve, 100, 230);
	
	        SellPoint sp = new SellPoint(cobA, ca);
	
	        this.addObject(sp, 40, 255);
	
	        // Adds a Nametag which follows the player
	        Nametag nt = new Nametag(steve);
	
	        this.addObject(nt, 100, 177);
	
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
	```

