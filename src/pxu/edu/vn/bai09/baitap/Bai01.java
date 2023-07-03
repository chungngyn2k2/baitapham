package pxu.edu.vn.bai09.baitap;

public class Bai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double snn = Math.random();
		int n = (int) (Math.random() *100  + 1) ;
		int count = 0;
		count = count +1 ;
		System.out.println("n = "+n);
		while(n % 20 != 0) {
			n = (int) (Math.random() * 100 + 1) ;
			count = count +1 ;
			System.out.println("n = "+n);
		}
		System.out.println("CHUONG TRINH KET THUC SAU "+count +" BUOC");
		System.out.println("CHUONG TRINH KET THUC!");
	}

}
