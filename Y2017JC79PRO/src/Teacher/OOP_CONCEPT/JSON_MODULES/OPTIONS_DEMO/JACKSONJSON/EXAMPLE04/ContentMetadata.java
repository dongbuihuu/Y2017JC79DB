package JAVACORE_TRAINING.TEACHER.OOP_CONCEPT.JSON_MODULES.OPTIONS_DEMO.JACKSONJSON.EXAMPLE04;

import java.util.List;

public class ContentMetadata {
	private String ErrorMessage;
	private String ReturnCode;
	private int TotalRecord;
	private List<DisCountEntity> Results;
	
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getReturnCode() {
		return ReturnCode;
	}
	public void setReturnCode(String returnCode) {
		ReturnCode = returnCode;
	}
	public int getTotalRecord() {
		return TotalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		TotalRecord = totalRecord;
	}
	public List<DisCountEntity> getResults() {
		return Results;
	}
	public void setResults(List<DisCountEntity> results) {
		Results = results;
	}	
}
