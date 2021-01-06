import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BBullet extends mover
{
    private int life = Greenfoot.getRandomNumber(10)+10;    

    public void act() 
    {
       move(10);
       if(atWorldEdge())
       {
           getWorld().removeObject(this);
        }
    }    
}
