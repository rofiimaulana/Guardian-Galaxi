import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound backgroundMusic = new GreenfootSound("4.mp3");
    public void started()
    {
       backgroundMusic.playLoop();
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        prepare();
    }

    public void prepare()
    {
        Platform platform = new Platform();
        addObject(platform, 400, 500);
        Platform platform2 = new Platform();
        addObject(platform2, 500, 500);
        Platform platform3 = new Platform();
        addObject(platform3, 400, 500);
        Platform platform4 = new Platform();
        addObject(platform4, 300, 500);
        Platform platform5 = new Platform();
        addObject(platform5, 200, 500);
        platform.setLocation(100, 500);
        Platform platform6 = new Platform();
        addObject(platform, 349, 5000);
        play1 play1 = new play1();
        addObject(play1, 480, 460);
        about1 about1 = new about1();
        addObject(about1, 250, 460);
        Exit exit = new Exit();
        addObject(exit, 720, 460);
        Player1 player1 = new Player1();
        addObject(player1, 490, 355);
        player1.setLocation(89, 485);
        Platform platform7 = new Platform();
        addObject(platform7, 600, 500);
        Platform platform8 = new Platform();
        addObject(platform8, 700, 500);
        Platform platform9 = new Platform();
        addObject(platform9, 800, 500);
        Platform platform10 = new Platform();
        addObject(platform10, 900, 500);
        Platform platform11 = new Platform();
        addObject(platform11, 950, 500);
        Platform platform12 = new Platform();
        addObject(platform12, 50, 500);
    }
    
}
