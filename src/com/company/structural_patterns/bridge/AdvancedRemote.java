package com.company.structural_patterns.bridge;

public class AdvancedRemote extends Remote {

    public void mute () {
        device.setVolume(0);
    }
}
