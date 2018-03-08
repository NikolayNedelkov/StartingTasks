import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете позицията на първата фигура");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		System.out.println("Въведете позицията на втората фигура");
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		if ((a1 >= 1 && a1 <= 8) && (a2 >= 1 && a2 <= 8) && (b1 >= 1 && b1 <= 8) && (b2 >= 1 && b2 <= 8)) {
			if ((a1 + a2) % 2 == 0) {
				if ((b1 + b2) % 2 == 0) {
					System.out.println("Позициите са с еднакъв цвят ");
				} else {
					System.out.println("Позициите са с различен цвят");
				}
			} else {
				if ((a1 + a2) % 2 != 0) {
					if ((b1 + b2) % 2 != 0) {
						System.out.println("Позициите са с еднакъв цвят ");
					} else {
						System.out.println("Позициите са с различен цвят");
					}
				}
			}
		}else {
			System.out.println("Въведена е грешна позиция");
		}
	}
}
