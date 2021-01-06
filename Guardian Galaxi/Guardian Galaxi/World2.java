import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 450, 1); 
        prepare();
    }
    
    public void prepare()
    {
        Counter counter = new Counter();
        addObject(counter, 551, 28);
        City2 city2 = new City2();
        addObject(city2, 50, 30);
        Platform platform = new Platform();
        addObject(platform, 30, 390);
        Player player = new Player(counter);
        addObject(player, 30, 370);
        Platform platform2 = new Platform();
        addObject(platform2, 160, 390);
        Platform platform3 = new Platform();
        addObject(platform3, 290, 390);
        Platform platform4 = new Platform();
        addObject(platform4, 420, 390);
        Platform platform5 = new Platform();
        addObject(platform5, 550, 390);
        Platform platform6 = new Platform();
        addObject(platform6, 550, 330);
        //Second Level
        Platform platform7 = new Platform();
        addObject(platform7, 120, 270);
        Platform platform8 = new Platform();
        addObject(platform8, 360, 270);
        Platform platform9 = new Platform();
        addObject(platform9, 430, 270);
        Platform platform10 = new Platform();
        addObject(platform10, 280, 270);
        Platform platform11 = new Platform();
        addObject(platform11, 200, 270);
        Platform platform12 = new Platform();
        addObject(platform12, 50, 270);
        Platform platform13 = new Platform();
        addObject(platform13, 50, 210);
        //Third Level
        Platform platform15 = new Platform();
        addObject(platform15, 160, 150);
        Platform platform16 = new Platform();
        addObject(platform16, 290, 150);
        Platform platform17 = new Platform();
        addObject(platform17, 420, 150);
        Platform platform18 = new Platform();
        addObject(platform18, 550, 150);
         Platform platform19 = new Platform();
        addObject(platform19, 550, 90);
        //Forth Level
        Platform platform20 = new Platform();
        addObject(platform20, 120, 60);
        Platform platform21 = new Platform();
        addObject(platform21, 360, 60);
        Platform platform22 = new Platform();
        addObject(platform22, 430, 60);
        Platform platform23 = new Platform();
        addObject(platform23, 280, 60);
        Platform platform24 = new Platform();
        addObject(platform24, 200, 60);
        Platform platform25 = new Platform();
        addObject(platform25, 50, 60);
        //EnemiesR
        EnemyR enr0 = new EnemyR();
        addObject(enr0, 100, 255);
        EnemyR enr1 = new EnemyR();
        addObject(enr1, 300, 255);
        
        //EnemiesL
        EnemyL enl0 = new EnemyL();
        addObject(enl0, 200, 135);
        EnemyL enl1 = new EnemyL();
        addObject(enl1, 400, 135);
        EnemyL enl2 = new EnemyL();
        addObject(enl2, 500, 135);
    }
}
