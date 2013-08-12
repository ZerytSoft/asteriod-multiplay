package tk.zeryter.asmp.GUI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java.awt.Window;

public class WindowMonitor extends WindowAdapter implements WindowListener {

    //This checks to see if the window has been asked to close.
    //If the window is being asked to close it ends the program.

    public void windowClosing(WindowEvent e) {
        Window w = e.getWindow();
        w.setVisible(false);
        w.dispose();
        System.exit(0);
    }
}