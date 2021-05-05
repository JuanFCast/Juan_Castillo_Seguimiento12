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
	@Override
	public String toString(){
		String answer = "Tipo: Instrumentos de cuerdas FROTADAS" +
		"\nNombre: " + name +
		"\nID: " + idNumber +
		"\n----------------------------" +
		"\nDimensiones: " + dimensions.toString() +
		"\n----------------------------" +
		"\nDistribuidor: " + distributorCompany.toString() +
		"\n----------------------------" +
		"\nUbicacion: " + places +
		"\n----------------------------" +
		"\nCantidad de cuerdas: " + stringsNumber +
		"\n----------------------------" +
		"\nArco: " + bow.toString();
		

		return answer;
	}

	  

}