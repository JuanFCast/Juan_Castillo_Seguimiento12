package model;

public class WindInstruments extends Instruments{
	//relaciones
	private Material material;

	//constructor
	public WindInstruments(Material material, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);
		this.material = material;

	}

	//get
	public Material getMaterial(){
		return material;
	}


	//set
	public void setMaterial(Material material){
		this.material = material;
	} 

}