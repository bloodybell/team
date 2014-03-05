package report.pyramid.team;

import java.util.ArrayList;

public class House {
	private int number;
	private ArrayList<People> peoples = new ArrayList<People>();

	public House(int number) {
		super();
		this.number = number;
	}

	// ȣ���� ���´�.
	public int getNumber() {
		return number;
	}

	public People findPeople(String name) {
		for (People people : peoples) {
			if (people.getName().equals(name)) {
				return people;
			}
		}

		return null;
	}

	public ArrayList<People> getPeoples() {
		return peoples;
	}

	public void addPeople(People people) {
		peoples.add(people);
	}

	@Override
	public String toString() {
		String temp = "";
		if (peoples.isEmpty()) {
			temp = "����";
		} else {
			for (People people : peoples) {
				temp += people.getName() + ", ";
			}
		}
		return number + "ȣ��, ������ : " + temp + "";
	}

}
