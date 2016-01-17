package ml_2015;

public class Product {
	
	private int p_id;
	private String title;
	private String barcode;
	private String category;
	private String subcategory;
	private float price;
	private int vat;
	private int quantity;
	
	public Product( int p_id,
			String title,
			String barcode,
			String category,
			String subcategory,
			float price,
			int vat,
			int quantity) {
		this.p_id = p_id;
		this.title = title;
		this.barcode = barcode;
		this.category = category;
		this.subcategory = subcategory;
		this.price = price;
		this.vat = vat;
		this.quantity = quantity;
	}

}