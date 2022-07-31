package libreria.ElementoLetterario;

public abstract class ElementoLetter {
private String isbn;
private String titolo;
private int annoPubblicazione;
private int numPagina;
//creo un costruttore in automatico.
public ElementoLetter(String isbn, String titolo, int annoPubblicazione, int numPagina) {
	this.isbn = isbn;
	this.titolo = titolo;
	this.annoPubblicazione = annoPubblicazione;
	this.numPagina = numPagina;
}

public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getTitolo() {
	return titolo;
}
public void setTitolo(String titolo) {
	this.titolo = titolo;
}
public int getAnnoPubblicazione() {
	return annoPubblicazione;
}
public void setAnnoPubblicazione(int annoPubblicazione) {
	this.annoPubblicazione = annoPubblicazione;
}
public int getNumPagina() {
	return numPagina;
}
public void setNumPagina(int numPagina) {
	this.numPagina = numPagina;
}
//metodo per leggere in console
@Override
public String toString() {
	return "ElementoLetter [isbn=" + isbn + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
			+ ", numPagina=" + numPagina + "]";
}

}
