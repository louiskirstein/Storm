package storm;

import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LK
 */
public class RainDrop {

    {

        radius = 5;
        minRadius = 5;
        macRadius = 125;

        x = 10;
        y = 10;

        red = 0;
        green = 30;
        blue = 200;

        opacity = 200;
        minOpacity = 20;
        maxOpacity = 255;

    }

    public RainDrop(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void draw(Graphics graphics) {

        graphics.setColor(new Color(red, green, blue, opacity));
        graphics.fillOval(x, y, 2 * radius, 2 * radius);

    }

    int radius;
    int minRadius;
    int macRadius;

    int x;
    int y;

    int red;
    int green;
    int blue;

    int opacity;
    int minOpacity;
    int maxOpacity;

}
