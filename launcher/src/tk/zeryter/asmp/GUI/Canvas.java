//Owen Holloway
//ZerytSoft
package tk.zeryter.asmp.GUI;

import tk.zeryter.asmp.LauncherMain;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Canvas extends java.awt.Canvas {

    Image test;

    public void paint(Graphics g){

        URL url = LauncherMain.class.getResource("/assets/Minecraft-Icon.png");

        try {
            test = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        g.drawLine(0,0,getWidth(),getHeight()); //Regular old drawline
        g.drawImage(test,0,0,this);  //Image stuff .... kinda tricky
    }

}