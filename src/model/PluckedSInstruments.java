package model;

public class PluckedSInstruments extends StringInstruments{

	private int stringsNumber;
	private int fretsNumber;
	private boolean haveCase;


	//constructor
	public PluckedSInstruments(int stringsNumber, int fretsNumber, boolean haveCase, String name, String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		super (name, idNumber, dimensions, distributorCompany, places);
		this.stringsNumber = stringsNumber;
		this.fretsNumber = fretsNumber;
		this.haveCase = haveCase;

	}

	//get
	public int getStringsNumber(){
		return stringsNumber;
	}

	public int getFretsNumber(){
		return fretsNumber;
	}

	public boolean getHaveCase(){
		return haveCase;
	}


	//set
	public void setStringsNumber(int stringsNumber){
		this.stringsNumber = stringsNumber;
	} 

	public void setFretsNumber(int fretsNumber){
		this.fretsNumber = fretsNumber;
	} 

	public void setHaveCase(boolean haveCase){
		this.haveCase = haveCase;
	} 


	//to String
	public String toString(){
		String answer =  "Tipo: Instrumentos de cuerdas FROTADAS" +
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
		"\nCantidad de trastes: " + fretsNumber +
		"\n----------------------------" +
		"\nEstuche: " + haveCase;


		return answer;
	}


}