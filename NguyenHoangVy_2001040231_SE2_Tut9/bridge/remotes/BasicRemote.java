package tuts.tut9.todo.bridge.remotes;


import tuts.tut9.todo.bridge.devices.Device;

public class BasicRemote implements Remote {
	protected Device device;

	public BasicRemote() {
	}

	public BasicRemote(Device device) {
		this.device = device;
	}

	@Override
	public void power() {
		System.out.println("Remote: power toggle");
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	//TO-DO: Implement the volumeDown() method
	@Override
	public void volumeDown() {
		//Display the current status is 'volume down'
		System.out.println("Decreasing volume");
        //Decrease the current volume for 10
		device.setVolume(device.getVolume() - 10);
	}

	//TO-DO: Implement the volumeUp() method
	@Override
	public void volumeUp() {
		//Display the current status is 'volume up'
		System.out.println("Increasing volume");
        //Increase the current volume for 10
		device.setVolume(device.getVolume() + 10);
	}

	//TO-DO: Implement the channelDown() method
	@Override
	public void channelDown() {
		//Display the current status is 'channel down'
		System.out.println("Switch back to channel");
        //Decrease the current channel for 1
		device.setChannel(device.getChannel() - 1);
	}

	//TO-DO: Implement the channelUp() method
	@Override
	public void channelUp() {
		//Display the current status is 'channel up'
		System.out.println("Switch up to channel");
        //Increase the current channel for 1
		device.setChannel(device.getChannel() + 1);
	}
}
