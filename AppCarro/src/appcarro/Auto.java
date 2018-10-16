package appcarro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author LUIS R
 */
public class Auto extends JPanel implements KeyListener,ActionListener{
    GeneralPath ruta= new GeneralPath();
    Coordenadas cor = new Coordenadas();
    Timer timer = new Timer(5,this);
    private boolean derecha;
    private boolean n;
    private double x,y;
    public Auto(){
        timer.start();
        derecha=false;
        n=false;
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.DARK_GRAY);
        this.addKeyListener(this);
        this.setFocusable(true);
    }
    @Override 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.WHITE);
        Ellipse2D ep = new Ellipse2D.Double(60,225,50,50);
        Ellipse2D ep1 = new Ellipse2D.Double(230,225,50,50);
        if(n==false){
          g2.draw(ep);
          g2.draw(ep1);
        }
        //if(derecha){
          Ellipse2D ep2 = new Ellipse2D.Double(60+cor.cx(),225,50,50);
          ruta.moveTo(120+cor.cx(), 250);
          ruta.lineTo(220+cor.cx(), 250);
          Ellipse2D ep3 = new Ellipse2D.Double(230+cor.cx(),225,50,50);
          g2.draw(ep3);
          ruta.curveTo(215+cor.cx(), 230, 270+cor.cx(), 190, 290+cor.cx(), 250);
          ruta.lineTo(310+cor.cx(), 250);
          ruta.curveTo(320+cor.cx(),190 ,280+cor.cx(),215 , 225+cor.cx(), 180);
          ruta.curveTo(200+cor.cx(), 160, 110+cor.cx(), 150, 60+cor.cx(), 170);
          ruta.curveTo(40+cor.cx(), 190, 35+cor.cx(), 210, 30+cor.cx(), 230);
          ruta.curveTo(15+cor.cx(), 230, 10+cor.cx(), 245, 30+cor.cx(), 250);
          ruta.lineTo(50+cor.cx(), 250);
          ruta.curveTo( 45+cor.cx(), 230, 105+cor.cx(), 190, 120+cor.cx(), 250);
          ruta.closePath();
          Area a = new Area(ruta);
          Area aep = new Area(ep2);
          Area aep1 = new Area(ep3);
          a.add(aep);
          a.add(aep1);
          g2.draw(a);
          g2.draw(ruta);
        //}
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
       
    }
   
    @Override
    public void keyPressed(KeyEvent e) {
       n=true;
      cor.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
      cor.keyReleased(e);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cor.mover();
        repaint();
    }
}
