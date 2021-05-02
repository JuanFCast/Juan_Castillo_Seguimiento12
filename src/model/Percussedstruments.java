package model;

public class Percussedstruments extends PercussionInstruments{
	//relaciones
	private ExternalElements elements;

	//constructor
	public Percussedstruments(ExternalElements elements, String name, String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		super (name, idNumber, dimensions, distributorCompany, places);
		this.elements = elements;
	}

	

	//get
	public ExternalElements getElements(){
		return elements;
	}


	//set
	public void setElements(ExternalElements elements){
		this.elements = elements;
	} 

	//to String
	public String toString(){
		String answer = "\nElementos externos: " + elements.toString();

		return answer;
	}


}