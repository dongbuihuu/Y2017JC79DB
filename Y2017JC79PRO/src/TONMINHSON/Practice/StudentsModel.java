package TONMINHSON.Practice;

public class StudentsModel {

	public double findBestMark(Students stds) {
		Student[] students = stds.getStudents();
		double dBestMark = students[0].getdMark();
		for (int i = 1; i < students.length; i++) {
			if (dBestMark < students[i].getdMark()) {
				dBestMark = students[i].getdMark();
			}
		}
		return dBestMark;
	}

	public double findWorstMark(Students stds) {
		Student[] students = stds.getStudents();
		double dWorstMark = students[0].getdMark();
		for (int i = 1; i < students.length; i++) {
			if (dWorstMark > students[i].getdMark()) {
				dWorstMark = students[i].getdMark();
			}
		}
		return dWorstMark;
	}

	public String[] findBestStudents(Students stds) {
		Student[] students = stds.getStudents();
		String[] bestStudents = null;
		int i = 0;
		for (Student student : students) {
			if (student.getdMark() == this.findBestMark(stds)) {
				bestStudents[i] = "Full name: " + student.getsFullName() + ", ID: " + student.getsID() + ", Age: "
						+ student.getbAge() + ", Mark: " + student.getdMark() + ", Department: "
						+ student.getsDepartment();
				i++;
			}
		}
		return bestStudents;
	}

	public String[] findWorstStudents(Students stds) {
		Student[] students = stds.getStudents();
		String[] worstStudents = null;
		int i = 0;
		for (Student student : students) {
			if (student.getdMark() == this.findWorstMark(stds)) {
				worstStudents[i] = "Full name: " + student.getsFullName() + ", ID: " + student.getsID() + ", Age: "
						+ student.getbAge() + ", Mark: " + student.getdMark() + ", Department: "
						+ student.getsDepartment();
				i++;
			}
		}

		return worstStudents;
	}

	public int findBestStudentsNumbers(Students stds) {
		Student[] students = stds.getStudents();
		int count = 0;
		for (Student student : students) {
			if (student.getdMark() == this.findBestMark(stds)) {
				count++;
			}
		}
		return count;
	}

	public int findWorstStudentsNumbers(Students stds) {
		Student[] students = stds.getStudents();
		int count = 0;
		for (Student student : students) {
			if (student.getdMark() == this.findWorstMark(stds)) {
				count++;
			}
		}
		return count;

	}

	public String[] findDepartmentsWithBestStudents(Students stds) {
		Student[] students = stds.getStudents();
		String[] departments = null;
		int i = 0;
		for (Student student : students) {
			if (student.getdMark() == this.findBestMark(stds)) {
				departments[i] = student.getsDepartment();
			}
		}
		return departments;

	}

	public String[] findDepartmentsWithWorstStudents(Students stds) {
		Student[] students = stds.getStudents();
		String[] departments = null;
		int i = 0;
		for (Student student : students) {
			if (student.getdMark() == this.findWorstMark(stds)) {
				departments[i] = student.getsDepartment();
			}
		}
		return departments;

	}

	public int findBestStudentsNumbersInDepartments(Students stds) {
		Student[] students = stds.getStudents();
		int count = 0;
		for (Student student : students) {
			if (student.getsDepartment().equals(this.findDepartmentsWithBestStudents(stds))) {
				count++;
			}

		}
		return count;

	}

	public int findWorstStudentsNumbersInDepartments(Students stds) {
		Student[] students = stds.getStudents();
		int count = 0;
		for (Student student : students) {
			if (student.getsDepartment().equals(this.findDepartmentsWithWorstStudents(stds))) {
				count++;
			}

		}
		return count;

	}

}
