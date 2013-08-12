package tk.zeryter.asmp.GUI;

import java.awt.*;

public class Window implements Runnable{

    Frame window;
    Container c = new Container();

    Button exampleButton = new Button("example");

    public void run() {
        window = new Frame("Place Holder Text");
        window.setSize(700,500);
        window.setVisible(true);
        window.addWindowListener(new WindowMonitor());
        window.setResizable(false);

        objects();

    }

    public void objects(){

        c.setBounds(0,0,window.getWidth(),window.getHeight());
        window.add(c);

        //adds and sets a buttons bounds inside the cointainer c
        exampleButton.setBounds(c.getWidth()/2 - 40,c.getHeight()/2 - 20,80,20);
        c.add(exampleButton);
    }

}