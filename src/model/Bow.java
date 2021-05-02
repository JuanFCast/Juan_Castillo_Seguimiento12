package model;

public class Box{
	// relaciones
	private Dimension dimensionsBow;

	//constructor
	public Box(double height, double length, double width){
		dimensionsBow = new Dimension(height, length, width);
	}


	//get
	public Dimension getDimensionsBow(){
		return dimensionsBow;
	}
	

	//set
	public void setDimensionsBow(Dimension dimensionsBow){
		this.dimensionsBow = dimensionsBow;
	}


}