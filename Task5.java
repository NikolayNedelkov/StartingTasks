import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А: ");
		int a = sc.nextInt();
		System.out.println("Въведете В: ");
		int b = sc.nextInt();
		System.out.println("Въведете C: ");
		int c = sc.nextInt();
		if ((a >= b) && (a > c)) {
			if (b > c) {
				System.out.println(a + " , " + b + " , " + c);
			} else {
				if (b <= c) {
					System.out.println(a + " , " + c + " , " + b);
				}
			}
		}
		if ((b > a) && (b >= c)) {
			if (a > c) {
				System.out.println(b + " , " + a + " , " + c);
			} else {
				if (a <= c) {
					System.out.println(b + " , " + c + " , " + a);
				}
			}
		}
		if ((c >= a) && (c > b)) {
			if (a > b) {
				System.out.println(c + " , " + a + " , " + b);
			} else {
				if (a <= b) {
					System.out.println(c + " , " + b + " , " + a);
				}
			}
		}
		if ((a == b) && (b == c)) {
			System.out.println(a + " , " + b + " , " + c);
		}
	}
}
