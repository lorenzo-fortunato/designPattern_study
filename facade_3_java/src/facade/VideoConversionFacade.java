package facade;

import codec.Codec;
import codec.CodecFactory;
import codec.MPEG4CompressionCodec;
import codec.OggCompressionCodec;
import features.AudioMixer;
import features.BitrateReader;
import video.VideoFile;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversationFacade: conversion started.");
        VideoFile file = new VideoFile(fileName, format);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = new AudioMixer().fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
