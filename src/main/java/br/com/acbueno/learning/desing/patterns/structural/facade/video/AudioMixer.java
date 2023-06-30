package br.com.acbueno.learning.desing.patterns.structural.facade.video;

import java.io.File;

public class AudioMixer {

    public File fix(VideoFile result) {
        System.out.println("Audix Mixer");
        return new File("tmp");
    }

}
