package tk.zeryter.asmp.window;

import static org.lwjgl.opengl.GL11.*;

public class Shapes {

    public void triangle(int x, int y, int width, int height, double rotation) {

        int a = (height / 2), b = (width / 2);

        double hyp = Math.sqrt((a * a) + (b * b));

        double angle1 = 0, angle2 = Math.PI - Math.atan(a / b), angle3 = Math.PI + Math.atan(a / b);

        glColor3d(1, 1, 1);

        glBegin(GL_TRIANGLES);
        glVertex2i((int) (x + ((hyp) * Math.cos(angle1 + rotation))), (int) (y + ((hyp) * Math.sin(angle1 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle2 + rotation))), (int) (y + ((hyp) * Math.sin(angle2 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle3 + rotation))), (int) (y + ((hyp) * Math.sin(angle3 + rotation))));
        glEnd();

    }

    public void triangle(int x, int y, int width, int height, double rotation, double R, double G, double B) {

        int a = (height / 2), b = (width / 2);

        double hyp = Math.sqrt((a * a) + (b * b));

        double angle1 = 0, angle2 = Math.PI - Math.atan(a / b), angle3 = Math.PI + Math.atan(a / b);

        glColor3d(R, G, B);

        glBegin(GL_TRIANGLES);
        glVertex2i((int) (x + ((hyp) * Math.cos(angle1 + rotation))), (int) (y + ((hyp) * Math.sin(angle1 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle2 + rotation))), (int) (y + ((hyp) * Math.sin(angle2 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle3 + rotation))), (int) (y + ((hyp) * Math.sin(angle3 + rotation))));
        glEnd();

    }

    public void triangle(int x, int y, int width, int height, double rotation, double R, double G, double B, double A) {

        int a = (height / 2), b = (width / 2);

        double hyp = Math.sqrt((a * a) + (b * b));

        double angle1 = 0, angle2 = Math.PI - Math.atan(a / b), angle3 = Math.PI + Math.atan(a / b);

        glColor4d(R, G, B, A);

        glBegin(GL_TRIANGLES);
        glVertex2i((int) (x + ((hyp) * Math.cos(angle1 + rotation))), (int) (y + ((hyp) * Math.sin(angle1 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle2 + rotation))), (int) (y + ((hyp) * Math.sin(angle2 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle3 + rotation))), (int) (y + ((hyp) * Math.sin(angle3 + rotation))));
        glEnd();

    }

    public void rectangle(int x, int y, int width, int height, double rotation) {

        int a = (height / 2), b = (width / 2);

        double hyp = Math.sqrt((a * a) + (b * b));

        double angle1 = Math.atan((height / 2) / (width / 2)), angle2 = Math.PI - angle1, angle3 = Math.PI + angle1, angle4 = 2 * Math.PI - angle1;

        glColor3d(1, 1, 1);

        glBegin(GL_QUADS);
        glVertex2i((int) (x + ((hyp) * Math.cos(angle1 + rotation))), (int) (y + ((hyp) * Math.sin(angle1 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle2 + rotation))), (int) (y + ((hyp) * Math.sin(angle2 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle3 + rotation))), (int) (y + ((hyp) * Math.sin(angle3 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle4 + rotation))), (int) (y + ((hyp) * Math.sin(angle4 + rotation))));
        glEnd();

    }

    public void rectangle(int x, int y, int width, int height, double rotation, double R, double G, double B) {

        int a = (height / 2), b = (width / 2);

        double hyp = Math.sqrt((a * a) + (b * b));

        double angle1 = Math.atan((height / 2) / (width / 2)), angle2 = Math.PI - angle1, angle3 = Math.PI + angle1, angle4 = 2 * Math.PI - angle1;

        glColor3d(R, G, B);

        glBegin(GL_QUADS);
        glVertex2i((int) (x + ((hyp) * Math.cos(angle1 + rotation))), (int) (y + ((hyp) * Math.sin(angle1 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle2 + rotation))), (int) (y + ((hyp) * Math.sin(angle2 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle3 + rotation))), (int) (y + ((hyp) * Math.sin(angle3 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle4 + rotation))), (int) (y + ((hyp) * Math.sin(angle4 + rotation))));
        glEnd();

    }

    public void rectangle(int x, int y, int width, int height, double rotation, double R, double G, double B, double A) {

        int a = (height / 2), b = (width / 2);

        double hyp = Math.sqrt((a * a) + (b * b));

        double angle1 = Math.atan((height / 2) / (width / 2)), angle2 = Math.PI - angle1, angle3 = Math.PI + angle1, angle4 = 2 * Math.PI - angle1;

        glColor4d(R, G, B, A);

        glBegin(GL_QUADS);
        glVertex2i((int) (x + ((hyp) * Math.cos(angle1 + rotation))), (int) (y + ((hyp) * Math.sin(angle1 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle2 + rotation))), (int) (y + ((hyp) * Math.sin(angle2 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle3 + rotation))), (int) (y + ((hyp) * Math.sin(angle3 + rotation))));
        glVertex2i((int) (x + ((hyp) * Math.cos(angle4 + rotation))), (int) (y + ((hyp) * Math.sin(angle4 + rotation))));
        glEnd();

    }

    public void polygon(short sides, int x, int y, int width, int height, double rotation) {

        int a = (height / 2), b = (width / 2);

        double hyp = Math.sqrt((a * a) + (b * b));

        double angle[] = new double[sides];

        for (short i = 0; i < sides; i++) {



        }

        glColor3d(1, 1, 1);

        glBegin(GL_POLYGON);
        for (short i = 0; i < sides; i++) {
            glVertex2i((int) (x + ((hyp) * Math.cos(angle[i] + rotation))), (int) (y + ((hyp) * Math.sin(angle[i] + rotation))));
        }

    }
}
