package report.pyramid.team;

public class Main {

	public static void main(String[] args) {
		// House house = new House(5);
		//
		// house.addPeople(new People("ȫ�浿"));
		//
		// System.out.println(house.toString());

		// Building bill = new Building(100);
		//
		//
		// for (Floor floor : bill.getFloors()) {
		// System.out.println(floor.toString());
		//
		// for (House house : floor.getHouses()) {
		// System.out.println(house.toString());
		// }
		// }
		//
		BuildingUI bUI = new BuildingUI(10);
		String[] peoples = {"ȫ�浿", "�̸���", "������", "�ź���", "�䳢"};

		for (String name : peoples) {
			bUI.setPeople(name);
		}

		bUI.printBuilding();
		System.out.println();
		
		bUI.findPeople("�䳢");

	}

}
