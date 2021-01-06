import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyR extends Actor
{
    private int chance = Greenfoot.getRandomNumber(40); ;
    private int life = 30;    

    public void act() 
    {
       setImage("alien21.png");
       chance = Greenfoot.getRandomNumber(40);
       if(chance == 1)
       {
           setImage("alien22.png");
           fire();
           Greenfoot.playSound("m9.wav");
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
    private void fire()
    {
       RBullet bul = new RBullet();
       getWorld().addObject(bul, getX()-22, getY());
       bul.setRotation(getRotation()+(Greenfoot.getRandomNumber(5)-5));
       bul.move(40);
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
