package com.company;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.IOException;

public class MP3Player{
    public void playback(String path){
        try (FileInputStream inputStream = new FileInputStream(path)){
            try {
                Player player = new Player(inputStream);
                player.play();
            } catch (JavaLayerException ex){
                ex.printStackTrace();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
