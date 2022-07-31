package libreria.ElementoLetterario;

public class Libro extends ElementoLetter {
 private String genere;
 private String autore;
public Libro(String isbn, String titolo, int annoPubblicazione, int numPagina, String genere, String autore) {
	super(isbn, titolo, annoPubblicazione, numPagina);
	this.genere = genere;
	this.autore = autore;
}
public String getGenere() {
	return genere;
}
public void setGenere(String genere) {
	this.genere = genere;
}
public String getAutore() {
	return autore;
}
public void setAutore(String autore) {
	this.autore = autore;
}
@Override
public String toString() {
	return "Libro [genere=" + genere + ", autore=" + autore + ", toString()=" + super.toString() + "]";
}
 
 
}
