package com.company.structural_patterns.proxy;

public class CachedYoutubeClass implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib service;
    private String listCache;
    private String videoCache;
    private boolean needReset = false;

    public CachedYoutubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public String listVideos() {
        if (listCache == null || needReset) {
            listCache = service.listVideos();
        }

        return listCache;
    }

    @Override
    public String getVideoInfo(Long id) {
        if (videoCache == null || needReset) {
            videoCache = service.getVideoInfo(id);
        }

        return videoCache;
    }

    @Override
    public void downloadVideo(Long id) {
        if (needReset) {
            service.downloadVideo(id);
        }
    }
}
