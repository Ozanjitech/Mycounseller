/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package famtupredict;

import java.awt.Dimension;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mr. Mohammed
 */
public class FamtuPredict {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         SwingUtilities.invokeLater(new Runnable(){

          @Override
          public void run() {
          HomeWindow Home = new HomeWindow();
             Home.setSize(1170, 643);
             Home.setMinimumSize(new Dimension(1170,643));
                 Home.setVisible(true);
          }
          
      });
    }
    
}
