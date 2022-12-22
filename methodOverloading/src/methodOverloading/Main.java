package methodOverloading;

public class Main {
	
	public static void main(String[] args) {
		
		DortIslem dortIslem = new DortIslem();
		
		System.out.println(dortIslem.topla(5, 7));
		System.out.println(dortIslem.topla(5, 3, 9));
		
		// yukarıdaki örnekte dortIslem. dediğimizde 2 tane topla metodu seçeneği karşımıza çıkıyor
		// ilk topla seçeneğimizde 2 tane sayı girmemiz istenirken 2. topla seçeneğimizde ise 
		// 3 tane tamsayı girmemiz istenmekte. İşte bu seçme özgürlüğüne overloading deniyor.
		
	}

}
