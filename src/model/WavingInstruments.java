package model;

public class WavingInstruments extends PercussionInstruments{


	private String material;
	

	//constructor
	public WavingInstruments(String material, String name, String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		super (name, idNumber, dimensions, distributorCompany, places);
		this.material = material;
		

	}

	//get
	public String getMaterial(){
		return material;
	}


	//set
	public void setMaterial(String material){
		this.material = material;
	}



	//to String
	@Override
	public String toString(){
		String answer = "Tipo: Instrumentos de percusion AGITADOS" +
		"\nNombre: " + name +
		"\nID: " + idNumber +
		"\n----------------------------" +
		"\nDimensiones: " + dimensions.toString() +
		"\n----------------------------" +
		"\nDistribuidor: " + distributorCompany.toString() +
		"\n----------------------------" +
		"\nUbicacion: " + places +
		"\n----------------------------" +
		"\nMaterial: " + material;

		return answer;
	}

}