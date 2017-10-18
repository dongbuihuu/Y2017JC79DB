package PHAMTHANHDAT.demo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenericStack<String> listString = new MyGenericStack<String>();
		MyGenericStack<SinhVien> listStudent = new MyGenericStack<SinhVien>();
		listString.pushStack("Nguyễn Văn A");
		listString.pushStack("Nguyễn Văn B");
		listString.pushStack("Nguyễn Văn C");
		listString.pushStack("Nguyễn Văn D");
		listString.pushStack("Nguyễn Văn F");
		// Iterator<String> iter = listString.iteratorStack();
		// while (iter.hasNext()) {
		System.out.println(listString.peekStack());
		// }

	}

}
