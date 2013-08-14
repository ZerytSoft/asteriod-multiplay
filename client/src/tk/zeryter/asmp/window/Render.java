package tk.zeryter.asmp.window;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Render implements Runnable {

    DisplayMode window;

    int size = 10;

    public void run() {

        Shapes s = new Shapes();

        window = new DisplayMode(700, 500);

        try {

            Display.setDisplayMode(window);  //This creates a new windows for OpenGL to be drawn on
            Display.create();
            Display.setTitle("LWJGL");

        } catch (LWJGLException e) {

            e.printStackTrace();
            System.exit(10);

        }

        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 1, -1);    //This sets up the render space for open GL pixW is width pixH is Height
        GL11.glMatrixMode(GL11.GL_MODELVIEW);

        int sizeAdd = 5;

        int asdf = 0;

        while (!Display.isCloseRequested()) {

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);      //Clears the render space

            //Draw to the render space

            s.rectangle(350, 300, 20 + size, 20 + size,1,0,0,80);
            s.rectangle(350, 200, 20 + size, 20 + size,0,1,0,80);
            s.rectangle(350, 250, 20 + size, 20 + size,0,0,1,80);

            s.rectangle(500,300,20 + size,20 + size,0,0,1,80);
            s.rectangle(500,200,20 + size,20 + size,1,0,0,80);
            s.rectangle(500,250,20 + size,20 + size,0,1,0,80);

            s.rectangle(200,300,20 + size,20 + size,0,1,0,80);
            s.rectangle(200,200,20 + size,20 + size,0,0,1,80);
            s.rectangle(200,250,20 + size,20 + size,1,0,0,80);

            //s.triangle(350,250,5,10,5,Math.PI/4);

            Display.update();

                if (size >= 400 | size <= 0) sizeAdd = sizeAdd * -1;

                size = size + sizeAdd;

            //System.out.println("size: " + size);

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }


        }
    }
}
