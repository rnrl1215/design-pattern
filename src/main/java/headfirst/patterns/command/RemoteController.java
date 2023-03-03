package headfirst.patterns.command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command unDoCommand;

    public RemoteController() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        unDoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        unDoCommand = onCommands[slot];
    }


    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        unDoCommand = offCommands[slot];
    }

    public void unDoButtonWasPushed() {
        unDoCommand.undo();
    }
}
