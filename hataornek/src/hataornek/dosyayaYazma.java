package hataornek;

import java.io.FileWriter;
import java.io.IOException;

public class dosyayaYazma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { FileWriter fileWriter = new FileWriter("dosya.txt",true);
		 * fileWriter.write("deneme1\n"); fileWriter.write("deneme2\n");
		 * fileWriter.write("deneme3\n");
		 * 
		 * fileWriter.close();
		 * 
		 * } catch (IOException e) {
		 * System.out.println("Belirtilen dosya yaratılamadı"); e.printStackTrace();
		 */
		try {
			FileWriter fileWriter = new FileWriter("dosya.txt",true);
			fileWriter.write("deneme1\n");
			fileWriter.write("deneme2\n");
			fileWriter.write("deneme3\n");
			
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("Belirtilen dosya yaratılamadı");
			e.printStackTrace();
		}
	}

}
