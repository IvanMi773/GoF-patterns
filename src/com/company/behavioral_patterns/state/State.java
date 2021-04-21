package com.company.behavioral_patterns.state;

public abstract class State {

    protected AudioPlayer audioPlayer;

    public State(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public abstract void clickLock ();
    public abstract void clickPlay ();
}
