package model;

public class Box{
	// relaciones
	private Dimension dimensionsBox;

	//constructor
	public Box(Dimension dimensionsBox){
		this.dimensionsBox = dimensionsBox;
	}


	//get
	public Dimension getDimensionsBox(){
		return dimensionsBox;
	}
	

	//set
	public void setDimensionsBox(Dimension dimensionsBox){
		this.dimensionsBox = dimensionsBox;
	}
	

	//to String
	public String toString(){
		String answer = "\nDimensiones de la caja: " + dimensionsBox.toString();

		return answer;
	}


}