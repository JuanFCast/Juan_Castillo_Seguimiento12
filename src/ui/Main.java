package ui;
import java.util.Scanner;
import model.Instruments;
import model.Dimension;
import model.Distributor;
import model.Place;
import model.PercussionInstruments;
import model.Percussedstruments;
import model.ExternalElements;
import model.WavingInstruments;
import model.WindInstruments;
import model.Material;
import model.StringInstruments;
import model.RubbedSInstruments;
import model.Bow;
import model.PluckedSInstruments;
import model.PercussionSIntruments;
import model.Box;
import model.Keyboard;
import model.Orientation;
import model.MusicShop;




public class Main{
	public Scanner sc;
	private MusicShop point;

	//Constructor para evitar el static
	public Main (){
		showScenario();
		
	} 

	public static void main(String[] args) {
		Main seguimiento12 = new Main();
		
	}

	
	public void showScenario(){

		sc = new Scanner (System.in);
		point = new MusicShop();

    	System.out.println("---------------------------------------------------------------------");
		System.out.println("-----Bienvenido al programa de la tienda musical EN CLAVE DE SOL-----");
		System.out.println("---------------------------------------------------------------------");

    	Instruments[] instruments = new Instruments[6];
		instruments[0] = new Percussedstruments(new ExternalElements("Baquetas", "Madera", 2, new Dimension(40, 40, 1.4)), "XILOFONO", "1006071586", new Dimension(38, 1.5, 4.5), new Distributor("Pipe", "Carrera 47 #11-72", "30145"), Place.TIENDA);
		instruments[1] = new WavingInstruments("Madera", "MARACAS", "1006071585", new Dimension(25, 25, 8), new Distributor("Pipe", "Carrera 47 #11-72", "30145"), Place.TIENDA);
		instruments[2] = new WindInstruments(Material.WOODEN, "FLAUTA", "1508271585", new Dimension(67, 67, 19), new Distributor("Pipe", "Carrera 47 #11-72", "30145"), Place.EXCIBICION);
		instruments[3] = new RubbedSInstruments(4, new Bow(new Dimension(5, 2, 3)), "VIOLOCHENLO", "2508271585", new Dimension(7, 2, 3), new Distributor("Pipe", "Carrera 47 #11-72", "30145"), Place.DISTRIBUIDOR);
		instruments[4] = new PluckedSInstruments(4, 5, true, "GUITARRA", "158881585", new Dimension(5, 2, 3), new Distributor("Pipe", "Carrera 47 #11-72", "30145"), Place.EXCIBICION);
		instruments[5] = new PercussionSIntruments(new Box(new Dimension(5, 2, 3)), new Keyboard(5, "Bronce", new Dimension(5, 2, 3)), Orientation.HORIZONTAL, "PIANO", "1508271585", new Dimension(5, 2, 3), new Distributor("Pipe", "Carrera 47 #11-72", "30145"), Place.TIENDA);

		point.setInstruments(instruments);


		for(int i = 0; i < point.getInstruments().length; i++){

			System.out.println(point.getInstruments()[i].toString());
			System.out.println("******************************************************");
			System.out.println("******************************************************");

			
		}
	}

}
	

