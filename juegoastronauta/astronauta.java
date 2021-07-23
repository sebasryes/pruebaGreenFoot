import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class astronauta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class astronauta extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    public void astronauta(){
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setDireccion(UP);
        }
        
        if(Greenfoot.isKeyDown("down")){
            setDireccion(DOWN);
        }
        
        if(Greenfoot.isKeyDown("left")){
            setDireccion(LEFT);
        }
        
        if(Greenfoot.isKeyDown("right")){
            setDireccion(RIGHT);
        }
    }
    
    public void setDireccion(int direccion){
        switch(direccion){
            case UP:
            
            if(Greenfoot.isKeyDown("space")){
            setLocation(getX(), getY()-5);
        }
        else{
            setLocation(getX(), getY()-2);
        }
            break;
            case DOWN:
            
             if(Greenfoot.isKeyDown("space")){
            setLocation(getX(), getY()-5);   
        }else{
            setLocation(getX(), getY()+2);
        }
            break;
            case LEFT:
            
             if(Greenfoot.isKeyDown("space")){
             setLocation(getX()-5,getY());
        }else{
            setLocation(getX()-2,getY());
        }
            break;
            case RIGHT:
            
             if(Greenfoot.isKeyDown("space")){
             setLocation(getX()+5,getY());
        }else{
            setLocation(getX()+2,getY());
        }  
            break;
        }
    }
}
