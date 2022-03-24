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
public class MediaIependencyInversionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MediaGenerator mp3 = new MediaGenerator(new Mp3());
        mp3.playMedia();
        
        MediaGenerator mp4 = new MediaGenerator(new Mp4());
        mp4.playMedia();
    }
    
}
