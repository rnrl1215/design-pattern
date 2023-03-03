package headfirst.patterns.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleRemoteControlTest {
    @Test
    void test() {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
/*
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.pressButton();

*/
        LightOffCommand lightOffCommand = new LightOffCommand(light);
/*

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.pressButton()*/;

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand,  lightOffCommand);
        remoteController.onButtonWasPushed(0);
        remoteController.unDoButtonWasPushed();

        remoteController.offButtonWasPushed(0);
        remoteController.unDoButtonWasPushed();
    }
}