package TONMINHSON.Practice;

public class UniMembersController extends UniMembers {
	private UniMembers uniMembers;
	private StudentsModel mStudents;
	private LecturersModel mLecturers;
	private byte bOption;

	public UniMembersController() {
		switch (uniMembers.getbMemberType()) {
		case (byte) 0:
			mStudents = new StudentsModel();
			break;
		case (byte) 1:
			mLecturers = new LecturersModel();
			break;
		}
	}

	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}

	public double findBestOrWorstMark(Object obj) {
		Students students = (Students) obj;
		if (this.getbOption() == (byte) 0) {
			return mStudents.findWorstMark(students);
		} else {
			return mStudents.findBestMark(students);
		}

	};

	// public String findBestOrLowestRate(Object obj) {
	// Lecturers lecturers = (Lecturers) obj;
	// if (this.getbOption() == 0) {
	// return mLecturers.findLowestRate(lecturers);
	// } else {
	// return mLecturers.findBestRate(lecturers);
	// }
	// };

	public String[] findBestWorstStudentsLecturers(Object obj) {
		if (uniMembers.getbMemberType() == (byte) 0) {
			Students students = (Students) obj;
			if (this.getbOption() == (byte) 0) {
				return mStudents.findWorstStudents(students);
			} else {
				return mStudents.findBestStudents(students);
			}
		} else {
			Lecturers lecturers = (Lecturers) obj;
			if (this.getbOption() == (byte) 0) {
				return mLecturers.findWorstLecturers(lecturers);
			} else {
				return mLecturers.findBestLecturers(lecturers);
			}
		}
	};

	public String[] findDepartmentsWithBestOrWorstStudentsLecturers(Object obj) {
		if (uniMembers.getbMemberType() == (byte) 0) {
			Students students = (Students) obj;
			if (this.getbOption() == (byte) 0) {
				return mStudents.findDepartmentsWithWorstStudents(students);
			} else {
				return mStudents.findDepartmentsWithBestStudents(students);
			}
		} else {
			Lecturers lecturers = (Lecturers) obj;
			if (this.getbOption() == (byte) 0) {
				return mLecturers.findWorstLecturers(lecturers);
			} else {
				return mLecturers.findBestLecturers(lecturers);
			}
		}
	};

	public int findNumbersOfBestWorstStudentsLecturersInDepartments(Object obj) {
		if (uniMembers.getbMemberType() == (byte) 0) {
			Students students = (Students) obj;
			if (this.getbOption() == (byte) 0) {
				return mStudents.findWorstStudentsNumbersInDepartments(students);
			} else {
				return mStudents.findBestStudentsNumbersInDepartments(students);
			}
		} else {
			Lecturers lecturers = (Lecturers) obj;
			if (this.getbOption() == (byte) 0) {
				return mLecturers.findWorstLecturersNumbersInDepartments(lecturers);
			} else {
				return mLecturers.findBestLecturersNumbersInDepartments(lecturers);
			}
		}
	};

	public int findNumberOfBestWorstStudentsLecturers(Object obj) {
		if (uniMembers.getbMemberType() == (byte) 0) {
			Students students = (Students) obj;
			if (this.getbOption() == (byte) 0) {
				return mStudents.findWorstStudentsNumbers(students);
			} else {
				return mStudents.findBestStudentsNumbers(students);
			}
		} else {
			Lecturers lecturers = (Lecturers) obj;
			if (this.getbOption() == (byte) 0) {
				return mLecturers.findWorstLecturersNumbers(lecturers);
			} else {
				return mLecturers.findBestLecturersNumbers(lecturers);
			}
		}
	};
}
