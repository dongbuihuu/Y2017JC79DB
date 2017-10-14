package TONMINHSON.Practice.Demo;

import TONMINHSON.Practice.LecturersModel;
import TONMINHSON.Practice.StudentsModel;

public class arrAllObject {
	private StudentsModel mStudents;
	private LecturersModel mLecturers;
	private byte bOption;
	private byte bMemberType;

	public StudentsModel getmStudents() {
		return mStudents;
	}

	public void setmStudents(StudentsModel mStudents) {
		this.mStudents = mStudents;
	}

	public LecturersModel getmLecturers() {
		return mLecturers;
	}

	public void setmLecturers(LecturersModel mLecturers) {
		this.mLecturers = mLecturers;
	}

	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}

	public byte getbMemberType() {
		return bMemberType;
	}

	public void setbMemberType(byte bMemberType) {
		this.bMemberType = bMemberType;
	}

}
