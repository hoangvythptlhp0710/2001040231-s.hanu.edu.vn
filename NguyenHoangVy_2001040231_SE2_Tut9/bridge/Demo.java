package tuts.tut9.todo.bridge;


import tuts.tut9.todo.bridge.devices.Device;
import tuts.tut9.todo.bridge.devices.Radio;
import tuts.tut9.todo.bridge.devices.Tv;
import tuts.tut9.todo.bridge.remotes.AdvancedRemote;
import tuts.tut9.todo.bridge.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
//		testDevice(new Radio());
	}

	//TO-DO: Implement the method testDevice()
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		//Create the new BasicRemote instance
		BasicRemote basicRemote = new BasicRemote(device);
		//Power on the device
		basicRemote.power();
		//Display the status of device
		basicRemote.channelDown();
		System.out.println(device.getChannel());
		basicRemote.channelUp();
		System.out.println(device.getChannel());
		basicRemote.volumeDown();
		System.out.println(device.getVolume());
		basicRemote.volumeDown();
		System.out.println(device.getVolume());
		basicRemote.volumeUp();
		System.out.println(device.getVolume());

		System.out.println("Tests with advanced remote.");
		//Create the new AdvancedRemote instance
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		//Power on the device
		advancedRemote.power();
		//Mute the device
		advancedRemote.mute();
		System.out.println(device.getVolume());
		advancedRemote.volumeDown();
		advancedRemote.volumeUp();
		System.out.println(device.getChannel());
		System.out.println(device.getVolume());
		//Display the status of device
	}
}
