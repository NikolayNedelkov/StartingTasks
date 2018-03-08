import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Въведете час: ");
		// int hour = sc.nextInt();
		System.out.println("Въведете сума пари: ");
		double money = sc.nextDouble();
		System.out.println("Въведете дали сте здрав: ");
		boolean health = sc.nextBoolean();
		if (health == false) {
			System.out.println("Няма да излзиам");
			if (money > 10) {
				System.out.println("Ще си купя лекарства");
			} else {
				System.out.println("Ще си стоя вкъщи и ще пия чай");
			}
		}
		if (health == true) {
			if (money > 10) {
				System.out.println("Ще отида на кино с приятели");
			} else {
				System.out.println("Ще отида на кафе");
			}
		}
	}
}
