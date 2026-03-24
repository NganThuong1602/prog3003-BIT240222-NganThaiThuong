package com.cmc.bai2;

public class Bai2 {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();

        player.play("mp3", "nhac1.mp3");
        player.play("vlc", "video1.vlc");
        player.play("mp4", "movie.mp4");
    }
}
