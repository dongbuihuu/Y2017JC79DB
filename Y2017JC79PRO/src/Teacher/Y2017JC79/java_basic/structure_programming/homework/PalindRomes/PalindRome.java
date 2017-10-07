package Teacher.Y2017JC79.java_basic.structure_programming.homework.PalindRomes;

import java.util.Scanner;

/*
 * Yêu cầu: Hãy giải thêm bài này bằng đệ quy
 * 
 * */

public class PalindRome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi cần kiểm tra: ");
		String sInput = sc.nextLine();
		sc.close();
		if (checkPalindrome(sInput)) {
			System.out.println(sInput + " là đối xứng");
		} else {
			System.out.println(sInput + " là không đối xứng");
		}

	}

	public static boolean checkPalindrome(String s) {
		boolean isPalindrome = true;
		int low = 0;
		int hight = s.length() - 1;

		while (low < hight) {
			if (s.charAt(low) != s.charAt(hight)) {
				isPalindrome = false;
				// return false;
				break;
			}
			low++;
			hight--;

		}

		return isPalindrome;
	}
}
