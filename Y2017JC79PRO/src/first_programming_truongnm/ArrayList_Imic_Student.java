package first_programming_truongnm;

import java.util.ArrayList;

public class ArrayList_Imic_Student {

	public static void main(String[] args) {
		
		ArrayList<Imic_Student> Imic = new ArrayList<>();
		Imic_Student std1 = new Imic_Student("Nguyen Manh Truong", 9.5);
		Imic_Student std2 = new Imic_Student("Nguyen Hoang Phuong", 9.5);
		Imic_Student std3 = new Imic_Student("Ho Hoang Phuc", 7.6);
		Imic_Student std4 = new Imic_Student("Nguyen Hoai Nam", 5.5);
		Imic_Student std5 = new Imic_Student("Nguyen Truong Phi", 8.5);  
		
		Imic.add(std1);
		Imic.add(std2);
		Imic.add(std3);
		Imic.add(std4);
		Imic.add(std5);
		System.out.println("Below is student list in Imic center: ");
		System.out.println(Imic);
	}
}
