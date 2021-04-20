package com.company.structural_patterns.proxy;

public class Main {

    public static void main(String[] args) {
        ThirdPartyYouTubeLib service = new CachedYoutubeClass(new ThirdPartyYouTubeClass());
        service.downloadVideo(1L);
        service.listVideos();
        service.getVideoInfo(1L);
    }
}
