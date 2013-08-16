package tk.zeryter.asmp.window;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Render implements Runnable {

    DisplayMode window;

    public void run() {

        Shapes s = new Shapes();

        window = new DisplayMode(1080, 720);

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

        //Variables for rendering

        int x = 0,y = 0;
        int addX = 5, addY = 5;

        while (!Display.isCloseRequested()) {

            //Clear the render space
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);      //Clears the render space

            //Draw to the render space

            s.rectangle(540 + x,360 + y,60,60,0,0,1,0);

            //Finish drawing
            Display.update();

            x = x + addX;
            y = y + addY;

            if(x <= -540 + (30) | x >= 540 - (30)) {
                addX = addX * -1;
            }

            if(y <= -360 + (30) | y >= 360 - (30)) {
                addY = addY * -1;
            }

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }


        }
    }
}
