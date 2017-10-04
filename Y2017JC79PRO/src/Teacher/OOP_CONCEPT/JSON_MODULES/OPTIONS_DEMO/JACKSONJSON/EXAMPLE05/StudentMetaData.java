package JAVACORE_TRAINING.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE05;

import java.util.List;

public class StudentMetaData {
	private int iReturnCode;
	private int iTotalRecord;
	private List<StudentEntity> lisStudent;
	private String sMessageText;
		
	public String getsMessageText() {
		return sMessageText;
	}
	public void setsMessageText(String sMessageText) {
		this.sMessageText = sMessageText;
	}
	public int getiReturnCode() {
		return iReturnCode;
	}
	public void setiReturnCode(int iReturnCode) {
		this.iReturnCode = iReturnCode;
	}
	public int getiTotalRecord() {
		return iTotalRecord;
	}
	public void setiTotalRecord(int iTotalRecord) {
		this.iTotalRecord = iTotalRecord;
	}
	public List<StudentEntity> getLisStudent() {
		return lisStudent;
	}
	public void setLisStudent(List<StudentEntity> lisStudent) {
		this.lisStudent = lisStudent;
	}
}
