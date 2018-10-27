package com.company.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "beyond the horizon.mp4");
        audioPlayer.play("vlc", "beyond the horizon.vlc");
        audioPlayer.play("avi", "beyond the horizon.avi");

    }
}
