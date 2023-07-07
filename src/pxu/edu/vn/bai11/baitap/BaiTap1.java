package pxu.edu.vn.bai11.baitap;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	}
	public static void phuongtrinhbacnhat(double a, double b, double x) {
		System.out.println("a ="+a+": b = "+b);
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT co vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			//a != 0
			x = -b/a;
			System.out.println("Nghiem x = " + x);
		}
	}
	public static void phuongtrinhbachai(double a, double b, double c, double x) {
		if(a==0) {
			phuongtrinhbacnhat(a,b,x);
		} else {
			System.out.println("a = "+a +"; b = "+b +"; c = "+c);
		}
	}
}
