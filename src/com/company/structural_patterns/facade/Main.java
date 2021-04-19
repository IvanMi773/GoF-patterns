package com.company.structural_patterns.facade;

import com.company.structural_patterns.facade.some_library.VideoFile;

public class Main {

    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        VideoFile mp4Video = facade.convertVideo("test.ogg", "mp4");
    }
}
