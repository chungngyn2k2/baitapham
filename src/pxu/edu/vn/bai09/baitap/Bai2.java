package pxu.edu.vn.bai09.baitap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap x: ");
			x = sc.nextInt();
			System.out.println("x = "+x);
		}while (x > 0);
		System.out.println(""+x+" la so nguyen am");
		System.out.println("CHUONG TRINH KET THUC");
	}

}
