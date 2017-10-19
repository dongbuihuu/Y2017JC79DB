package TANGHAANHDUY.ArrayEx4;

import java.util.ArrayList;
import java.util.List;

public class arrayentity {
	private List<Integer> numlist = new ArrayList<Integer>();
	private int minormax;
	private byte bOption;
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public byte getbOption() {
		return bOption;
	}

	public void setbOption(byte bOption) {
		this.bOption = bOption;
	}

	public int getMinormax() {
		return minormax;
	}

	public void setMinormax(int minormax) {
		this.minormax = minormax;
	}

	public List<Integer> getNumlist() {
		return numlist;
	}

	public void setNumlist(List<Integer> numlist) {
		this.numlist = numlist;
	}

	
}
