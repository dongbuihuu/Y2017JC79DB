package Teacher.OOP_CONCEPT.XMLMODULES.DEMO;

import java.util.List;

public class StudentMetaData {
	private List<Student> mLisStudent;
	private String sFileName;

	public List<Student> getmLisStudent() {
		return mLisStudent;
	}

	public void setmLisStudent(List<Student> mLisStudent) {
		this.mLisStudent = mLisStudent;
	}

	public String getsFileName() {
		return sFileName;
	}

	public void setsFileName(String sFileName) {
		this.sFileName = sFileName;
	}
}
