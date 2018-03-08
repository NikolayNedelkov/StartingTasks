import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час: ");
		int time = sc.nextInt();
		if(time>=0 && time<=24) {
			if (time>=18 || time<4) {
				System.out.println("Добър вечер");
			}else {
				if(time<=9 && time>=4) {
					System.out.println("Добро утро");
				}
				else {
					System.out.println("Добър ден");
				}
			}
		} else {
			System.out.println("Въведен е грешен час");
		}
	}
}
