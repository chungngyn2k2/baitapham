package pxu.edu.vn.bai08;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x: ");
		int x = sc.nextInt();
		System.out.print("Nhap y: ");
		int y = sc.nextInt();
		int min = x;
		if(y > x) {
			min = y;
		}
		System.out.println("So be nhat la: "+min);
		System.out.println("KET THUC CHUONG TRINH");
	}
}