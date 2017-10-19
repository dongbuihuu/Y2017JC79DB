package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterable.Comparator.Sample01;

import java.util.Comparator;

public class CompartorPerson implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		short age1 = o1.getAge();
		short age2 = o2.getAge();
		return (int) age2 - age1;
		// if (age1 > age2)
		// return 1;
		// else if (age1 == age2)
		// return 0;
		// else
		// return -1;

	}

}
