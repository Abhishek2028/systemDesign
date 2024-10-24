package com.design.structural.adapter;

public class AudioPlayer implements ITarget{

    MediaAdapter mediaAdapter;

    public AudioPlayer(MediaAdapter mediaAdapter) {
        this.mediaAdapter = mediaAdapter;
    }

    @Override
    public void play(String FileName) {
        System.out.println("To play using VLC Player, using the media adapter");
        mediaAdapter.play(FileName);
    }
}
