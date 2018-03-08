import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведи ден: ");
		byte day = sc.nextByte();
		System.out.println("Въведи месец: ");
		byte month = sc.nextByte();
		System.out.println("Въведи година: ");
		short year = sc.nextShort();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
			if (day < 31) {
				day++;
			}
			if (day == 31) {
				day = 1;
				month++;
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 30) {
				day++;
			}
			if (day == 30) {
				day = 1;
				month++;
			}
		}
		if (month == 12) {
			if (day == 31) {
				day = 1;
				month = 1;
				year++;
			}
			if (day < 31) {
				day++;
			}

		}
		
		if ((year % 100 == 0 && year % 400 != 0) || year % 4 != 0) {
			if (month == 2 && day == 28) {
				month++;
				day = 1;
			}
			if (month == 2 && day < 28) {
				day++;
			}
		}
		if (year % 4 == 0 || year % 400 == 0) {
			if (month == 2 && day == 29) {
				month++;
				day = 1;
			}
			if (month == 2 && day < 29) {
				day++;
			}
		}
		if ((month==2 && day<=29) || (year >= 0 && day >= 1 && day <= 31 && (month == 1 || (month>=3 && month <= 12)))) {
			System.out.println(day + ", " + month + ", " + year);
		} else {
			System.out.println("Въведена е грешна дата");
		}
	}
}
