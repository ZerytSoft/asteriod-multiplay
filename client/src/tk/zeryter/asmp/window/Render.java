package tk.zeryter.asmp.window;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Render implements Runnable{

    DisplayMode window;

    public void run(){

        window = new DisplayMode(700,500);

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

        while (!Display.isCloseRequested()){

            int currentHeight = Display.getHeight(), currentWidth = Display.getWidth();

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);      //Clears the render space

            Display.update();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
}
