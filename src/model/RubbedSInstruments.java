package model;

public class RubbedSInstruments extends StringInstruments{

	private int stringsNumber;

	//constructor
	public RubbedSInstruments(int stringsNumber, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);
		this.stringsNumber = stringsNumber;

	}

	//get
	public int getStringsNumber(){
		return stringsNumber;
	}

	//set
	public void setStringsNumber(int stringsNumber){
		this.stringsNumber = stringsNumber;
	} 

}