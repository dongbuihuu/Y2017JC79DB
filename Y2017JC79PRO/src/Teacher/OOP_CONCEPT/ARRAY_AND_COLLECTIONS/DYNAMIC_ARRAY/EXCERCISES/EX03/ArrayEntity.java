package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAY.EXCERCISES.EX03;

import java.util.List;

public class ArrayEntity {
	private List<List<Student>> liLisStudent;
	private List<Student> lisStudent;

	public List<List<Student>> getLiLisStudent() {
		return liLisStudent;
	}

	public void setLiLisStudent(List<List<Student>> liLisStudent) {
		this.liLisStudent = liLisStudent;
	}

	public List<Student> getLisStudent() {
		return lisStudent;
	}

	public void setLisStudent(List<Student> lisStudent) {
		this.lisStudent = lisStudent;
	}
}
