package model;

public class Percussedstruments extends PercussionInstruments{
	//relaciones
	private ExternalElements elements;

	//constructor
	public Percussedstruments(String nameElement, String material, int amountInstruments, double heightE, double lengthE, double widthE, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);
		elements = new ExternalElements(nameElement, material, amountInstruments, heightE, lengthE, widthE);

	}

	//get
	public ExternalElements getElements(){
		return elements;
	}


	//set
	public void setElements(ExternalElements elements){
		this.elements = elements;
	} 


}