package com.company.structural_patterns.proxy;

public interface ThirdPartyYouTubeLib {

    String listVideos ();
    String getVideoInfo (Long id);
    void downloadVideo (Long id);
}
