package tk.zeryter.asmp.window;

import org.lwjgl.opengl.GL11;

public class Shapes {

    public void triangle(int x, int y, double v1, double v2, double v3, double rotation,double R, double G, double B) {

        int[] xPos = {x + (int) (v1 * Math.cos(rotation + (5 * Math.PI) / 4)), x + (int) (v2 * Math.cos(rotation)), x + (int) (v3 * Math.cos(rotation + (3 * Math.PI) / 4))};
        int[] yPos = {y + (int) (v1 * Math.sin(rotation + (5 * Math.PI) / 4)), y + (int) (v2 * Math.sin(rotation)), y + (int) (v3 * Math.sin(rotation + (3 * Math.PI) / 4))};

        GL11.glColor3d(R, G, B);

        GL11.glBegin(GL11.GL_TRIANGLES);
            GL11.glVertex2i(xPos[0], yPos[0]);
            GL11.glVertex2i(xPos[1], yPos[1]);
            GL11.glVertex2i(xPos[2], yPos[2]);
        GL11.glEnd();
    }

    public void triangle(int x, int y,double v1, double v2, double v3, double rotation) {

        int[] xPos = {x + (int) (v1 * Math.cos(rotation + (5 * Math.PI) / 4)), x + (int) (v2 * Math.cos(rotation)), x + (int) (v3 * Math.cos(rotation + (3 * Math.PI) / 4))};
        int[] yPos = {y + (int) (v1 * Math.sin(rotation + (5 * Math.PI) / 4)), y + (int) (v2 * Math.sin(rotation)), y + (int) (v3 * Math.sin(rotation + (3 * Math.PI) / 4))};

        GL11.glBegin(GL11.GL_TRIANGLES);
            GL11.glVertex2i(xPos[0], yPos[0]);
            GL11.glVertex2i(xPos[1], yPos[1]);
            GL11.glVertex2i(xPos[2], yPos[2]);
        GL11.glEnd();
    }

    public void rectangle(int x, int y, int width, int height, double rotation){

        System.out.println("width: " + width + " height: " + height);

        System.out.println("rotation: " + rotation);

        int a = (height/2), b = (width/2);

        double hyp = Math.sqrt((a*a)+(b*b));

        System.out.println("HYP: " + hyp);

        double angle1 = Math.atan((-height/2)/(-width/2)), angle2 = Math.atan((height/2)/(-width/2)), angle3 = Math.atan((height/2)/(width/2)), angle4 = Math.atan((-height/2)/(width/2));

        System.out.println("angle1: "+angle1+" angle2: "+angle2+" angle3: "+angle3+" angle4: "+angle4);

        GL11.glColor3d(1,1,1);

        System.out.println("x1: " + (int)(x + (hyp)*Math.cos(angle1 + rotation)) + " y1: " + (int)(y + (hyp)*Math.sin(angle1 + rotation)));
        System.out.println("x2: " + (int)(x + (hyp)*Math.cos(angle2 + rotation)) + " y2: " + (int)(y - (hyp)*Math.sin(angle2 + rotation)));
        System.out.println("x3: " + (int)(x - (hyp)*Math.cos(angle3 + rotation)) + " y3: " + (int)(y + (hyp)*Math.sin(angle3 + rotation)));
        System.out.println("x4: " + (int)(x - (hyp)*Math.cos(angle4 + rotation)) + " y4: " + (int)(y - (hyp)*Math.sin(angle4 + rotation)));

        GL11.glBegin(GL11.GL_QUADS);
            GL11.glVertex2i((int)(x + ((hyp)*Math.cos(angle1 + rotation))),(int)(y + ((hyp)*Math.sin(angle1 + rotation))));
            GL11.glVertex2i((int)(x + ((hyp)*Math.cos(angle1 - rotation))),(int)(y - ((hyp)*Math.sin(angle1 - rotation))));
            GL11.glVertex2i((int)(x - ((hyp)*Math.cos(angle1 - rotation))),(int)(y + ((hyp)*Math.sin(angle1 - rotation))));
            GL11.glVertex2i((int)(x - ((hyp)*Math.cos(angle1 + rotation))),(int)(y - ((hyp)*Math.sin(angle1 + rotation))));
        GL11.glEnd();

    }

    public void rectangle(int x, int y, int width, int height, double rotation,double R,double G,double B){

        int a = (height/2), b = (width/2);

        double hyp = Math.sqrt((a*a)+(b*b));

        double angle1 = Math.atan((-height/2)/(-width/2)), angle2 = Math.atan((height/2)/(-width/2)), angle3 = Math.atan((height/2)/(width/2)), angle4 = Math.atan((-height/2)/(width/2));

        GL11.glColor3d(R,G,B);

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2i((int)(x + ((hyp)*Math.cos(angle2 + rotation))),(int)(y + ((hyp)*Math.sin(angle2 + rotation))));
        GL11.glVertex2i((int)(x + ((hyp)*Math.cos(angle4 + rotation))),(int)(y - ((hyp)*Math.sin(angle4 + rotation))));
        GL11.glVertex2i((int)(x - ((hyp)*Math.cos(angle1 + rotation))),(int)(y + ((hyp)*Math.sin(angle1 + rotation))));
        GL11.glVertex2i((int)(x - ((hyp)*Math.cos(angle3 + rotation))),(int)(y - ((hyp)*Math.sin(angle3 + rotation))));
        GL11.glEnd();

    }

    public void rectangle(int x, int y, int width, int height, double rotation,double R,double G,double B, double A){

        int a = (height/2), b = (width/2);

        double hyp = Math.sqrt((a*a)+(b*b));

        double angle1 = Math.atan((-height/2)/(-width/2)), angle2 = Math.atan((height/2)/(-width/2)), angle3 = Math.atan((height/2)/(width/2)), angle4 = Math.atan((-height/2)/(width/2));

        GL11.glColor4d(R,G,B,A);

        GL11.glBegin(GL11.GL_QUADS);
        GL11.glVertex2i((int)(x + ((hyp)*Math.cos(angle2 + rotation))),(int)(y + ((hyp)*Math.sin(angle2 + rotation))));
        GL11.glVertex2i((int)(x + ((hyp)*Math.cos(angle4 + rotation))),(int)(y - ((hyp)*Math.sin(angle4 + rotation))));
        GL11.glVertex2i((int)(x - ((hyp)*Math.cos(angle1 + rotation))),(int)(y + ((hyp)*Math.sin(angle1 + rotation))));
        GL11.glVertex2i((int)(x - ((hyp)*Math.cos(angle3 + rotation))),(int)(y - ((hyp)*Math.sin(angle3 + rotation))));
        GL11.glEnd();

    }
}
