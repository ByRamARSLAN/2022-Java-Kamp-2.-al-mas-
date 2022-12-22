package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!, Hello Eclipse!");
		
		String ortaMetin = "Ilginizi Cekebilir";
		String altMetin = "Vade";
		
		System.out.println("ortaMetin"); // çıktı "ortaMetin" olacak
		System.out.println(ortaMetin); // çıktı "İlginizi Çekebilir" olacak
		
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) { // true
			
			okYonu = "down.svg";
			System.out.println(okYonu);
						
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		// array
			
		String[] krediler = {"Hizli Kredi", "Maasini Halkbanktan Alanlar", "Emekliler Icin Kredi"};
		
		//System.out.println(krediler[0]);
		//System.out.println(krediler[1]);
		//System.out.println(krediler[2]);
		
		// Şimdi burada biz 3 adet veri talep ettik ama başka sitelerde binlerce veri var ve biz bu verileri
		// böyle teker teker çağıracak değiliz. Döngülerle yapacağız bu çağırma işlemini
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		}
	} 

}
