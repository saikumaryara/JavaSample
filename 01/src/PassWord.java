//PassWord.java

import java.util.Arrays;
import java.util.Scanner;

public class PassWord {

	public static void main(String[] args) {

		String pwd = null;
		int sumArr[] = new int[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Firstname");
		String fname = sc.next();

		System.out.println("Enter Your Lastname");
		String lname = sc.next();

		System.out.println("choose option 1 for sum of ASCII vaues for each character");
		System.out.println("choose option 2 for convert each character to a number and prints it's value from 1");
		System.out.println("choose option 3 for history of last  pwd attempt");
		System.out.println(
				"choose option 4 for special pwd baSsed on ur fname plus last two characters from your last name if user type this pwd print special pwd accepted");
		System.out.println("choose option 5 Quit the program");

		int num = sc.nextInt();
		String pwd1 = fname + lname.substring(lname.length() - 2);
		switch (num) {
		case 1:
			System.out.println("Enter Pwd");
			pwd = sc.next();
			int sum = 0;
			int length = pwd.length();
			byte[] bytes = pwd.getBytes();
			for (int i = 0; i < length; i++) {
				sum = sum + bytes[i];
			}
			System.out.println("the sum of ASCII vaues for each character is::" + sum);
			break;
		case 2:
			System.out.println("Enter Pwd");
			pwd = sc.next();
			bytes = pwd.getBytes();
			System.out.println("each chars value ::" + Arrays.toString(bytes));
			if (pwd.equals(pwd1))
				System.out.println("Special pwd entered on console");
			break;
		case 3:

			for (int i = 0; i < sumArr.length; i++) {
				System.out.println("Enter Pwd::" +(i+1));
				pwd = sc.next();
				sum = 0;
				length = pwd.length();
				bytes = pwd.getBytes();
				for (int j = 0; j < length; j++) {
					sum = sum + bytes[j];
				}
				sumArr[i] = sum;
			}
			System.out.println("Last " + sumArr.length + " pwd attempts ");

			for (int i = 0; i < sumArr.length; i++) {
				System.out.println("pwd" + i + " sum value=" + sumArr[i]);
			}
			break;
		case 4:
			System.out.println("Generated password:: " + pwd1);
			break;
		case 5:
			   System.exit(0);
			   
		}
		
	}
}