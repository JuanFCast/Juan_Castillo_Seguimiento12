package model;

public class Box{
	// relaciones
	private Dimension dimensionsBox;

	//constructor
	public Box(double height, double length, double width){
		dimensionsBox = new Dimension(height, length, width);
	}


	//get
	public Dimension getDimensionsBox(){
		return dimensionsBox;
	}
	

	//set
	public void setDimensionsBox(Dimension aDimensionsBox){
		this.dimensionsBox = dimensionsBox;
	}


}