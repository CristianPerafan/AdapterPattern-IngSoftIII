package model;

public class ElectricEngineAdapter extends Engine {
	//Attributes
	private ElectricEngine electricEngine;
	

	public ElectricEngineAdapter() {
		super();
		this.electricEngine = new ElectricEngine();
	}

	@Override
	public void start() {
		System.out.println("Starting electric engine adapter...");
		this.electricEngine.connect();
		this.electricEngine.activate();
		
	}

	@Override
	public void speedUp() {
		System.out.println("Speeding up electric engine adapter.");
		this.electricEngine.moveFaster();
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off electric engine adapter.");
		this.electricEngine.stop();
		this.electricEngine.disconnect();	
	}

}
