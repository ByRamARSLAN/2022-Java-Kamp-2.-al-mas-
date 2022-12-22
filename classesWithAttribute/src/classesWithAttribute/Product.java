package classesWithAttribute;

public class Product {
	
	// Constructor ile new'lediğimiz bloğu devreye sokuyoruz, her bir class'ın constructor'u olabilir
	// olmayadabilir, constructor sınıfın ismi ile isimlenir, void vesaire olmaksızın.
	
	public Product(int id, String name, String description, double price, int stackAmount, String kod) {
		// sadece yukarıda verdiğimiz tanımlamarı aşağıda verebiliriz. çünkü
		
		System.out.println("Yapici blok calisti, main'de new'ledigimiz Product classi ile");
		System.out.println("Product metodunu yani constructor'u cagiriyoruz.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stackAmount = stackAmount;
		this.kod = kod;
	}

	
	public Product() { // ayrıca değer tanımlamadığımız bir başka constructer'da tanımlıyoruz.
		
		
	}
	
	
	// Attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stackAmount;
	private String kod;
	
	// get kelime anlamı al, getir anlamındadır ve sadece okuma yapar.
	public int getId() {
		return id;
	}
	
	// set ise kurmak, ayarlamak(setup) anlamındadır. bir değer atamaya yarar.{product.setId(847);} gibi..
	public void setId(int id) { // buradaki id bu satıra ait id'dir.
		this.id = id; // buradaki ilk id public class Product sınıfına ait id'dir. ikinci id ise bir önceki
					  // satırda yani {public void setId(int id)}'de tanımladığımız id'dir.
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStackAmount() {
		return stackAmount;
	}
	public void setStackAmount(int stackAmount) {
		this.stackAmount = stackAmount;
	}

	public String getKod() {
		return this.name.substring(0,1) + id; // burada ürün kodunu, ismin ilk harfi artı id olarak
											  // tanımlıyoruz. yani L897346300 olacak şekilde ayarlıyoruz.
	}



}
