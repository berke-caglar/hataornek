package hataornek;

import java.util.Scanner;

public class hataornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char karakter = 'A';
		int a =12345;
		int sayi[]= {1,2,3,4,7};
		try {
			System.out.println("İlk Elemanı : "+sayi[0]);
			System.out.println("Son Elemanı : "+sayi[sayi.length-1]);
			System.out.println(a+"/"+karakter+"="+(a/karakter));
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Son Elemanı : "+sayi[sayi.length-1]);
			
		}catch (Exception e) {
			System.out.println("Hata : "+e);
			
		}
	}
	

}
