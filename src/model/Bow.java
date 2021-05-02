package model;

public class Box{
	// relaciones
	private Dimension dimensionsBow;

	//constructor
	public Bow(Dimension dimensionsBow){
		this.dimensionsBow = dimensionsBow;
	}


	//get
	public Dimension getDimensionsBow(){
		return dimensionsBow;
	}
	

	//set
	public void setDimensionsBow(Dimension dimensionsBow){
		this.dimensionsBow = dimensionsBow;
	}

	//to String
	public String toString(){
		String answer = "\nDimensiones del arco: " + dimensionsBow.toString();

		return answer;
	}


}