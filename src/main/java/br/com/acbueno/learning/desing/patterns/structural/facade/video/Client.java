package br.com.acbueno.learning.desing.patterns.structural.facade.video;

import java.io.File;

public class Client {

    public static void main(String[] args) {
        VideoConversionFacade conveter = new VideoConversionFacade();
        File mp4Video = conveter.convertVideo("youtubevideo.ogg", "mp4");
    }

}
