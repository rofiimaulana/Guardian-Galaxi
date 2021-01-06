import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyL extends Actor
{
    private int chance = Greenfoot.getRandomNumber(40); ;
    private int life = 30;    

    public void act() 
    {
       setImage("alien11.png");
       chance = Greenfoot.getRandomNumber(40);
       if(chance == 1)
       {
           setImage("alien12.png");
           Greenfoot.playSound("m9.wav");
           firel();
       }
       if(canSee(BBullet.class))
       {
            remove(BBullet.class);
            life--;
       }
       if(life == 0)
       {
           Greenfoot.playSound("Explosion.wav");
           explode();
       }
    }     
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    public void remove(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
    private void firel()
    {
        RBullet bul = new RBullet();
        getWorld().addObject(bul, getX()-22, getY()-5);
        bul.setRotation((getRotation()+180)+(Greenfoot.getRandomNumber(1)));
        bul.move(-40);
    }
    private void placeDebris(int x, int y)
    {
        for(int i = 0; i < 20; i++)
        {
          getWorld().addObject(new Chunk(), x, y);  
        }
    }
    public void explode()
    {
        placeDebris(getX(), getY());
        getWorld().removeObject(this);
    }
}
