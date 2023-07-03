package pxu.edu.vn.bai11;

public class Bai456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static double tinhbieuthucf1(double a, double b, double c, double x ) {
		double f= a*x*x + b*x + c;
		return(f);
	}
	public static double tinhbieuthucf2(double x) {
		double f = Math.log(x)-1/(Math.sqrt(Math.abs(Math.pow(x, 3)-8)));
		return(f);
	}
	public static double tinhbieuthucf3() {
		double f = tinhbieuthucf1() / tinhbieuthucf2();
		return(f);
	}
}
