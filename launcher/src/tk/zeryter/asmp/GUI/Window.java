package tk.zeryter.asmp.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import tk.zeryter.asmp.LauncherMain;

public class Window implements Runnable, ActionListener{

    Frame window;
    Container c = new Container();
    tk.zeryter.asmp.GUI.Canvas canvas = new tk.zeryter.asmp.GUI.Canvas(); //This is set as the canvas in the package

    Image icon;

    Button exampleButton = new Button("example");

    public void run() {

        //This sets up the image for use as the icon
        URL url = LauncherMain.class.getResource("/assets/icon.png");
        try {
            icon = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //This starts the widow (frame)
        window = new JFrame("Place Holder Text");
        window.setSize(700,500);
        window.setVisible(true);
        window.addWindowListener(new WindowMonitor());
        window.setResizable(false);
        window.setIconImage(icon);

        //Container for holding elements
        c.setBounds(0,0,window.getWidth(),window.getHeight());
        window.add(c);

        //Put objects inside the container, which is in the frame
        objects();

    }

    public void objects(){



        //adds and sets a buttons bounds inside the cointainer c
        exampleButton.setBounds(c.getWidth()/2 - 40,c.getHeight()/2 - 20,80,20);
        exampleButton.setBackground(Color.BLACK);
        exampleButton.addActionListener(this);  //Action listener
        c.add(exampleButton);  //Add to container c

        //add a canvas that can be drawn on with graphics
        canvas.setBounds(0,0,c.getWidth(),c.getHeight() - 20);
        c.add(canvas); //Add to container c
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Someone did an action");
    }
}