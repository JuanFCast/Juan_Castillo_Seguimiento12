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

public class Main{
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		Main seguimiento12 = new Main();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("-----Bienvenido al programa de la tienda musical EN CLAVE DE SOL-----");
		System.out.println("---------------------------------------------------------------------");
		seguimiento12.showScenario();

	}
	/*
	public Main(){
		Percussedstruments  xilofono= new Percussedstruments(new ExternalElements("Baquetas", "Madera", 2, new Dimension(5, 2, 3)), "XILOFONO", "123", new Dimension(5, 2, 3), new Distributor("Pedro", "En su casa", "30145"), Place.TIENDA);
	}
	*/
	public void showScenario(){
		Instruments [] instruments = new Instruments[6];
		instruments[0] = new Percussedstruments(new ExternalElements("Baquetas", "Madera", 2, new Dimension(5, 2, 3)), "XILOFONO", "123", new Dimension(5, 2, 3), new Distributor("Pedro", "En su casa", "30145"), Place.TIENDA);
		instruments[1] = new WavingInstruments("Madera", "MARACAS", "123", new Dimension(5, 2, 3), new Distributor("Pedro", "En su casa", "30145"), Place.TIENDA);
		instruments[2] = new WindInstruments(Material.WOODEN, "FLAUTA", "123", new Dimension(5, 2, 3), new Distributor("Pedro", "En su casa", "30145"), Place.EXCIBICION);
		instruments[3] = new RubbedSInstruments(4, new Bow(new Dimension(5, 2, 3)), "VIOLOCHENLO", "123", new Dimension(5, 2, 3), new Distributor("Pedro", "En su casa", "30145"), Place.TIENDA);
		instruments[4] = new PluckedSInstruments(4, 5, true, "GUITARRA", "123", new Dimension(5, 2, 3), new Distributor("Pedro", "En su casa", "30145"), Place.EXCIBICION);
		instruments[5] = new PercussionSIntruments(new Box(new Dimension(5, 2, 3)), new Keyboard(5, "Bronce", new Dimension(5, 2, 3)), Orientation.HORIZONTAL, "PIANO", "123", new Dimension(5, 2, 3), new Distributor("Pedro", "En su casa", "30145"), Place.TIENDA);
		System.out.println(instruments[0].toString());
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(instruments[1].toString());
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(instruments[2].toString());
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(instruments[3].toString());
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(instruments[4].toString());
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(instruments[5].toString());
	}

}
	



