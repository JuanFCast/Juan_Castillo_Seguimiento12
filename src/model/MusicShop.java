package model;

public class MusicShop{

	// relaciones
	private Instruments [] instruments;

	//constructor
	public MusicShop(){
	instruments = new Instruments[6];

	}


	//get
	public Instruments [] getInstruments(){
		return instruments;
	}


	//set
	public void setInstruments(Instruments [] instruments){
		this.instruments = instruments;
	} 



	//metodos
	public void addInstrumens (Instruments obj)
	{
		for (int i = 0; 1 < instruments.length; i++)
		{
			if (instruments[i] == null)
			{
				instruments[i] = obj;

			}
		}
	}
	


	public String ShowInstruments ()
	{
		String out = "";
		for (int i = 0; 1 < instruments.length; i++)
		{
			if (instruments[i] == null)
			{
				out += instruments[i].toString();

			}
		}
		return out;
	}
	

	
	//to String
	public String toString(){

		String answer = "";

		for(int i = 0; i < instruments.length; i++){

			answer += instruments[i].toString() + "\n";
		}
		return answer;
	}


}
	



