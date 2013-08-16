package tk.zeryter.asmp.window;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

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

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), 1, -1);    //This sets up the render space for open GL pixW is width pixH is Height
        glMatrixMode(GL_MODELVIEW);

        //Variables for rendering

        while (!Display.isCloseRequested()) {

            //Clear the render space
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);      //Clears the render space

            //Draw to the render space

            glColor3d(0.0, 0.0, 0.0);

            glBegin(GL_QUADS);
            glVertex2i(0, 0);
            glVertex2i(0, Display.getHeight());
            glVertex2i(Display.getWidth(), Display.getHeight());
            glVertex2i(Display.getWidth(), 0);
            glEnd();

            try {
                Thread.sleep(8);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

            //Finish drawing
            Display.update();

        }
    }
}
