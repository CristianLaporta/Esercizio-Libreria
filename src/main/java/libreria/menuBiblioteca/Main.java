package libreria.menuBiblioteca;

import java.security.PublicKey;

import libreria.ElementoLetterario.Libro;
import libreria.ElementoLetterario.Periodicita;
import libreria.ElementoLetterario.Rivista;

public class Main {

	public static void main(String[] args) {
	Libro test = new Libro("abcde","libro di prova" , 2022, 100, "Fantasy", "sconosciito");
	Rivista test2 = new Rivista("abc123", "Rivista di prova", 2021, 10, Periodicita.settimanale);
	Archivio arc = new Archivio();
	arc.aggiungiElemento(test);
	arc.aggiungiElemento(test2);
	arc.ricercaAnnoPubblicazione(2022);
	}

}
