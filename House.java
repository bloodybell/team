package report.pyramid.team;

import java.util.ArrayList;

public class House {
	private int number;
	private ArrayList<People> peoples = new ArrayList<People>();

	public House(int number) {
		super();
		this.number = number;
	}

	// 호수를 얻어온다.
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
			temp = "없음";
		} else {
			for (People people : peoples) {
				temp += people.getName() + ", ";
			}
		}
		return number + "호실, 입주자 : " + temp + "";
	}

}
