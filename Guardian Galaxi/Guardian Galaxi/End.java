import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    prepare();
    }

    public void prepare()
    {
        Exit exit = new Exit();
        addObject(exit, 450, 300);
        Awal awal = new Awal();
        addObject(awal, 150, 300);
        Platform platform = new Platform();
        addObject(platform, 100, 350);
        Player1 player1 = new Player1();
        addObject(player1, 100, 340);
        Platform platform2 = new Platform();
        addObject(platform2, 200, 350);
        Platform platform3 = new Platform();
        addObject(platform3, 300, 350);
        Platform platform4 = new Platform();
        addObject(platform4, 400, 350);
        Platform platform5 = new Platform();
        addObject(platform5, 500, 350);
        Platform platform6 = new Platform();
        addObject(platform6, 600, 350);
        Platform platform7 = new Platform();
        addObject(platform7, 20, 350);
    }
}
