import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете A: ");
		double a = sc.nextDouble();
		System.out.println("Въведете B: ");
		double b = sc.nextDouble();
		System.out.println("Въведете C: ");
		double c = sc.nextDouble();

		/*if ((a < c) && (b > c)) {
			System.out.println("Числото " + c + " e между " + a + " и " + b);
		} else {
			if ((a > c) && (b < c)) {
				System.out.println("Числото " + c + " e между " + b + " и " + a);
			} else {
				System.out.println("Числото " + c + " не е e между въведените числа");
			}
		}*/
		
		if (a < b) {
			if ((c > a) & (c < b)) {
				System.out.println("Числото " + c + " e между " + a + " и " + b);
			} else {
				System.out.println("Числото " + c + " не е e между " + a + " и " + b);
			}
		}
		if (a > b) {
			if ((c < a) & (c > b)) {
				System.out.println("Числото " + c + " e между " + b + " и " + a);
			} else {
				System.out.println("Числото " + c + " не е e между " + b + " и " + a);
			}
		}

	}

}
