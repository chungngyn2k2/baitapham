package pxu.edu.vn.bai08;

import java.util.Scanner;

public class SoChanLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap x: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x % 2 == 0) {
			System.out.println("Day la so chan");
		} else {
			System.out.println("Day la so le");
		}
		System.out.println("KET THUC CHUONG TRINH");
	}

}
