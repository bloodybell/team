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

		bUI.setPeoples("ȫ�浿");
		bUI.setPeoples("�̸���");
		bUI.setPeoples("������");
		bUI.setPeoples("�ź���");
		bUI.setPeoples("�䳢");
		
		bUI.printBuilding();
		System.out.println();
		
		bUI.findPeople("�䳢");

	}

}
