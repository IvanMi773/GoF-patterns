package com.company.structural_patterns.bridge;

public interface Device {

    boolean isEnabled();
    void setEnabled(boolean isEnabled);
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}
