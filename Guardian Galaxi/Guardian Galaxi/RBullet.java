import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RBullet extends mover
{
    private int life = Greenfoot.getRandomNumber(10)+10;    

    public void act() 
    {
       move(3);
       if(atWorldEdge())
       {
           getWorld().removeObject(this);
        }
    }    
}
