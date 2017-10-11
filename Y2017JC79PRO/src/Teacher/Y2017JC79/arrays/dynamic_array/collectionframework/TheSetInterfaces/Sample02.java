package JAVACORE_TRAINING.OOPS_CONCEPTS.ARRAY_AND_COLLECTIONS.DYNAMIC_ARRAYS.COLLECTIONFRAMEWORK.TheSetInterfaces;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Sample02 {
	LinkedList<Integer> lis = new LinkedList<>();
	Queue<Double> d = new LinkedList<Double>();
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Scanner sc = null;
		
		
		for (int i = 0; i < 10; i++) {			
			System.out.println("+ Input: ");
			sc = new Scanner(System.in);
			int iValue = sc.nextInt();
			if(!set.add(iValue)){
				System.out.println("Giá trị bạn nhập đã bị trùng lặp. Vui lòng nhập lại!");
			}
			else{
				set.add(iValue);
			}
		}
				
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println("Value = "+ it.next());
		}		
	}	
}
