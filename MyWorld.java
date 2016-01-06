import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

public class MyWorld extends World
{

    public MyWorld()
    {    
        super(600, 400, 1);
        JOptionPane.showMessageDialog(null, "Aby grać kółkiem wciskaj 'o' i klikaj, krzyżykiem - 'x' i klikaj." + "\n" + "Gra dla dwóch graczy!");

    }
    
    public void act()
    {
      
                
        if(Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse=Greenfoot.getMouseInfo();
            int mX=mouse.getX(), mY=mouse.getY();

     
        if(Greenfoot.isKeyDown("o"))
        {
            Kolko kolko = new Kolko();
            addObject(kolko, mX, mY);
            
        }
       else if(Greenfoot.isKeyDown("x"))
        {
            Krzyzyk krzyzyk = new Krzyzyk();
            addObject(krzyzyk, mX, mY);;
        }
        
   
    
      }
    }
 }

