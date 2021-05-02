package model;

public class PluckedSInstruments extends StringInstruments{

	private int stringsNumber;
	private int fretsNumber;
	private boolean haveCase;


	//constructor
	public PluckedSInstruments(int stringsNumber, int fretsNumber, boolean haveCase, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);
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


}