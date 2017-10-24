package Teacher.Y2017JC79.arrays.dynamic_array.collectionframework.TheComparableAndIterableInterface.Comparator.Sample02;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1 == null && o2 == null)
			return 1;
		if (o1 == null)
			return -1;
		if (o2 == null)
			return 1;
		return (int) (o1.getdMark() - o2.getdMark());

	}
}
