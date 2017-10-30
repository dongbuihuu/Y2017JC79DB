package TONMINHSON.GenericsLibJson;

import java.util.List;

public class StudentMetaData {
	private int iReturnCode;
	private String sMessageText;
	private int iTotalRecords;
	private List<EntityStudent> studentList;

	public int getiReturnCode() {
		return iReturnCode;
	}

	public void setiReturnCode(int iReturnCode) {
		this.iReturnCode = iReturnCode;
	}

	public String getsMessageText() {
		return sMessageText;
	}

	public void setsMessageText(String sMessageText) {
		this.sMessageText = sMessageText;
	}

	public int getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public List<EntityStudent> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<EntityStudent> studentList) {
		this.studentList = studentList;
	}

}
