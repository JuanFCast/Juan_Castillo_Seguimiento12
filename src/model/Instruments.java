package model;

public class Instruments{
	private String idNumber;

	// relaciones
	private Dimension dimensions;
	private Distributor distributorCompany;
	private Place places;

	//constructor
	public Instruments(String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		this.idNumber = idNumber;
		this.dimensions = dimensions;
		this.distributorCompany = distributorCompany;
		this.places = places;
	}

}