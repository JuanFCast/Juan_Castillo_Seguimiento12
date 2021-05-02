package model;

public class WindInstruments extends Instruments{
	//relaciones
	private Material material;

	//constructor
	public WindInstruments(Material material, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);

	}

}