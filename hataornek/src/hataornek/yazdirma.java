package hataornek;

public class yazdirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < 256; i++) {				//%c karakter
			if (i%10==0) System.out.printf("%c ",13);
				
			
			System.out.printf("%d : %c ",i,i);	//%s string*/
			int b = 255;
			System.out.printf("%b : \n",b);
			System.out.printf("%o : \n",b);
			System.out.printf("%x : \n",b);
			double fsayi = 2345.245678123465;
			System.out.printf("%+2.10f%n",fsayi); //ikinci sayı basamak ifade ediyor
			System.out.printf("%+2.2f%n",fsayi);
			String ad ="berke";
			System.out.printf("|%s|%n",ad);
			System.out.printf("|%15s|%n",ad);
			System.out.printf("|%-15s|%n",ad);
													//%d tamsayı
		}											//%f ondalıklı
	}												//%n new line
													//%t tab tuşu

