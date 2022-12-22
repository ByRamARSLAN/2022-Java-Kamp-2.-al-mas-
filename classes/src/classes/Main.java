package classes;

public class Main {

	public static void main(String[] args) {
		// class'lar referance type'tır.
		CustomerManager customerManager = new CustomerManager(); // cM için heap'te bir alan oluşturulur
		CustomerManager customerManager2 = new CustomerManager(); // cM2 için heap'te bir alan oluşturulur
		customerManager = customerManager2; // dediğimizde cM'ın heap'te tuttuğu alan boşa düşmüş oluyor
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		// value (Değer Tipleri)
		
		// Değer tipleri, veri tipine göre belirli bir boyutta bir bellek alanında saklanan ve değerlerini
		// değiştiremeyen verilerdir. Örneğin, bir tamsayı değer tipi(integer), bir ondalık sayı değer tipi(float)
		// veya bir karakter değer tipi(char) gibi.
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		// Referance type(Referans Tipi)
		
		// Referans tipleri ise, bellekte bir nesnenin adresini saklayan ve bu adrese göre nesneye 
		// erişen verilerdir. Örneğin, bir dizi(array), bir sınıf(class) veya bir interface gibi.
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		// Yukarıda referans tip ile değer tipleri arasındaki fark;
		// değer tiplerinde sayi2'yi sayi1'e(10) eşitlediğimizde ve sonrasında sayi1'i(30) değiştirdiğimizde
		// yapılan değişiklik sayi2'den bağımsızdır. sayi2'nin çıktısını aldığımızda sayi2, sayi1'in 
		// önceki değerine, yani 10'a eşitlendiği için çıktımız 30 değil 10 değerini verecektir.
		
		// referans tiplerinde ise olay bambaşkadır. dizi olarak tanımladığımız sayilar1 ve sayilar2
		// dizi olarak tanımlandığı için stack'te değişken olarak yer edinir ve heap'te bir sıra alır,
		// aynı şekilde sayilar2'de dizi olarak tanımlandığı için stack'te sayilar2 ismi ile yer tutar ve 
		// heap'te de başka bir sıra alır. İşte burada sayilar2'yi sayilar1'e eşitlediğimizde otomatikmen
		// stack'te sayilar1 ve sayilar2 diye tanımladığımız değikenleri heap'te önceden sayilar1 için 
		// tanımladığımız blok, sayilar2'yi de temsil edecek. Bundan dolayı sayilar1'de yapacağımız herhangi
		// bir değişiklik sayilar2'yi de etkileyecektir.
		
		
		
	}

}
