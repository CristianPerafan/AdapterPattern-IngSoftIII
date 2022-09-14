package model;

public class EconomicEngine extends Engine {
	
	public EconomicEngine() {
		super();
		System.out.println("Creating a economic engine.");
	}

	@Override
	public void start() {
		System.out.println("Starting economic engine...");
	}

	@Override
	public void speedUp() {
		System.out.println("Speeding up electric engine adapter.");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off electric engine adapter.");
	}
	
}
