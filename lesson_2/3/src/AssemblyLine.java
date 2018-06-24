
public class AssemblyLine implements IAssemblyLine{
	
	public LineFirstStep lineFirstStep;
	public LineSecondStep lineSecondStep;
	public LineThirdStep lineThirdStep;
	
	AssemblyLine(LineFirstStep lineFirstStep,LineSecondStep lineSecondStep,LineThirdStep lineThirdStep ){
		this.lineFirstStep= lineFirstStep;
		this.lineSecondStep = lineSecondStep;
	    this.lineThirdStep = lineThirdStep;
		System.out.println("Assembly line created");
	}
	public IProduct assembleProduct(IProduct product) {
		
		Body body = lineFirstStep.buildProductPart();
		Motherboard motherboard =lineSecondStep.buildProductPart();
		Monitor monitor = lineThirdStep.buildProductPart();
		
		product.installFirstPart(body);
		product.installSecondPart(motherboard);
		product.installThirdPart(monitor);
		
		System.out.println("Laptop created");
		return product;
	}
}
