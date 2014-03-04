package report.pyramid.team;

import java.util.ArrayList;

public class Building {
	private Floor[] floors;
	private int maxFloor;
	private int maxNumber;

	public Building(int maxNumber) {
		this.maxNumber = maxNumber;
		this.maxFloor = calcThisFloor(maxNumber);
		makeFloors();
	}

	public int getMaxNumber() {
		return maxNumber;
	}

	public int getMaxFloor() {
		return maxFloor;
	}

	private void makeFloors() {
		floors = new Floor[maxFloor];
		for (int i = 0; i < floors.length; i++) {
			floors[i] = new Floor(getStartNumber(i), getEndNumber(i), i + 1);
		}
	}
	
	public Floor[] getFloors() {
		return floors;
	}
	
	private int getStartNumber(int i) {
		return sumN(i) + 1;
	}
	
	private int getEndNumber(int i) {
		return sumN(i + 1);
	}
	
	private int sumN(int n) {
		return (n * (n + 1)) / 2;
	}

	public int calcThisFloor(int number) {
		return (int) Math.ceil((Math.sqrt(8 * number + 1) - 1) / 2);

	}

}
