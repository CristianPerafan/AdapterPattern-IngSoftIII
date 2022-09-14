package ui;

import java.util.Scanner;

import model.EconomicEngine;
import model.ElectricEngineAdapter;
import model.Engine;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static Engine engine;

	public static void main(String[] args) {
		
		int option = 0;
		do {
			option = menuOptions();
			executeOption(option);
			
			
		}while(option != 3);
		
	}
	
	public static int menuOptions() {
		int out = 0;
		System.out.println(" *** OPTION MENU ***\n"
				+ "(1) Start economic engine\n"
				+ "(2) Start electir engine\n"
				+ "(3) Exit"
				+ "Choose a option: ");
		out = sc.nextInt();
		
		return out;
	}
	
	public static void executeOption(int option) {
		switch(option) {
			case 1:
				engine = new EconomicEngine();
				useEngine();
			case 2:
				engine = new ElectricEngineAdapter();
				useEngine();
				break;
			case 3:
				System.out.println("Bye...");
				break;
			default:
				System.out.println("No valid option!");
		}
	}
	
	public static void useEngine() {
		engine.start();
		engine.speedUp();
		engine.turnOff();
	}

}
