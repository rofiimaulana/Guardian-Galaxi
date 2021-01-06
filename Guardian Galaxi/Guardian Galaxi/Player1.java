import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends AnimatedActor
{
    private static final int jumpStrength = 16;
    private int currentImage = 0;
    private GreenfootImage[] images;
    private GreenfootImage[] images2;
    private boolean side;
    
    public Player1()
    {
        images = new GreenfootImage[3];
        images2 = new GreenfootImage[3];
        ;
        for(int i=0; i < 3; i++) 
        {
            images[i] = new GreenfootImage("Marco-Run" + i + ".png");
            setImage(images[currentImage]);
        }
        for(int i=0; i < 3; i++) 
        {
            images2[i] = new GreenfootImage("Marco-RunR" + i + ".png");
            setImage(images2[currentImage]);
        }
        setImage(images[currentImage]);
    }

    public void act()
    {   
        checkFall();
        movement();
    }
    
    /**
     * Controls the movement of the player using the WASD config.
     * Space button fires.
     * S button used for crouching and avoiding fire.
     */
    public void movement()
    {
        if(Greenfoot.isKeyDown("A"))
        {
            currentImage = (currentImage + 1) % images.length;
            setImage(images[currentImage]);
            side = false;
            moveLeft();
        }
        else if(Greenfoot.isKeyDown("D"))
        {
            currentImage = (currentImage + 1) % images2.length;
            setImage(images2[currentImage]);
            side = true;
            moveRight();
        }
        else if(Greenfoot.isKeyDown("S"))
        {
            if(side == true)
                 {
                     setImage("Marco-CrouchR.png");
                     if(Greenfoot.isKeyDown("space"))
                     {
                        setImage("Marco-FireCrouchR.png");
                        fireR();
                        Greenfoot.playSound("M4A1.wav");
                     }
                 }
                 else if(side == false)
                 {
                     setImage("Marco-Crouch.png");
                     if(Greenfoot.isKeyDown("space"))
                     {
                        setImage("Marco-FireCrouch.png");
                        fireRl();
                        Greenfoot.playSound("M4A1.wav");
                     }
                 }
        }
        else if(Greenfoot.isKeyDown("space"))
        {
            if(side == true)
            {
                 setImage("Marco-FireStandR.png");
                 fire();
                 Greenfoot.playSound("M4A1.wav");
            }
            else if(side == false)
            {
                 setImage("Marco-FireStand.png");
                 fireL();
                 Greenfoot.playSound("M4A1.wav");
            }
        }
        else if(Greenfoot.isKeyDown("W"))
        {
             if(onGround())
             {
                 if(side == true)
                 {
                     setImage("Marco-JumpR.png");
                 }
                 else if(side == false)
                 {
                     setImage("Marco-Jump.png");
                 }
                 jump();
             }
        }
        else
        {
            if(side == true)
            {
                 setImage("Marco-RunR0.png");
            }
            else if(side == false)
            {
                 setImage("Marco-Run0.png");
            }
        }
        if(canSee(RBullet.class))
        {
            if(Greenfoot.isKeyDown("S"))
            {
                remove(RBullet.class);
            }
            else
            {
                remove(RBullet.class);
                
                Greenfoot.playSound("Jab.wav");
                
                {
                    Greenfoot.playSound("game-over.wav");
                    explode();
                }
            }
        }
    }
    
    /**
     * Two different fire methods to fire bullets with recoil.
     * Fire() fire right, and firel() fires left.
     */
    
    private void fire()
    {
       BBullet bul = new BBullet();
       getWorld().addObject(bul, getX()-22, getY());
       bul.move(40);
    }
    
    private void fireL()
    {
        BBullet bul = new BBullet();
        getWorld().addObject(bul, getX()-55, getY()-5);
        bul.setRotation((getRotation()+180));
        bul.move(-40);
    }
    
    private void fireR()
    {
       BBullet bul = new BBullet();
       getWorld().addObject(bul, getX()-22, getY());
       bul.setRotation(getRotation()+(Greenfoot.getRandomNumber(5)-5));
       bul.move(40);
    }
    
    private void fireRl()
    {
        BBullet bul = new BBullet();
        getWorld().addObject(bul, getX()-55, getY()-5);
        bul.setRotation((getRotation()+180)+(Greenfoot.getRandomNumber(5)));
        bul.move(-40);
    }
    
    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }
    
    private void checkFall()
    {
        if(onGround())
            setVSpeed(0);
        else
            fall();
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
