<a name="title"></a>

- [Title/Basic game mechanics](#title)
- [Information about the developer](#information)
- [Progress](#progress)
- [Updates](#futurePlans)
- [Looks of the Game](#images)
- [Division of Laber](#timeOfWork)
- [Sources](#sources)

# CobbleCock 
A documentation about the progress of the game Cobblecock made by Schaar, Pirkmann, Gierer. The Basic mechanics of the game is inspired by cookie clicker games you need to break a cobblestone to make money and buy upgrades until you have enough to buy the "Cobble Cock" to finish the game 


<a name="information"></a>
## Developer information
### Programming
This Game was mainly programmed by Nikita Schaar and Manuel Pirkmann. The programming libary we use is **Greenfoot** the informations about this libary are linked in the [sources](#sources) tab. The programming language used for this game is Java  


### Design
The pixel art was mostly designed and made by Janik Gierer and the programm he uses to design all of the images is **Aseprite** which is also linked at the sources tab [sources](#sources)




<a name="progress"></a>
## Progress of the game right now
The basic design and code of the game is already finished but we need to work on the design of some images because they do not look good enough. Things that are working of the game are the basic mechanics of the game. [Basic game mechanics](#title)

 

<a name="futurePlans"></a>
## Updates of the game that will release in the future
- Implement a new World which is a dungeon 
- Fix graphic issues(example: our Cloud in the background)
- Finish the upgrades in the shop
- Reduce the data redundancy
- Animate our main character
- Implement a stock market

This are some updates we are focusing right now 

Here is the code of our probleme that we need to Reduce the data redundancy
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
        
        HasteUpgrade haste = new HasteUpgrade(ca,cobble);

        this.addObject(haste, 246, 128);

        CoinUpgradeText cUT = new CoinUpgradeText();

        this.addObject(cUT, 332, 80);
        prepare();
    }

```

<a name="images"></a>
## Here are some images of our Game at the moment <br>

### This is the Start screen
![Screenshot of the temporary start screen.](/images/GitHub_Doc/StartScreen.png)

<br>

### Here is a Screenshot of the Game when you are playing

![Screenshot of the gameplay.](/images/GitHub_Doc/Gameplay.png)

<br>

<a name="timeOfWork"></a>

## Division of Laber
| Design| Coding| Version Managment |
| ------------- |:-------------:|:-------------:|
| Janik Gierer| Nikita Schaar| Nikita Schaar |
| ------------| Manuel Pirkmann | Manuel Pirkmann |


<br>

---


<br>

<a name="sources"></a>
## Links to the apps we use to programm, design and manage our game

Aseprite: https://www.aseprite.org/<br>
Greenfoot: https://www.greenfoot.org/door<br> 
GitHub: https://github.com/<br>






