import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи трицифрено число: ");
		int num = sc.nextInt();
		if (num >= 100 && num <= 999) {
			int a1 = num / 100;
			int a2 = num / 10 % 10;
			int a3 = num % 10;
			if ((num % a1 == 0) && (num % a2 == 0) && (num % a3 == 0)) {
				System.out.println("Въведеното число се дели на всички свои цифри");
			} else {
				System.out.println("Въведеното число НЕ се дели на всички свои цифри");
			}
		}else {
			System.out.println("Въведеното число не е трицифрено");
		}
	}

}
