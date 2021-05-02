package model;

public class Percussedstruments extends PercussionInstruments{
	//relaciones
	private ExternalElements elements;

	//constructor
	public Percussedstruments(ExternalElements elements, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);

	}


}