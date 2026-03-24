package com.cmc.bai2;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Dang phat file VLC: " + fileName);
    }
}
