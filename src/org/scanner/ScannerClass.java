package org.scanner;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Id :");
		int studentId = s.nextInt();
		System.out.println("Enter Student Id is :"+studentId);
		System.out.println("Enter Student Name: ");
		String studentName = s.next();
		System.out.println("Enter Student Name is: "+studentName);
		System.out.println("Enter Mark1 : ");
		double Mark1 = s.nextDouble();
		System.out.println("Enter Mark1 is: "+Mark1);
		System.out.println("Enter Mark2 : ");
		double Mark2 = s.nextDouble();
		System.out.println("Enter Mark2 is: "+Mark2);
		System.out.println("Enter Mark3 : ");
		double Mark3 = s.nextDouble();
		System.out.println("Enter Mark3 is: "+Mark3);
		System.out.println("Enter Mark4 : ");
		double Mark4 = s.nextDouble();
		System.out.println("Enter Mark4 is: "+Mark4);
		System.out.println("Enter Mark5 : ");
		double Mark5 = s.nextDouble();
		System.out.println("Enter Mark5 is: "+Mark5);
		double totalMarks = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
		double averageMarks = totalMarks/5;
		System.out.println("Total marks: "+totalMarks);
		System.out.println("Average marks is: "+averageMarks);
		
	}

}
