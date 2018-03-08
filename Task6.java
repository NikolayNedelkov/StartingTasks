import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А1: ");
		int a1 = sc.nextInt();
		System.out.println("Въведете A2: ");
		int a2 = sc.nextInt();
		System.out.println("Въведете A3: ");
		int a3 = sc.nextInt();
		int x = 0;
		x = a1;
		a1 = a2;
		a2 = a3;
		a3 = x;
		System.out.println("A1 = " + a1 + " A2 = " + a2 + " A3 = " + a3);
	}

}
