package TONMINHSON.Practice;

public abstract class UniMembers {
	private byte bMemberType;

	public byte getbMemberType() {
		return bMemberType;
	}

	public void setbMemberType(byte bMemberType) {
		this.bMemberType = bMemberType;
	}

	public abstract double findBestOrWorstMark(Object obj);

	// public abstract String findBestOrLowestRate(Object obj);

	public abstract String[] findBestWorstStudentsLecturers(Object obj);

	public abstract String[] findDepartmentsWithBestOrWorstStudentsLecturers(Object obj);

	public abstract int findNumbersOfBestWorstStudentsLecturersInDepartments(Object obj);

	public abstract int findNumberOfBestWorstStudentsLecturers(Object obj);
}
