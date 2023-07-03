package pxu.edu.vn.bai10;

import java.util.Scanner;

public class BaiTap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Nhap diem toan: ");
		double toan = sc.nextDouble();
		toan = Math.abs(toan);
		System.out.print("Nhap diem van: ");
		double van = Math.abs(sc.nextDouble());
		System.out.print("Nhap diem anh: ");
		double anh = Math.abs(sc.nextDouble());
		double dtb=(double)(Math.ceil(((toan+anh+van)/3)*100)/100);
		System.out.println("DTB la: "+dtb);
		if(dtb >=9) {
			System.out.println("Xep loai xuat sac");
		} else if(dtb >=8) {
			System.out.println("Xep loai gioi");
		} else if(dtb >=6.5) {
			System.out.println("Xep loai kha");
		} else if(dtb >=5) {
			System.out.println("Xep loai TB");
		} else if(dtb < 5) {
			System.out.println("Xep loai yeu");
		}
		System.out.println("CHUONG TRINH KET THUC");
	} catch (Exception e) {
		System.out.println("Ban nhap sai cu phap");
		}
	}
}
