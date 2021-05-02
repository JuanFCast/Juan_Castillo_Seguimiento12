package model;

public class WindInstruments extends Instruments{
	//relaciones
	private Material material;

	//constructor
	public WindInstruments(Material material, String name, String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		super (name, idNumber, dimensions, distributorCompany, places);
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

	//to String
	public String toString(){
		String answer = "\nMaterial: " + material;

		return answer;
	}

}