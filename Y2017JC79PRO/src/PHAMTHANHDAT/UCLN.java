package PhamThanhDat;

import java.util.Scanner;

public class UCLN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Nhập số a =");
		a=sc.nextInt();
		System.out.println("Nhập số b =");
		b=sc.nextInt();
		System.out.println(UCLN(a,b));
	}
	public static int UCLN(int a,int b) {
		while(a != b) {
			if(a>b) {
				a-=b;
			}
			else{
				if(a<b)
					b-=a;
			}
		}
		return a;
	}
}
