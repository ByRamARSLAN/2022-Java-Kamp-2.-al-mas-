package classesWithAttribute;

public class Main {
	public static void main(String[] args) {
		
			
		Product product = new Product(897346300, "Laptop", "i7 islemci", 14525, 34, "L897346300");
		
	
/*		product.setName("Laptop"); // önceki hali product.name = "Laptop"; idi. ama bu hal ile getter ve
								   // setter ile private ettiğimiz verileri çekemiyoruz. Çekebilmek için 
								   // mevcut kod durumuna yani product.setName("Laptop"); yapmamız gerek.
		
		product.setDescription("i7 islemci");
		product.setId(897346300);
		product.setPrice(14525);
		product.setStackAmount(34);    */
	
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
	}
	

}
