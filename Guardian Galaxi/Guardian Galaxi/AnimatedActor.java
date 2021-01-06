import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnimatedActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimatedActor extends mover
{
    private GreenfootImage[] images;
private int currentImage = 0;

/**
 * Construct an animated actor. This assumes that you have provided image
 * file (in the 'images' folder) named 'basenameN.suffix', where N is
 * [0..numberOfImages-1].
 * 
 * @param basename  The base name of the image files.
 * @param suffix  The suffix of the image files (must include the ".").
 * @param noOfImages  The number of images to be use din the animation.
 */
public AnimatedActor()
{
    images = new GreenfootImage[4];
    for(int i=0; i < 4; i++) 
    {
        images[i] = new GreenfootImage("Marco-Run" + i + ".png");
        setImage(images[currentImage]);
    }
    setImage(images[currentImage]);
}


/**
 * Act - do whatever the AnimatedActor wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        currentImage = (currentImage + 1) % images.length;
        setImage(images[currentImage]);
    }
    
}
