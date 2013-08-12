package tk.zeryter.asmp.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

import tk.zeryter.asmp.LauncherMain;

public class Window implements Runnable{

    Frame window;
    Container c = new Container();
    tk.zeryter.asmp.GUI.Canvas canvas = new tk.zeryter.asmp.GUI.Canvas(); //This is set as the canvas in the package

    Image icon;

    Button exampleButton = new Button("example");

    public void run() {
        URL url = LauncherMain.class.getResource("/assets/icon.png");

        try {
            icon = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        window = new JFrame("Place Holder Text");
        window.setSize(700,500);
        window.setVisible(true);
        window.addWindowListener(new WindowMonitor());
        window.setResizable(false);
        window.setIconImage(icon);

        objects();

    }

    public void objects(){

        c.setBounds(0,0,window.getWidth(),window.getHeight());
        window.add(c);

        //adds and sets a buttons bounds inside the cointainer c
        exampleButton.setBounds(c.getWidth()/2 - 40,c.getHeight()/2 - 20,80,20);
        exampleButton.setBackground(Color.BLACK);
        c.add(exampleButton);

        //add a canvas that can be drawn on with graphics
        canvas.setBounds(0,0,c.getWidth(),c.getHeight());
        c.add(canvas);
    }

}