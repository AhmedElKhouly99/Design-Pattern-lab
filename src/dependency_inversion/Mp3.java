/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency_inversion;

/**
 *
 * @author ahmed
 */
public class Mp3 implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Audio is playing!");
    }
    
}
