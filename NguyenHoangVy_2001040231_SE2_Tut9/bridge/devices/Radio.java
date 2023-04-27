package tuts.tut9.todo.bridge.devices;

public class Radio implements Device {
	private boolean on = false;
	private int volume = 30;
	private int channel = 1;

	@Override
	public boolean isEnabled() {
		return on;
	}

	@Override
	public void enable() {
		on = true;
	}

	@Override
	public void disable() {
		on = false;
	}

	//TO-DO: Implement getVolume() method
	@Override
	public int getVolume() {
		return volume;
	}

	//TO-DO: Implement setVolume() method
	@Override
	public void setVolume(int volume) {
		if (volume >= 0 && volume <= 100) {
			this.volume = volume;
		} else {
			System.out.println("Volume is not valid!");
		}

	}

	//TO-DO: Implement getChannel() method
	@Override
	public int getChannel() {
		return channel;
	}

	//TO-DO: Implement setChannel() method
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}

	//TO-DO: Implement printStatus() method
	@Override
	public void printStatus() {
		//Show the current device is radio
		System.out.println("This is radio");
		//Show the current status: enabled or disabled
		if (this.isEnabled()) {
			System.out.println("Radio is enabled");
		} else {
			System.out.println("Radio is disabled");
		}
		//Show the current volume
		System.out.println("The current volume: " + this.getVolume());
		//Show the current channel
		System.out.println("The current channel: " + this.getChannel());
	}
}
