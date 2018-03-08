import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете градуси: ");
		int temp = sc.nextInt();
		if (temp >= -100 && temp <= 100) {
			if (temp < -20) {
				System.out.println("ледено студено");
			}
			if (temp >= -20 && temp < 0) {
				System.out.println("студено");
			}
			if (temp >= 0 && temp < 15) {
				System.out.println("хладно");
			}
			if (temp >= 15 && temp < 25) {
				System.out.println("топло");
			}
			if (temp >= 25) {
				System.out.println("горещо");
			}
		} else {
			System.out.println("Въведената температура не е в интервала");
		}
	}
}
