package model;

public class PercussionSIntruments extends StringInstruments{

	// relaciones
	private Box box;
	private Keyboard keyboard;
	private Orientation orientation;

	//constructor
	public PercussionSIntruments(double heightBox, double lengthBox, double widthBox, double heightKey, double lengthKey, double widthKey, int amountOctavas, String material, Orientation orientation, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);
		box = new Box(heightBox, lengthBox, widthBox);
		keyboard = new Keyboard(heightKey, lengthKey, widthKey, amountOctavas, material);
		this.orientation = orientation;
	}

	//get
	public Box getBox(){
		return box;
	}

	public Keyboard getKeyboard(){
		return keyboard;
	}

	public Orientation getOrientation(){
		return orientation;
	}
	

	//set
	public void setBox(Box aBox){
		this.box = box;
	}

	public void setKeyboard(Keyboard aKeyboard){
		this.keyboard = keyboard;
	}

	public void setOrientation(Orientation aOrientation){
		this.orientation = orientation;
	}

}