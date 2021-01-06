import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class City2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class City2 extends Actor
{
    public void act() 
    {
        if(canSee(Player.class))
        {
            Greenfoot.playSound("Tada.wav");
            Greenfoot.setWorld(new World3());
        }
            
    }
    /**
     * If the object spots the actor, the level switches.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
}
