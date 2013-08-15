package tk.zeryter.asmp.window;

import static org.lwjgl.opengl.GL11.*;

public class Shapes {

    public void triangle(int x, int y, double v1, double v2, double v3, double rotation,double R, double G, double B) {

        int[] xPos = {x + (int) (v1 * Math.cos(rotation + (5 * Math.PI) / 4)), x + (int) (v2 * Math.cos(rotation)), x + (int) (v3 * Math.cos(rotation + (3 * Math.PI) / 4))};
        int[] yPos = {y + (int) (v1 * Math.sin(rotation + (5 * Math.PI) / 4)), y + (int) (v2 * Math.sin(rotation)), y + (int) (v3 * Math.sin(rotation + (3 * Math.PI) / 4))};

        glColor3d(R, G, B);

        glBegin(GL_TRIANGLES);
            glVertex2i(xPos[0], yPos[0]);
            glVertex2i(xPos[1], yPos[1]);
            glVertex2i(xPos[2], yPos[2]);
        glEnd();
    }

    public void triangle(int x, int y,double v1, double v2, double v3, double rotation) {

        int[] xPos = {x + (int) (v1 * Math.cos(rotation + (5 * Math.PI) / 4)), x + (int) (v2 * Math.cos(rotation)), x + (int) (v3 * Math.cos(rotation + (3 * Math.PI) / 4))};
        int[] yPos = {y + (int) (v1 * Math.sin(rotation + (5 * Math.PI) / 4)), y + (int) (v2 * Math.sin(rotation)), y + (int) (v3 * Math.sin(rotation + (3 * Math.PI) / 4))};

        glBegin(GL_TRIANGLES);
            glVertex2i(xPos[0], yPos[0]);
            glVertex2i(xPos[1], yPos[1]);
            glVertex2i(xPos[2], yPos[2]);
        glEnd();
    }

    public void rectangle(int x, int y, int width, int height, double rotation){

        int a = (height/2), b = (width/2);

        double hyp = Math.sqrt((a*a)+(b*b));

        double angle = Math.atan((-height/2)/(-width/2));

        glColor3d(1, 1, 1);

        glBegin(GL_QUADS);
            glVertex2i((int) (x + ((hyp) * Math.cos(angle + rotation))), (int) (y + ((hyp) * Math.sin(angle + rotation))));
            glVertex2i((int) (x - ((hyp) * Math.cos(angle - rotation))), (int) (y + ((hyp) * Math.sin(angle - rotation))));
            glVertex2i((int) (x - ((hyp) * Math.cos(angle + rotation))), (int) (y - ((hyp) * Math.sin(angle + rotation))));
            glVertex2i((int) (x + ((hyp) * Math.cos(angle - rotation))), (int) (y - ((hyp) * Math.sin(angle - rotation))));
        glEnd();;

    }

    public void rectangle(int x, int y, int width, int height, double rotation,double R,double G,double B){

        int a = (height/2), b = (width/2);

        double hyp = Math.sqrt((a*a)+(b*b));

        double angle = Math.atan((-height/2)/(-width/2));

        glColor3d(R, G, B);

        glBegin(GL_QUADS);
            glVertex2i((int) (x + ((hyp) * Math.cos(angle + rotation))), (int) (y + ((hyp) * Math.sin(angle + rotation))));
            glVertex2i((int) (x - ((hyp) * Math.cos(angle - rotation))), (int) (y + ((hyp) * Math.sin(angle - rotation))));
            glVertex2i((int) (x - ((hyp) * Math.cos(angle + rotation))), (int) (y - ((hyp) * Math.sin(angle + rotation))));
            glVertex2i((int) (x + ((hyp) * Math.cos(angle - rotation))), (int) (y - ((hyp) * Math.sin(angle - rotation))));
        glEnd();

    }

    public void rectangle(int x, int y, int width, int height, double rotation,double R,double G,double B, double A){

        int a = (height/2), b = (width/2);

        double hyp = Math.sqrt((a*a)+(b*b));

        double angle = Math.atan((-height/2)/(-width/2));

        glColor4d(R, G, B, A);

        glBegin(GL_QUADS);
            glVertex2i((int) (x + ((hyp) * Math.cos(angle + rotation))), (int) (y + ((hyp) * Math.sin(angle + rotation))));
            glVertex2i((int) (x - ((hyp) * Math.cos(angle - rotation))), (int) (y + ((hyp) * Math.sin(angle - rotation))));
            glVertex2i((int) (x - ((hyp) * Math.cos(angle + rotation))), (int) (y - ((hyp) * Math.sin(angle + rotation))));
            glVertex2i((int) (x + ((hyp) * Math.cos(angle - rotation))), (int) (y - ((hyp) * Math.sin(angle - rotation))));
        glEnd();

    }
}
