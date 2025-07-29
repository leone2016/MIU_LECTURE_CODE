package FPP.lectureCode.lesson5.comparators;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p2.getName().compareTo(p1.getName());
	}

}


