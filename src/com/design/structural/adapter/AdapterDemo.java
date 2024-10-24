package com.design.structural.adapter;

public class AdapterDemo {

    public static void main(String args[]){
        VLCPlayer adaptee = new VLCPlayer();

        MediaAdapter adapter = new MediaAdapter(adaptee);

        AudioPlayer client = new AudioPlayer(adapter);

        client.play("THE BEATLES");
    }

}

//VLCPlayer is the client library to which we can't make any changes.
//AudioPlayer is the existing audio player. We want to play songs in VLC player also.
//So, using adapter pattern. We declare an interface which will be implemented by our class and the adapter.
//