package com.company.behavioral_patterns.state;

public class ReadyState extends State {

    public ReadyState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    public void clickLock() {
        audioPlayer.changeState(new LockedState(audioPlayer));
    }

    @Override
    public void clickPlay() {
        // Do nothing
    }
}
