import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;

    public Counter()
    {
        background = getImage();
        value = 100;
        target = 0;
        updateImage();
    }
    
    public void act() 
    {
       if(value < target)
       {
           value++;
           updateImage();
       }
       else if(value > target)
       {
           value--;
           updateImage();
       }
    }    
    
    public void add(int score)
    {
        target += score;
    }
    
    public void minus(int score)
    {
        target -= score;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }
    
    public void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("Darah: " + value,22, Color.BLACK,transparent);
        image.drawImage(text,(image.getWidth()-text.getWidth())/2,(image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
