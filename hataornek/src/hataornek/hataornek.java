package hataornek;

public class hataornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b =2, c =1;
		String d ="3";
		
		try {
			System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"/"+c+"="+(a/c));
		System.out.println(a+"/"+d+"="+(a/Integer.parseInt(d)));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			c=1;
			System.out.println(a+"/"+c+"="+(a/c));
			//System.out.println("Hata :"+e);	//Hata getirsin kodu
			//System.out.println("Hata :"+e.getMessage());//Sadece mesajı getirmesi için
		}catch (NumberFormatException e) {
			// TODO: handle exception
			d=d.trim();
			System.out.println(a+"/"+d+"="+(a/Integer.parseInt(d)));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			System.out.println("Try bloğu sonunda hata olsa da olmasa da çalışır");
		}
		System.out.println("Program Bitti");
		
		
	}

}
