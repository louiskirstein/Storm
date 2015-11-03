/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm;

import environment.ApplicationStarter;

/**
 *
 * @author LK
 */
public class Storm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationStarter.run("Storm", new StormEnvironment());
    }
    
}
