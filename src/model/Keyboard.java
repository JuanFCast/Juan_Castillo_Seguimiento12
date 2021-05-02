package model;

public class Keyboard{
	private int amountOctavas;
	private String material;

	//relaciones
	private Dimension dimensionsKeyboard;

	//constructor
	public Keyboard(int amountOctavas, String material, double height, double length, double width){
		this.amountOctavas = amountOctavas;
		this.material = material;
		dimensionsKeyboard = new Dimension(height, length, width);
	}


	//get
	public int getAmountOctavas(){
		return amountOctavas;
	}

	public String getMaterial(){
		return material;
	}


	public Dimension getDimensionsKeyboard(){
		return dimensionsKeyboard;
	}
	

	//set
	public void setAmountOctavas(int aAmountOctavas){
		this.amountOctavas = amountOctavas;
	}

	public void setMaterial(String aMaterial){
		this.material = material;
	}

	public void setDimensionsKeyboard(Dimension aDimensionsKeyboard){
		this.dimensionsKeyboard = dimensionsKeyboard;
	}


}