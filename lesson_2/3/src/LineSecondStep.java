
public class LineSecondStep implements ILineStep{
	public Motherboard buildProductPart(){
		System.out.println("Motherboard built");
		return new Motherboard();
	}

}
