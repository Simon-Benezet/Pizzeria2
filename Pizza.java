package Pizzeria;

public class Pizza{
	String code;
	String designation;
	float prix;
	
	public Pizza(String code, String designation, float prix) 
	{
		super();
		this.code = code;
		this.designation = designation;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Pizza [code=" + code + ", designation=" + designation + ", prix=" + prix + "]";
	}
}
