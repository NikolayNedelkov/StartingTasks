import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число: ");
		short x = sc.nextShort();
		if (x >= 100 && x <= 999) {
			byte a = (byte) (x / 100);
			byte b = (byte) (x / 10 % 10);
			byte c = (byte) (x % 10);
			if (a == b && b == c && a == c) {
				System.out.println("Цифрите са равни");
			} else {
				if (a > b && b > c) {
					System.out.println("Цифрите са в низходящ ред");
				} else {
					if (a < b && b < c) {
						System.out.println("Цифрите са във възходящ ред");
					} else {
						System.out.println("Цифрите са ненаредени");
					}
				}
			}
		} else {
			System.out.println("Въведеното число не е трицифрено");
		}
	}
}
