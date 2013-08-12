//Owen Holloway
//Nick Duharte
//Zeryt-Soft

package tk.zeryter.asmp;

import tk.zeryter.asmp.GUI.Window;

public class LauncherMain {


    //The main method
    public static void main(String[] args){

        new Thread(new Window()).start();

    }

}
