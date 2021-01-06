import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class about here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class about extends World
{

    /**
     * Constructor for objects of class about.
     * 
     */
    public about()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        prepare();
    }
    public void prepare()
    {
        Platform platform = new Platform();
        addObject(platform, 30, 500);
        Player1 player1 = new Player1();
        addObject(player1, 30, 480);
        Home home = new Home();
        addObject(home, 40, 450);
        Platform platform2 = new Platform();
        addObject(platform2, 160, 500);
        Platform platform3 = new Platform();
        addObject(platform3, 290, 500);
        Platform platform4 = new Platform();
        addObject(platform4, 420, 500);
        Platform platform5 = new Platform();
        addObject(platform5, 550, 500);
        Platform platform6 = new Platform();
        addObject(platform6, 650, 500);
        Platform platform7 = new Platform();
        addObject(platform7, 750, 500);
        Platform platform8 = new Platform();
        addObject(platform8, 850, 500);
        Platform platform9 = new Platform();
        addObject(platform9, 950, 500);
    }
}
