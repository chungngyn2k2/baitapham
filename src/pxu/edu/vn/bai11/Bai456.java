package pxu.edu.vn.bai11;

import java.util.Scanner;

public class Bai456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		System.out.print("Gia tri nguyen x = ");
		int x1 = sc.nextInt();
		System.out.print("Gia tri thuc x = ");
		double x2 = sc.nextDouble();
		double ketqua = tinhbieuthucf3(a, b, c, x1, x2);
		System.out.println("ket qua = " + ketqua);
	}
	public static double tinhbieuthucf1(double a, double b, double c, int x ) {
		double f= a*x*x + b*x + c;
		return(f);
	}
	public static double tinhbieuthucf2(double x) {
		double f = 0;
		f = Math.log(x)-1/(Math.sqrt(Math.abs(Math.pow(x, 3)-8)));
		return(f);
	}
	public static double tinhbieuthucf3(double a, double b, double c, int x1, double x2) {
		double f = 0;
		f = tinhbieuthucf1(a, b, c, x1)/tinhbieuthucf2(x2);
		return(f);
	}
}
