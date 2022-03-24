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
public class MediaGenerator {
    private MediaPlayer player;
//    public void generateMedia(boolean media){
//        if(media){
//            player = new Mp3();
//        }
//        else{
//            player = new Mp4();
//        }
//    }

    public MediaGenerator(MediaPlayer player) {
        this.player = player;
    }
    
    
    public void playMedia(){
        player.play();
    }
}
