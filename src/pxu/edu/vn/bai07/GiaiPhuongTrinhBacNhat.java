package pxu.edu.vn.bai07;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GIAI PT BAC NHAT");
		System.out.println("Nhap he so a va b la cac so thuc");
		System.out.print("a = ");
		Scanner sc= new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		double x;
		if(a != 0) {
			x = -b/a;
			System.out.println("Phuong trinh co nghiem x = "+ x);
		} else {
			if(b != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co vo so nghiem");
			}
		}
		System.out.println("Ket thuc chuong trinh");
	}

}
