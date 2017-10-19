package TANGHAANHDUY.BTMang1;


public class StudentView {

	public static void main(String[] args) {
		StudentEntity sv01 = new StudentEntity("Nguyen Van A",9.5);
		StudentEntity sv02 = new StudentEntity("Nguyen Van b",3.5);
		StudentEntity sv03 = new StudentEntity("Nguyen Van c",4.5);
		StudentEntity sv04 = new StudentEntity("Nguyen Van d",4.5);

		ArrayObjectEntity arr = new ArrayObjectEntity();
		
		StudentEntity[] objlist = new StudentEntity[4];
	    objlist[0] = sv01;
	    objlist[1] = sv02;
	    objlist[2] = sv03;
	    objlist[3] = sv04;
	    
	    arr.setMangSV(objlist);
	    arr.setBoption((byte)0);
	    
	    StudentControl svCon = new StudentControl();
	    int[] ketqua = svCon.StudentName(arr);
	    
	    for (int i : ketqua)
	    {
	    	System.out.println(i);
	    }
	}
	
}
