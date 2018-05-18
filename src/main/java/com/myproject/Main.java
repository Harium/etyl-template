package com.myproject;

import com.harium.etyl.Etyl;
import com.harium.etyl.commons.context.Application;

public class Main extends Etyl {

    public Main() {
        super(800, 600);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    public Application startApplication() {
        return new HelloWorld(w, h);
    }
}
