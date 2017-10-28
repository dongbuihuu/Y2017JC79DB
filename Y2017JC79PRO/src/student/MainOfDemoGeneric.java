package student;

public class MainOfDemoGeneric {

	public static void main(String[] args) {
	Integer[]lstInt = {1, 66, 5, 6, 88};
	Character[] lstChar = {'H', 'E', 'L', 'L', 'O'};
	printList(lstInt);
	printList(lstChar);
	}
	
	
	public static <E> void printList(E[] e) {
		for(int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println();
	}
}
