package model;

public class ElectricEngine {
	
	//Attributes
	private boolean connected;

	public ElectricEngine() {
		System.out.println("Creating a electric engine.");
		this.connected = false;
	}
	
	public void connect() {
		System.out.println("Connecting electric engine");
		setConnected(true);
	}
	
	public void activate() {
		if(this.connected == false) {
			System.out.println("It cannot be activated because the electric motor is not connected.");
		}
		else {
			System.out.println("It is connected, activating the electric engine.");
		}
	}
	
	public void moveFaster() {
		if(this.connected == false) {
			System.out.println("It cannot move faster the electric engine, because it's not connected.");
		}
		else {
			System.out.println("Moving faster.");
		}
	}
	
	public void stop() {
		if(this.connected == false) {
			System.out.println("The electric engine cannot stop, because it is not connected.");
		}
		else {
			System.out.println("Stoping electric engine.");
		}
	}
	
	public void disconnect() {
		System.out.println("Disconnecting electric motor.");
		setConnected(false);
	}
	
	// === GETTERS AND SETTERS ====

	public boolean getConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}
	
	
	
	

	

}
