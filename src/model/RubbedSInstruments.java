package model;

public class RubbedSInstruments extends StringInstruments{

	private int stringsNumber;

	// relaciones
	private Bow bow;

	//constructor
	public RubbedSInstruments(int stringsNumber, Bow bow, String name, String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		super (name, idNumber, dimensions, distributorCompany, places);
		this.stringsNumber = stringsNumber;
		this.bow = bow;

	}

	//get
	public int getStringsNumber(){
		return stringsNumber;
	}

	public Bow getBow(){
		return bow;
	}

	//set
	public void setStringsNumber(int stringsNumber){
		this.stringsNumber = stringsNumber;
	}

	public void setBow(Bow bow){
		this.bow = bow;
	}


	//to String
	public String toString(){
		String answer = "\nCantidad de cuerdas: " + stringsNumber + 
		"\nArco: " + bow.toString();

		return answer;
	}

	  

}