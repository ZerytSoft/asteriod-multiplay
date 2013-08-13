package tk.zeryter.asmp.window;

import org.lwjgl.opengl.GL11;

public class Shapes {

    public void triangle(int x, int y, double rotation) {

        int[] xPos = {x + (int) (10 * Math.sqrt(5) * Math.cos(rotation + (5 * Math.PI) / 4)), x + (int) (20 * Math.cos(rotation)), x + (int) (10 * Math.sqrt(5) * Math.cos(rotation + (3 * Math.PI) / 4))};
        int[] yPos = {y + (int) (10 * Math.sqrt(5) * Math.sin(rotation + (5 * Math.PI) / 4)), y + (int) (20 * Math.sin(rotation)), y + (int) (10 * Math.sqrt(5) * Math.sin(rotation + (3 * Math.PI) / 4))};

        GL11.glColor3d(0, 1, 0);

        GL11.glBegin(GL11.GL_TRIANGLES);
        GL11.glVertex2i(xPos[0], yPos[0]);
        GL11.glVertex2i(xPos[1], yPos[1]);
        GL11.glVertex2i(xPos[2], yPos[2]);
        GL11.glEnd();
    }

}
