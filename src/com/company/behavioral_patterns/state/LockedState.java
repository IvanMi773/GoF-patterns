package com.company.behavioral_patterns.state;

public class LockedState extends State {

    public LockedState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    public void clickLock() {
        audioPlayer.changeState(new ReadyState(audioPlayer));
    }

    @Override
    public void clickPlay() {
        // Do nothing
    }
}
