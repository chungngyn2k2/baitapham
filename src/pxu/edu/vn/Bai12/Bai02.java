package pxu.edu.vn.Bai12;

import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhap gia tri cho cac phan tu cua mang");
		for(int i = 0; i < a.length; i++) {
			System.out.print("a["+i + "]=");
			a[i] = sc.nextInt();
		}
		System.out.println("Xuat gia tri cua mang");
		for (int i = 0; i < a.length ; i++) {
			System.out.print(a[i]+ "");
		}
	}

}
