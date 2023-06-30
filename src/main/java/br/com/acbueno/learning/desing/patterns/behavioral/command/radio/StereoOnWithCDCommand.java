package br.com.acbueno.learning.desing.patterns.behavioral.command.radio;

import java.util.Set;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
       stereo.on();
       stereo.setCD();
       stereo.setDVD();
       stereo.setVolume(10);
    }

}
