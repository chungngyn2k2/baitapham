package pxu.edu.vn.Bai12;

public class Bai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,0,2,1};
		//cach 1
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"");
		}
		System.out.println();
		
		//cach 2
		for (int value: a) {
			System.out.print(value+" ");
		}
	}

}
