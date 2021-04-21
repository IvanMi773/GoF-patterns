package com.company.behavioral_patterns.state;

public class AudioPlayer {

    private State state;

    public AudioPlayer() {
        this.state = new ReadyState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }
}
