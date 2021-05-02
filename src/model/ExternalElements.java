package model;

public class ExternalElements{
	private String material;
	private int amountInstruments;

	// relaciones
	private Dimension dimensions;


	//constructor
	public ExternalElements(String material, int amountInstruments, double height, double length, double width){
		this.material = material;
		this.amountInstruments = amountInstruments;
		dimensions = new Dimension(height, length, width);
	}


	//get
	public String getMaterial(){
		return material;
	}

	public int getAmountInstruments(){
		return amountInstruments;
	}

	public Dimension getDimensions(){
		return dimensions;
	}


	//set
	public void setMaterial(String aMaterial){
		this.material = material;
	} 

	public void setAmountInstruments(int aAmountInstruments){
		this.amountInstruments = amountInstruments;
	} 

	public void setDimensions(Dimension aDimensions){
		this.dimensions = dimensions;
	}

	//to String

}