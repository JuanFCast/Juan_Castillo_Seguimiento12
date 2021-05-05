package model;

public class Keyboard{
	private int amountOctavas;
	private String material;

	//relaciones
	private Dimension dimensionsKeyboard;

	//constructor
	public Keyboard(int amountOctavas, String material, Dimension dimensionsKeyboard){
		this.amountOctavas = amountOctavas;
		this.material = material;
		this.dimensionsKeyboard = dimensionsKeyboard;
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
	public void setAmountOctavas(int amountOctavas){
		this.amountOctavas = amountOctavas;
	}

	public void setMaterial(String material){
		this.material = material;
	}

	public void setDimensionsKeyboard(Dimension dimensionsKeyboard){
		this.dimensionsKeyboard = dimensionsKeyboard;
	}


	//to String
	public String toString(){
		String answer = "\nCantidad de octavas: " + amountOctavas +
		"\nMaterial: " + material +
		"\nDimensiones del teclado: " + dimensionsKeyboard.toString();

		return answer;
	}


}