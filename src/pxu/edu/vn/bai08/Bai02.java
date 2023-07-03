package pxu.edu.vn.bai08;

import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap 2 so x va y");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x: ");
		double x = sc.nextDouble();
		System.out.print("Nhap y: ");
		double y = sc.nextDouble();
		if(x > y) {
			System.out.println("So lon nhat la x = "+ x);
		} else {
			if(y > x) {
				System.out.println("So lon nhat la y = "+y);
			} else {
				System.out.println("x = y = so lon nhat");
			}
		}
		System.out.println("KET THUC CHUONG TRINH");
	}
}
