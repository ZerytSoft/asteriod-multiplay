package tk.zeryter.asmp.GUI;

import java.awt.*;

public class Canvas extends java.awt.Canvas {

    public void paint(Graphics g){
        System.out.println("paint");

        clear(g);

        g.drawLine(0,0,getWidth(),getHeight());

    }

    public void clear(Graphics g){

        g.clearRect(0,0,getWidth(),getHeight());

    }

}