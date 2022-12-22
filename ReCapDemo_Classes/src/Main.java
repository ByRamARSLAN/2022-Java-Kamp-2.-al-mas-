
public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int topla = dortIslem.Topla(3, 4);
		System.out.println(topla);
		
		int cikar = dortIslem.Cikar(3, 4);
		System.out.println(cikar);
		
		int carp = dortIslem.Carp(3, 4);
		System.out.println(carp);
		
		float bol = dortIslem.Bol(3, 4);
		System.out.println(bol);

	}

}
