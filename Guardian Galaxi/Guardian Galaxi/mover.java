import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mover extends Actor
{
    private static final int acceleration = 2;      // down (gravity)
    private static final int speed = 7;             // running speed (sideways)
    private static final int numFragments = 40;
    
    private int vSpeed = 0;                         // current vertical speed
    

    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }
    
    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
    }
    
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
        return under != null;
    }

    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }
    
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if ( atBottom() )
            this.explode();
    }
    
    private boolean atBottom()
    {
        return getY() >= getWorld().getHeight() - 2;
    }
    
    private void gameEnd()
    {
        Greenfoot.stop();
    }

    public void explode()
    {
        placeDebris(getX(), getY());
        getWorld().removeObject(this);
    }
    
    public boolean atWorldEdge()
    {
        
        return ((getX() < 2)||(getX() >= getWorld().getWidth() - 2));
    }
    
    private void placeDebris(int x, int y)
    {
        for(int i = 0; i < 20; i++)
        {
          getWorld().addObject(new Chunk(), x, y);  
        }
    }
    }    
