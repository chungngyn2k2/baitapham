package pxu.edu.vn.Bai12;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		double[] a = new double[n];
		for(int i =0; i<a.length;i++) {
			a[i]=Math.random();
		}
		//Khai bao mang so thuc
		for(int i = 0;i<a.length;i++) {
			
		}
		//Xuat gia tri mang
		for(double value: a) {
			System.out.println(value +"");
		}
	}

}
