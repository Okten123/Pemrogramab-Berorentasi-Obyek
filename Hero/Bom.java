import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bom extends Actor
{
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       turn(1);
       bom();
    }    
    
    int bomTimer =0;
    public void bom(){
        if (bomTimer==60){
            getWorld().removeObject(this);
        }else{
            bomTimer++;
        }
    }
    
}
