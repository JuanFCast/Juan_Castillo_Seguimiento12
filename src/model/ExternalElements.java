package model;

public class ExternalElements{
	private String name;
	private String material;
	private int amountInstruments;

	// relaciones
	private Dimension dimensionsElements;


	//constructor
	public ExternalElements(String name, String material, int amountInstruments, double height, double length, double width){
		this.name = name;
		this.material = material;
		this.amountInstruments = amountInstruments;
		dimensionsElements = new Dimension(height, length, width);
	}


	//get
	public String getName(){
		return name;
	}

	public String getMaterial(){
		return material;
	}

	public int getAmountInstruments(){
		return amountInstruments;
	}

	public Dimension getDimensionsElements(){
		return dimensionsElements;
	}


	//set
	public void setName(String name){
		this.name = name;
	} 

	public void setMaterial(String material){
		this.material = material;
	} 

	public void setAmountInstruments(int amountInstruments){
		this.amountInstruments = amountInstruments;
	} 

	public void setDimensions(Dimension dimensionsElements){
		this.dimensionsElements = dimensionsElements;
	}


}