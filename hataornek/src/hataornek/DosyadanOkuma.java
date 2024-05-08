package hataornek;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyadanOkuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fileReader = new FileReader("dosya.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			int okunan;
			String satir;
			//System.out.println(reader.skip(30));

			while (true) {

				/*
				 * okunan = reader.read(); if (okunan < 0) break; System.out.printf("%c" +
				 * okunan);
				 */

				satir = reader.readLine();
				if (satir == null)
					break;
				System.out.println(satir);

			}

			System.out.println("----------------------");
			reader.close();
			FileReader fileReader1 = new FileReader("dosya.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader1);
			while ((satir = bufferedReader.readLine()) != null) {
				System.out.println(satir);
			}

			/* System.out.printf("%c",reader.read()); */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Okunacak Dosya Mevcut değil");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya Okunamadı");
			e.printStackTrace();
		}
	}

}
