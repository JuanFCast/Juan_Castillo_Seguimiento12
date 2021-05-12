package model;

public class PercussionSIntruments extends StringInstruments{

	//private double totalDimensions;

	// relaciones
	private Box box;
	private Keyboard keyboard;
	private Orientation orientation;
	private double totalDimensions;

	//constructor
	public PercussionSIntruments(Box box, Keyboard keyboard, Orientation orientation, String name, String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		super (name, idNumber, dimensions, distributorCompany, places);
		this.box = box;
		this.keyboard = keyboard;
		this.orientation = orientation;
		totalDimensions = (keyboard.getDimensionsKeyboard().getHight()) + (keyboard.getDimensionsKeyboard().getLength()) + (keyboard.getDimensionsKeyboard().getWidth()) + (box.getDimensionsBox().getHight()) + (box.getDimensionsBox().getLength()) + (box.getDimensionsBox().getWidth());
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
	public void setBox(Box box){
		this.box = box;
	}

	public void setKeyboard(Keyboard keyboard){
		this.keyboard = keyboard;
	}

	public void setOrientation(Orientation orientation){
		this.orientation = orientation;
	}


	//to String
	public String toString(){
		String answer = "Tipo: Instrumentos de cuerdas PERCUTIDAS" +
		"\nNombre: " + name +
		"\nID: " + idNumber +
		"\n----------------------------" +
		"\nDimensiones: " + dimensions.toString() +
		"\n----------------------------" +
		"\nDistribuidor: " + distributorCompany.toString() +
		"\n----------------------------" +
		"\nUbicacion: " + places +
		"\n----------------------------" +
		"\nCaja de resonancia: " + box.toString() + 
		"\n----------------------------" +
		"\nTeclado: " + keyboard.toString() +
		"\n----------------------------" +
		"\nOrientacion: " + orientation + 
		"\n----------------------------" +
		"\nTotal dimensiones de la Caja de Resonancia + Teclado: " + totalDimensions;

		return answer;
	}
}