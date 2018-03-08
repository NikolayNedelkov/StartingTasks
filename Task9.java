import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи А:");
		int a = sc.nextInt();
		System.out.println("Въведи Б:");
		int b = sc.nextInt();
		if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
			int mult = a * b;
			if (mult % 2 == 0) {
				System.out.println(mult + ", " + mult % 10 + " четна ");
			} else {
				System.out.println(mult + ", " + mult % 10 + " нечетна ");
			}
		} else {
			System.out.println("Въведените числа са извън интервала");
		}

	}

}
