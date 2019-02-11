package command.undo;

public class RemoteLoader {
    public static void main(String [] args){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
        remoteControl.offButtonPushed(0);
        remoteControl.onButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonPushed();
    }
}
