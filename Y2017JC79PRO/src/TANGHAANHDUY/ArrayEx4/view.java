package TANGHAANHDUY.ArrayEx4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class view {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ls= new ArrayList<Integer>();
		do{	ls.add(sc.nextInt());		
		}while(ls.isEmpty());
		
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
	}
}
