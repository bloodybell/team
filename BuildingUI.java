package report.pyramid.team;

import java.util.Random;

public class BuildingUI {

	private Building build;
	private int maxRoomCount;

	/*
	 * 층수 정하기 호수 정하기 사람 입주 시키기 사람 찾기
	 */

	public BuildingUI(int maxRoomCount) {
		super();
		this.maxRoomCount = maxRoomCount;
		this.build = new Building(maxRoomCount);
	}

	public Building getBuilding() {
		return this.build;
	}

	public void printBuilding() {
		for (Floor floor : build.getFloors()) {
			System.out.println(floor.toString());

			for (House house : floor.getHouses()) {
				System.out.println(house.toString());
			}
		}
	}

	public void setPeople(String name) {
		Random random = new Random();
		int roomNumber = random.nextInt(maxRoomCount) + 1;
		int floorNumber = build.calcThisFloor(roomNumber);

		House house = build.getFloors()[floorNumber - 1].getHouse(roomNumber);
		house.addPeople(new People(name));

	}

	public void findPeople(String name) {
		House houseResult = null;
		Floor floorResult = null;

		for (Floor floor : build.getFloors()) {
			for (House house : floor.getHouses()) {
				if (house.findPeople(name) != null) {
					houseResult = house;
					floorResult = floor;
				}
			}
		}

		System.out.printf("%s는 %d층에 %d번방에 있습니다.\n", name,
				floorResult.getFloorNumber(), houseResult.getNumber());
	}
}
