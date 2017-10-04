package JAVACORE_TRAINING.OOPS_CONCEPTS.JSON_MODULES.JSONEXCERCISE.CMSAPI;

import java.util.List;

public class CarEntity {
	private String ErrorMessage;	
	private int ReturnCode;
	private int TotalRecord;	
	private List<CarDetails> lisResult;
	
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public int getReturnCode() {
		return ReturnCode;
	}
	public void setReturnCode(int returnCode) {
		ReturnCode = returnCode;
	}
	public int getTotalRecord() {
		return TotalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		TotalRecord = totalRecord;
	}
	public List<CarDetails> getLisResult() {
		return lisResult;
	}
	public void setLisResult(List<CarDetails> lisResult) {
		this.lisResult = lisResult;
	}
}
