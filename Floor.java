package report.pyramid.team;

import java.util.ArrayList;

public class Floor {
	private int start;
	private int end;
	private int floorNumber;
	private House[] houses;

	
	public Floor(int start, int end, int floorNumber) {
		this.start = start;
		this.end = end;
		this.floorNumber = floorNumber;
		this.houses = new House[end - start + 1];
		makeHouses();
	}
	
	
	private void makeHouses() {
		for(int i = start; i <= end; i++) {
			houses[i - start] = new House(i);
		}
	}
	
	public House[] getHouses() {
		return houses;
	}
	
	public House getHouse(int roomNumber) {
		House result = null;
		try {
			result = houses[roomNumber - start];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}

		return result;
	}

	@Override
	public String toString() {
//		return "Floor [start=" + start + ", end=" + end + ", floorNumber="
//				+ floorNumber + ", houses=" + houses + "]";
		return floorNumber + "층, " + start + "번지 부터, "  + end + " 까지 있습니다.";
	}


	public int getFloorNumber() {
		// TODO Auto-generated method stub
		return this.floorNumber;
	}
	
	
}
