/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author LK
 */
class StormEnvironment extends Environment {

    ArrayList<RainDrop> drops;
    int dropCount = 100000;

    public StormEnvironment() {

        drops = new ArrayList<>();
        for (int i = 0; i < dropCount; i++) {
            drops.add(new RainDrop(random(800), random(600)));

        }

    }

    public int random(int value) {
        return (int) (Math.random() * value);

    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        for (int i = 0; i < drops.size(); i++) {
            drops.get(i).draw(graphics);

        }
    }

}
