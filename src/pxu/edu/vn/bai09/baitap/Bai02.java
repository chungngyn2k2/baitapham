package pxu.edu.vn.bai09.baitap;

public class Bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		boolean flag = false;
		while(!flag) {
			int n = (int)(Math.random()*100+1);
			count = count + 1;
			System.out.println("n = "+n);
			if(n % 20 == 0) {
				flag = true;
			}
		}
		System.out.println("CHUONG TRINH KET THUC SAU: "+ count +" BUOC");
		System.out.println("CHUONG TRINH KET THUC");
	}
}
