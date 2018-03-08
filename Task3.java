import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А: ");
		int a = sc.nextInt();
		System.out.println("Въведете В: ");
		int b = sc.nextInt();
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("A = " + a + " B= " + b);
	}

}
