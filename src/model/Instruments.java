package model;

public class Instruments{
	protected String name;
	protected String idNumber;

	// relaciones
	protected Dimension dimensions;
	protected Distributor distributorCompany;
	protected Place places;

	//constructor
	public Instruments(String name, String idNumber, double height, double length, double width, String nameDistributor, String address, String phone, Place places){
		this.name = name;
		this.idNumber = idNumber;
		dimensions = new Dimension(height, length, width);
		distributorCompany = new Distributor(nameDistributor, address, phone);
		this.places = places;
	}

	//get
	public String getName(){
		return name;
	}

	public String getIdNumber(){
		return idNumber;
	}

	public Dimension getDimensions(){
		return dimensions;
	}

	public Distributor getDistributorCompany(){
		return distributorCompany;
	}

	public Place getPlaces(){
		return places;
	}



	//set
	public void setName(double aName){
		this.name = name;
	} 

	public void setLength(double aIdNumber){
		this.idNumber = idNumber;
	} 

	public void setDimensions(Dimension aDimensions){
		this.dimensions = dimensions;
	}

	public void setDistributorCompany(Distributor aDistributorCompany){
		this.distributorCompany = distributorCompany;
	}

	public void setPlaces(Place aPlaces){
		this.places = places;
	}

	//to String

}