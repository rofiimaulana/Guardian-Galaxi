import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chunk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chunk extends SmoothMover
{
    /**
     * Act - do whatever the Chunk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final Vector GRAVITY = new Vector(90, 1.5);
    
    public Chunk()
    {
        int direction = Greenfoot.getRandomNumber(360);
        int speed = Greenfoot.getRandomNumber(30);
        increaseSpeed(new Vector(direction, speed));
    }
    
    public void act() 
    {
        increaseSpeed(GRAVITY);
        move();
    }    
}
