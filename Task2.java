import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете A: ");
		int a = sc.nextInt();
		System.out.println("Въведете B: ");
		int b = sc.nextInt();
		int suma = a + b;
		int izvajdane = a - b;
		int proizvedeie = a * b;
		int ostatuk = a % b;
		int delenie = a / b;
		System.out.println("Sumata e " + suma);
		System.out.println("Razlikata e " + izvajdane);
		System.out.println("Proizvedenieto e " + proizvedeie);
		System.out.println("Ostatukut ot delenie e " + ostatuk);
		System.out.println("Delenieto e " + delenie);
	}

}
