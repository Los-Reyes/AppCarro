package appcarro;

import javax.swing.JFrame;

/**
 *
 * @author LUIS R
 */
public class AppCarro {

    public static void main(String[] args) {
      JFrame fr= new JFrame();
      fr.setTitle("Carro");
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Auto au = new Auto();
      fr.add(au);
      fr.pack();
      fr.setVisible(true);
    }
    
}
