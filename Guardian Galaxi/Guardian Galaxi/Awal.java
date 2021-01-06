import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awal extends Actor
{
    /**
     * Act - do whatever the Awal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(canSee(Player1.class))
            Greenfoot.setWorld(new MyWorld());
    }    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }  
}
