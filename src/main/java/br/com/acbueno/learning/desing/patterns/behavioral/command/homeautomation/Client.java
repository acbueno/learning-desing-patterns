package br.com.acbueno.learning.desing.patterns.behavioral.command.homeautomation;

import java.util.ResourceBundle.Control;

public class Client {

    public static void main(String[] args) {
        Controller controller = new Controller();
        HeatingSystem heatingSystem = new HeatingSystem();
        Command heatOn = new HeatingOnCommand(heatingSystem);
        Command heaOff = new HeatingOffCommand(heatingSystem);
        controller.setCommand(heatOn);
        controller.executeCommand();
        controller.setCommand(heaOff);
        controller.executeCommand();
    }

}
