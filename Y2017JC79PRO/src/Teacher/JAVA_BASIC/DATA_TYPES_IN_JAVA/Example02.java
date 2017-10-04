package JAVACORE_TRAINING.TEACHER.JAVA_BASIC.DATA_TYPES_IN_JAVA;

public class Example02 {	
	public static void main(String[] args) {
		//1. Khai báo & khởi tạo giá trị cho biến <biến toàn cục trong lớp Example01>
		int a = 100;
		short b = 100;
		boolean c = true;  //true or false
		float d = (float) 8.5;  //Error
		double e =  8.5;
		float f =  8.5F;
		double g =  8.5;
		float h = (float) 8.5;
		float i = (float) 8.5;
		double k = 9.5;
		
		// 2. Sử dụng biến trong lập trình
		System.out.println(a + b);		
		System.out.println("Giá trị của biến a = "+ a);
		System.out.println(String.format("Giá trị của biến a = %s", a));
		String sValue = ""+a;
	}
}
