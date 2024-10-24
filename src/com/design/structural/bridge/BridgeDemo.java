package com.design.structural.bridge;

public class BridgeDemo {
    public static void main(String args[]){
        Radio radio = new Radio(5,false);
        RadioDevice radioDevice = new RadioDevice(radio);
        VoiceRemote voiceRemote = new VoiceRemote(radioDevice);
        System.out.println(voiceRemote.togglePower());
        System.out.println(voiceRemote.toggleVolumeDown());
        System.out.println(voiceRemote.toggleVolumeUp());
        System.out.println(voiceRemote.toggleVolumeUp());

        //Now, let;s say Television device was added and we want to extend the functionality of voice remote to TV

        Television television = new Television(5,false);
        TelevisionDevice televisionDevice = new TelevisionDevice(television);
        voiceRemote = new VoiceRemote(televisionDevice);

        System.out.println(voiceRemote.togglePower());
        System.out.println(voiceRemote.toggleVolumeDown());
        System.out.println(voiceRemote.toggleVolumeUp());
        System.out.println(voiceRemote.toggleVolumeUp());



    }
}
