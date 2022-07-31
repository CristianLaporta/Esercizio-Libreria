package libreria.menuBiblioteca;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import libreria.ElementoLetterario.ElementoLetter;
import libreria.ElementoLetterario.Libro;

public class Archivio {
private  Map<String, ElementoLetter> memoria = new HashMap<String, ElementoLetter>();

public void ricercaIsbn(String codiceIsbn) {
	ElementoLetter letterario = memoria.get(codiceIsbn);
	System.out.println(letterario);
};
public void ricercaAnnoPubblicazione(int annoPubblicazione) {
	memoria.values().stream()
	.filter(ele -> annoPubblicazione == ele.getAnnoPubblicazione()) // uso una lambda function
	.forEach(ele -> System.out.println(ele));;
};
public void aggiungiElemento(ElementoLetter b) {
	memoria.put(b.getIsbn(), b);
};
public void rimuoviElemento(String codiceIsbn) {
    memoria.remove(codiceIsbn);
    System.out.println("Tutto eliminato Correttamente!");
};
public void ricercaAutore(String autore) {

    memoria.values().stream()
    .filter(ele -> ele instanceof Libro)
    .map(ele ->(Libro)ele)
    .filter(ele -> autore.equals(ele.getAutore()))
    .forEach(ele -> System.out.println(ele));
};
public void salvaFile() { // libreria apache.commons
	File eleFile = new File("memoria/memoria.txt");
	String dato = "";
    for (ElementoLetter ele: memoria.values()){
		dato += ele.toString();
	}
    //in caso di errore faccio partire un catch
    try {
		FileUtils.writeStringToFile(eleFile, dato);
	} catch (IOException e) {
		e.printStackTrace();
	}
    }
public void caricaFile() {
	File eleFile = new File("memoria/memoria.txt");
	try {
		String fileString = FileUtils.readFileToString(eleFile);
	} catch (IOException e) {
		e.printStackTrace();
	}
};
}
