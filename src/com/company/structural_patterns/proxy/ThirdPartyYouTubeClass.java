package com.company.structural_patterns.proxy;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public String listVideos() {
        return "Listing videos...";
    }

    @Override
    public String getVideoInfo(Long id) {
        return "asdf";
    }

    @Override
    public void downloadVideo(Long id) {
        System.out.println("Downloading...");
    }
}
