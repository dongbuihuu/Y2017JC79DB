package Teacher.Y2017JC79.Json_module.demo_json.jackson_demo.common;

import java.util.List;

public class StudentMetaData {
	private int iReturnCode;
	private String sMessageText;
	private int iTotalRecord;
	private List<EntityStudent> lisStudent;

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

	public int getiTotalRecord() {
		return iTotalRecord;
	}

	public void setiTotalRecord(int iTotalRecord) {
		this.iTotalRecord = iTotalRecord;
	}

	public List<EntityStudent> getLisStudent() {
		return lisStudent;
	}

	public void setLisStudent(List<EntityStudent> lisStudent) {
		this.lisStudent = lisStudent;
	}

}
