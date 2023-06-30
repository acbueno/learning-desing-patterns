package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class Client {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Spotify spotify = new Spotify();
        Command spotifyPlay = new SpotifyPlayCommand(spotify);
        Command spotifyStop = new SpotifyStopMusicCommand(spotify);
        controller.setComand(spotifyPlay);
        controller.executeCommand();
        controller.setComand(spotifyStop);
        controller.executeCommand();
        Television television = new Television();
        Command teletvisonOn = new TelevisionOnCommand(television);
        controller.setComand(teletvisonOn);
        controller.executeCommand();
        Command televisonVolume = new TelevionVolumeCommand(television);
        controller.setComand(televisonVolume);
        controller.executeCommand();
        Command televisionChannel = new TelevisonChannelCommand(television);
        controller.setComand(televisionChannel);
        controller.executeCommand();
        Command televisionPowerOff = new TelevisionOffCommand(television);
        controller.setComand(televisionPowerOff);
        controller.executeCommand();
        AirConditioningSystems airConditioningSystems = new AirConditioningSystems();
        Command airCondtiongPowerOn = new AirConditionSystemPowerOnCommand(airConditioningSystems);
        controller.setComand(airCondtiongPowerOn);
        controller.executeCommand();
        Command airConditionConfigTemperaute = new AirConditiongSystemConfigTemperatureCommand(airConditioningSystems);
        controller.setComand(airConditionConfigTemperaute);
        controller.executeCommand();
        Command airConditiongPowerOff = new AirConditioningSystemPowerOffCommand(airConditioningSystems);
        controller.setComand(airConditiongPowerOff);
        controller.executeCommand();
    }

}
