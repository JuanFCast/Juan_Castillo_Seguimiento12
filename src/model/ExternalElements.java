package model;

public class ExternalElements{
	private String name;
	private String material;
	private int amountInstruments;

	// relaciones
	private Dimension dimensionsElements;


	//constructor
	public ExternalElements(String name, String material, int amountInstruments, Dimension dimensionsElements){
		this.name = name;
		this.material = material;
		this.amountInstruments = amountInstruments;
		this.dimensionsElements = dimensionsElements;
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


	//to String
	public String toString(){
		String answer = "\nNombre: " + name +
		"\nMaterial: " + material +
		"\nCantidad requerida para tocar el instrumento: " + amountInstruments + 
		"\nDimensiones: " + dimensionsElements.toString();

		return answer;
	}

}