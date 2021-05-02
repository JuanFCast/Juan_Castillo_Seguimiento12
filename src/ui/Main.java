package ui;

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
import model.PercussionSInstruments;
import model.Box;
import model.Keyboard;
import model.Orientation;

public class Main{
	public Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		Main seguimiento12 = new Main();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("-----Bienvenido al programa de la tienda musical EN CLAVE DE SOL-----");
		System.out.println("---------------------------------------------------------------------");

		seguimiento12.execute();
	}


}
	



