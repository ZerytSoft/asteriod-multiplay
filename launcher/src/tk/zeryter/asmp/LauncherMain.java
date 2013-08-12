//Owen Holloway
//Nick Duharte
//Zeryt-Soft

package tk.zeryter.asmp;

import tk.zeryter.asmp.GUI.Window;

public class LauncherMain {


    //The main method (starts when the class is run) from this other classes are called
    public static void main(String[] args){

        new Thread(new Window()).start(); //This starts the window in a new thread (I do this because its a little cleaner)

    }

}
