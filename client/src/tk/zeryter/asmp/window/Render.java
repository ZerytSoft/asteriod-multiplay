package tk.zeryter.asmp.window;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Render implements Runnable {

    DisplayMode window;

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

        while (!Display.isCloseRequested()) {

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);      //Clears the render space

            //Draw to the render space

            rectangle(350, 250, 20, 20);

            Display.update();

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }


        }
    }

    public void rectangle(int x, int y, int width, int height){

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2i(x - width/2,y + height/2);
        GL11.glVertex2i(x + width/2,y + height/2);
        GL11.glVertex2i(x + width/2,y - height/2);
        GL11.glVertex2i(x - width/2,y - height/2);
        GL11.glEnd();

    }
}
