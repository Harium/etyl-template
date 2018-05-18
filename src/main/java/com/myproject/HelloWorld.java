package com.myproject;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;

public class HelloWorld extends Application {

    public HelloWorld(int w, int h) {
        super(w, h);
    }

    public void load() {

    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(this);
    }
}
