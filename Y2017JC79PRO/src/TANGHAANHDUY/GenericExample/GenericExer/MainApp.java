package TANGHAANHDUY.GenericExample.GenericExer;

public class MainApp {
	public static void main(String[] args) {
		ClassSort<String> o = new ClassSort<>();
		item<String> a1 = new item<String>("bale");
		item<String> a2 = new item<String>("adebayor");
		item<String> a3 = new item<String>("dossena");
		item<String> a4 = new item<String>("alves");
		item<String> a5 = new item<String>("gerrard");
		item<String> a6 = new item<String>("coutinho");
		item<String> a7 = new item<String>("firmino");

		String[] arr = { a1.getObj(), a2.getObj(), a3.getObj(), a4.getObj(), a5.getObj(), a6.getObj(), a7.getObj() };

		o.SortMethod(arr);

		for (int c = 0; c < arr.length; c++) {
			System.out.print(arr[c] + "  ");
		}
	}

}
