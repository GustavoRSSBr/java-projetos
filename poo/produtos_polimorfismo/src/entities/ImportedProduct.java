package entities;

public class ImportedProduct extends Product {

	private Double custumsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String nome, Double price, Double custumsFee) {
		super(nome, price);
		this.custumsFee = custumsFee;
	}

	public Double getCustumsFee() {
		return custumsFee;
	}

	public void setCustumsFee(Double custumsFee) {
		this.custumsFee = custumsFee;
	}
	
	public Double totalPrice() {
		return price + custumsFee;
	}
	
	@Override
	public final String priceTag() {
		return toString() + " (Customs Fee: $ " + String.format("%.2f", getCustumsFee()) + ")";
	}

}
