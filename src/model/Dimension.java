package model;

public class Dimension{

	private double high;
	private double length;
	private double width;

	// relaciones

	//constructor
	public Donor(double high, double length, double width){
		this.high   = high;
		this.length = length;
		this.width  = width;
	}


	//get
	public double getHigh(){
		return high;
	}

	public double getLength(){
		return length;
	}

	public double getWidth(){
		return width;
	}


	//set
	public void setHigh(double aHigh){
		this.high = high;
	} 

	public void setLength(double aLength){
		this.length = length;
	} 

	public void setWidth(double aWidth){
		this.width = width;
	}

	//to String

}