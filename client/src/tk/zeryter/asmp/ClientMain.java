package tk.zeryter.asmp;

import tk.zeryter.asmp.window.Render;

public class ClientMain {

    public static void main(String[] args){

        new Thread(new Render()).start();

    }

}