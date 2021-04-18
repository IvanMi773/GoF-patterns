package com.company.structural_patterns.bridge;

public class Remote {

    protected Device device;

    public Remote() {
    }

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.setEnabled(false);
        } else {
            device.setEnabled(true);
        }
    }

    public void volumeDown () {
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp () {
        device.setVolume(device.getVolume() + 10);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
