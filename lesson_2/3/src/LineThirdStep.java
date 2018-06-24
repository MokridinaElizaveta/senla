
public class LineThirdStep implements ILineStep{
	public Monitor buildProductPart() {
		System.out.println("Monitor built");
		return new Monitor();
	}

}
