package model;

public class Dimension{

	private double hight;
	private double length;
	private double width;

	// relaciones

	//constructor
	public Dimension(double hight, double length, double width){
		this.hight   = hight;
		this.length = length;
		this.width  = width;
	}


	//get
	public double getHight(){
		return hight;
	}

	public double getLength(){
		return length;
	}

	public double getWidth(){
		return width;
	}


	//set
	public void setHight(double aHight){
		this.hight = hight;
	} 

	public void setLength(double aLength){
		this.length = length;
	} 

	public void setWidth(double aWidth){
		this.width = width;
	}

	//to String

}