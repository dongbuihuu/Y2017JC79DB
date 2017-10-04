package JAVACORE_TRAINING.OBJECT_AND_CLASSES.GENERICS.EXCERCISE.ABSTRACT_DEMO;

public class TestApps {
	public static void main(String[] args) {
		//1. Khai báo đối tượng
		Shape objShape;
		double dResult;
		
		//2. Khởi tạo đối tượng áp dụng cho trường hợp là Tam giác	
		Tringle objTringle = new Tringle();
		objTringle.setdA(3);
		objTringle.setdB(4);
		objTringle.setdC(5);		
		objShape = new Tringle();		
		dResult = objShape.Area(objTringle);
		System.out.println("- Diện tích tam giác là: "+ dResult);
		
		//3. Khởi tạo đối tượng áp dụng cho trường hợp là Hình chữ nhật
		Rectange objRec = new Rectange();
		objRec.setdA(3);
		objRec.setdB(4);
		objShape = new Rectange();
		dResult = objShape.Area(objRec);
		System.out.println("- Diện tích HCN là: "+ dResult);
	}
}
