package model;

public class Distributor{

	private String name;
	private String address;
	private String phone;

	// relaciones

	//constructor
	public Donor(String name, String address, String phone){
		this.name   = name;
		this.address = address;
		this.phone  = phone;
	}


	//get
	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}


	//set
	public void setName(String aName){
		this.name = name;
	} 

	public void setAddress(String aAddress){
		this.address = address;
	} 

	public void setPhone(String aPhone){
		this.phone = phone;
	}

	//to String

}