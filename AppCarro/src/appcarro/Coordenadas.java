
package appcarro;

import java.awt.event.KeyEvent;

/**
 *
 * @author LUIS R
 */
public class Coordenadas{
    private int x,y,dx,dy;
    public Coordenadas(){
      x=0;
      y=0;
      dx=0;
      dy=0;
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
      if(key==KeyEvent.VK_RIGHT){
          dx=5;
      }
      if(key==KeyEvent.VK_LEFT){
          dx=-5;
      }
      if(key==KeyEvent.VK_UP){
          dy=-5;
      }
      if(key==KeyEvent.VK_DOWN){
          dx=5;
      }
    }
     public void keyReleased(KeyEvent e) {
      int key = e.getKeyCode();   
      if(key==KeyEvent.VK_RIGHT){
          dx=0;
      }
      if(key==KeyEvent.VK_LEFT){
          dx=0;
      }
      if(key==KeyEvent.VK_UP){
          dy=0;
      }
      if(key==KeyEvent.VK_DOWN){
          dx=0;
      }
    }
    public void mover(){
        x+=dx;
        y+=dy;
      }
      public int cx(){
        return x;
      }
      public int cy(){
        return y;
      }
}
