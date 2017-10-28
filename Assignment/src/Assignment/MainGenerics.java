package Assignment;

public class MainGenerics {

	public static void main(String[] args) {

		String[] lst = {"A", "E", "B", "D", "C"};
		
		
		RepareGenerics <String> arrLst = new RepareGenerics<>();
		arrLst.setArrlst(lst);
		//Before sort
		arrLst.printArray(lst);
		System.out.println();
		
		//After sort
		
		System.out.println("==================");
		arrLst.sortArray(lst);
		arrLst.printArray(lst);

}
}
