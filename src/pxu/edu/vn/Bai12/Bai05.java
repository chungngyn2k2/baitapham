package pxu.edu.vn.Bai12;

import java.util.Scanner;

public class Bai05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Buoc 1: Nhap n nguyen duong tu ban phim
			Scanner sc = new Scanner(System.in);
			int n;
			do {
				System.out.print("n=");
				n = sc.nextInt();
			} while(n<=0);
			//Buoc 2:Tao mang so nguyen n phan tu ngau nhien
			int[] a = new int[n];
			for(int i=0;i<a.length;i++) {
				a[i]= (int) (Math.random()*10);
			}
			//Buoc 3:Xuat mang ra man hinh
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"");
			}
			System.out.println();//Xuong dong
			//Buoc4: Sap xep mang theo chieu tang dan
			for(int i = 0; i < a.length - 1; i++) {
				for(int j = i + 1; j < a.length; j++) {
					if(a[i] > a[j]) {
						int tam = a[i];
						a[i] = a[j];
						a[j] = tam;
					}
				}
			}
			//Buoc 5: Xuat mang ra man hinh
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]+"");
			}
		}catch(Exception e) {
			System.out.println("Sai cu phap");
		}
	}	

}
