import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи обем в интервала 10-9999: ");
		int vol = sc.nextInt();
		if (vol >= 10 && vol <= 9999) {
			int buckets = vol / 5;
			int bonusLiters = vol % 5;
			if (bonusLiters != 1) {
				System.out.println(buckets + " пъти по 2 литра ");
				System.out.println(buckets + " пъти по 3 литра ");
				if (bonusLiters == 4) {
					System.out.println("2 допълнителни кофи от 2 литра");
				}
				if (bonusLiters == 3) {
					System.out.println("Допълнителна кофа от 3 литра");
				}
				if (bonusLiters == 2) {
					System.out.println("Допълнителна кофа от 2 литра");
				}
			}
			if (bonusLiters == 1) {
				System.out.println((buckets - 1) + " пъти по 2 литра ");
				System.out.println((buckets - 1) + " пъти по 3 литра ");
				System.out.println("3 допълнителни кофи от 2 литра");
			}
		} else {
			System.out.println("Въведеното число е извън интервала 10-9999");
		}
	}
}
