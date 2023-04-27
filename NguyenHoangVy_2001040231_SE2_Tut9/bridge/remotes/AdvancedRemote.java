package tuts.tut9.todo.bridge.remotes;


import tuts.tut9.todo.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    //TO-DO: Implement the mute() method
    public void mute() {
        //Display the current volume status is 'mute'
        System.out.println("Volume status: mute" );
        //Set the volume to 0
        device.setVolume(0);
    }
}
