import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А: ");
		int a = sc.nextInt();
		System.out.println("Въведете В: ");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(b + " , " + a);
		} else {
			if (a < b) {
				System.out.println(a + " , " + b);
			} else {
				System.out.println("a = b");
			}
		}
	}
}