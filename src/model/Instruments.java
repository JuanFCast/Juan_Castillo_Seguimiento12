package model;

public abstract class Instruments{
	protected String name;
	protected String idNumber;

	// relaciones
	protected Dimension dimensions;
	protected Distributor distributorCompany;
	protected Place places;

	//constructor
	public Instruments(String name, String idNumber, Dimension dimensions, Distributor distributorCompany, Place places){
		this.name = name;
		this.idNumber = idNumber;
		this.dimensions = dimensions;
		this.distributorCompany = distributorCompany;
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
	public void setName(String name){
		this.name = name;
	} 

	public void setLength(String idNumber){
		this.idNumber = idNumber;
	} 

	public void setDimensions(Dimension dimensions){
		this.dimensions = dimensions;
	}

	public void setDistributorCompany(Distributor distributorCompany){
		this.distributorCompany = distributorCompany;
	}

	public void setPlaces(Place places){
		this.places = places;
	}

	//to String
	public String toString(){
		String answer = "\nNombre: " + name +
		"\nID: " + idNumber +
		"\nDimensiones: " + dimensions.toString() +
		"\nDistribuidor: " + distributorCompany.toString() +
		"\nUbicacion: " + places;

		return answer;
	}
}