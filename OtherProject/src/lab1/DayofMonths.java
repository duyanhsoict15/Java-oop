package lab1;
import java.util.Scanner;
public class DayofMonths {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao nam: ");
		int Year = sc.nextInt();
		while( Year < 0) {
			System.out.println("Nhap loi!So nam khong the la so am");
			System.out.println("Nhap vao nam: ");
			Year = sc.nextInt();
		}
		int days = 0;
		int n= 0;
		String Month;
		boolean temp = false;
		while(!temp) {
			if(n != 0) {
				System.out.println("Nhap loi!");
				System.out.println("Nhap lai thang: ");
			}
			else {
				System.out.println("Nhap vao thang: ");
			}
			n++;
			Month = sc.next();
		if (Month.equals("1") || Month.equals("January")|| Month.equals("Jan")||Month.equals("Jan.")) {
			days = 31;
			temp = true;
		}
		if (Month.equals("2") || Month.equals("February")|| Month.equals("Feb")||Month.equals("Feb..")) {
			if (Year % 4 == 0 && (Year % 100 != 0 || Year % 400 == 0)) {
                days = 29;
                temp = true;
            } else {
                days = 28;
                temp = true;
            }
		}
		if (Month.equals("3") || Month.equals("March")|| Month.equals("Mar")||Month.equals("Mar.")) {
			days = 31;
			temp = true;
		}
		if (Month.equals("4") || Month.equals("April")|| Month.equals("Apr")||Month.equals("Apr.")) {
			days = 30;
			temp = true;
		}
		if (Month.equals("5") || Month.equals("May")|| Month.equals("May.")) {
			days = 31;
			temp = true;
		}
		if (Month.equals("6") || Month.equals("June")|| Month.equals("Jun")||Month.equals("Jun.")) {
			days = 30;
			temp = true;
		}
		if (Month.equals("7") || Month.equals("July")|| Month.equals("Jul")||Month.equals("Jul.")) {
			days = 31;
			temp = true;
		}
		if (Month.equals("8") || Month.equals("August")|| Month.equals("Aug")||Month.equals("Aug.")) {
			days = 31;
			temp = true;
		}
		if (Month.equals("9") || Month.equals("September")|| Month.equals("Sep")||Month.equals("Sep.")) {
			days = 30;
			temp = true;
		}
		if (Month.equals("10") || Month.equals("October")|| Month.equals("Oct")||Month.equals("Oct.")) {
			days = 31;
			temp = true;
		}
		if (Month.equals("11") || Month.equals("November")|| Month.equals("Nov")||Month.equals("Nov.")) {
			days = 30;
			temp = true;
		}
		if (Month.equals("12") || Month.equals("December")|| Month.equals("Dec")||Month.equals("Dec.")) {
			days = 31;
			temp = true;
		}
		if(temp) {
			System.out.println("The number of days in " + Month + " " + Year + " is " + days + ".");
		}
		}
	}
}