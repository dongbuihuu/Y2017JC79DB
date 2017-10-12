package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.HashSetvsTreeSetvsLinkedHashSet;

public class Student implements Comparable<Student> {
	private int RollNo;
	private String FullName;
	private double Mark;
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public double getMark() {
		return Mark;
	}
	public void setMark(double mark) {
		Mark = mark;
	}
	
	@Override
	public String toString() {
		return RollNo +" - "+ FullName +" - "+ Mark;
	}
		
	
	@Override
	public int compareTo(Student obj) {
		if(Mark == obj.getMark())
			return 0;		
		else if(Mark < obj.getMark())
			return -1; //Desc
		else	
			return 1;  //Asc 
	}
}
