import java.util.Scanner;

public class Task2second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете A: ");
		float a = sc.nextFloat();
		System.out.println("Въведете B: ");
		float b = sc.nextFloat();
		float suma = a + b;
		float izvajdane = a - b;
		float proizvedeie = a * b;
		float ostatuk = a % b;
		float delenie = a / b;
		System.out.println("Sumata e " + suma);
		System.out.println("Razlikata e " + izvajdane);
		System.out.println("Proizvedenieto e " + proizvedeie);
		System.out.println("Ostatukut ot delenie e " + ostatuk);
		System.out.println("Delenieto e " + delenie);

	}

}
