import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class espacio extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        astronauta a1= new astronauta();
        addObject(a1,50,300);
        crearenemigo(5);
        
    }
    
    public void crearenemigo(int numero){
        for(int i=0;i<numero;i++){
            enemigo e=new enemigo();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(e, x, y);
            
        }
    }
}
