package model;

public class RubbedSInstruments extends StringInstruments{

	private int stringsNumber;

	// relaciones
	private Bow bow;

	//constructor
	public RubbedSInstruments(int stringsNumber, Bow bow, String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		super (name, idNumber, height, length, width, nameDistributor, address, phone, places);
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

}