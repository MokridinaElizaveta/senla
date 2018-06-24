
public class Product implements IProduct{
	public IProductPart body;
	public IProductPart motherboard;
	public IProductPart monitor;
	public void installFirstPart(IProductPart productPart) {
		this.body = productPart;
		System.out.println("Body installed");
	}
	public void installSecondPart(IProductPart productPart) {
		this.motherboard = productPart;
		System.out.println("Motherboard installed");
	}
	public void installThirdPart(IProductPart productPart) {
		this.monitor = productPart;
		System.out.println("Monitor installed");
	}

}
