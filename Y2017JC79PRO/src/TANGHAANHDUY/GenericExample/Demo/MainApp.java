package TANGHAANHDUY.GenericExample.Demo;

import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenericStack<String> listString = new MyGenericStack<>();
		MyGenericStack<SinhVien> listStudent = new MyGenericStack<>();
		
		listString.pushStack("Nguyen Van A");
		listString.pushStack("Nguyen Van B");

		listString.pushStack("Nguyen Van C");

		listString.pushStack("Nguyen Van D");
		
		System.out.println(listString.peekStack());
		
		Iterator<String> iter = listString.iteratorStack();
		
		while(iter.hasNext()) {
			System.out.println(listString.popStack());
		}
		
		for(int i = 0 ; i < listString.getSize();i++)
		{
			System.out.println(listString.getStackIndex(i));
		}
		
	}

}
