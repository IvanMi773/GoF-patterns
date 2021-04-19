package com.company.structural_patterns.facade.some_library;

public class VideoFile {

    private String name;
    private String codecType;

    public VideoFile(String name, String codecType) {
        this.name = name;
        this.codecType = codecType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodecType() {
        return codecType;
    }

    public void setCodecType(String codecType) {
        this.codecType = codecType;
    }
}
