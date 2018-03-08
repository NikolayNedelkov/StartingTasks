import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете четирицифрено число: ");
		int x = sc.nextShort();
		if (x >= 1000 && x <= 9999) {
			int a1 = x / 1000;
			int a2 = (x / 100) % 10;
			int a3 = (x / 10) % 10;
			int a4 = x % 10;
			String str1 = Integer.toString(a1) + String.valueOf(a4);
			String str2 = Integer.toString(a2) + String.valueOf(a3);
			// String str1 = a1 + "" + a4; ?? може и така нали ?
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			if (num1 < num2) {
				System.out.println("по-малко " + num1 + " < " + num2);
			} else {
				if (num1 > num2) {
					System.out.println("по-голямо " + num1 + " > " + num2);
				} else {
					System.out.println("равни " + num1 + " = " + num2);
				}
			}
		}else {
			System.out.println("Въведи число в интервала 1000-9999");
		}
	}
}
