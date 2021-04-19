package com.company.structural_patterns.facade;

import com.company.structural_patterns.facade.some_library.BitrateReader;
import com.company.structural_patterns.facade.some_library.MPEG4CompressionCodec;
import com.company.structural_patterns.facade.some_library.VideoFile;

public class VideoConversionFacade {

    public VideoFile convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName, format);
        VideoFile buffer = BitrateReader.read(file, new MPEG4CompressionCodec());
        System.out.println("VideoConversionFacade: conversion completed.");
        return file;
    }
}
