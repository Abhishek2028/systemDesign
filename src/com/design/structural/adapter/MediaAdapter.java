package com.design.structural.adapter;

public class MediaAdapter implements ITarget{

    public MediaAdapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    VLCPlayer vlcPlayer;
    @Override
    public void play(String FileName) {
        StringBuffer sb = new StringBuffer(FileName);
        vlcPlayer.playVLC(sb);
    }
}
