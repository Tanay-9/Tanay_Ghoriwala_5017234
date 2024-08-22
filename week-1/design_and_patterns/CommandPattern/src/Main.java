public class Main {
    public static void main(String[] args) {
        // Create a Light object (Receiver)
        Light livingRoomLight = new Light("Living Room");

        // Create Command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Create RemoteControl (Invoker)
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light ON
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        // Turn the light OFF
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}
