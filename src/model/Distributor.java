package model;

public class Distributor{

	private String name;
	private String address;
	private String phone;

	// relaciones

	//constructor
	public Distributor(String name, String address, String phone){
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
	public void setName(String name){
		this.name = name;
	} 

	public void setAddress(String address){
		this.address = address;
	} 

	public void setPhone(String phone){
		this.phone = phone;
	}


	//to String
	public String toString(){
		String answer = "\nNombre del distribuidor: " + name +
		"\nDireccion del distribuidor: " + address +
		"\nTelefono: " + phone;

		return answer;
	}
}