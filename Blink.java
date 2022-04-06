import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Blink extends Applet {

     public void paint(Graphics S_g) {
     
        int S_a=10,S_b=30,S_c=120,S_d=120;
     
        S_g.setColor(Color.red);
        for(int i=0;i<15;i++)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){}
         
           S_g.drawRoundRect(S_a, S_b, S_c, S_d, 2, 3);
             S_a-=10;
            S_b-=10;
            S_c+=8;
            S_d+=8;
        }
        }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
     }
    // TODO overwrite start(), stop() and destroy() methods

