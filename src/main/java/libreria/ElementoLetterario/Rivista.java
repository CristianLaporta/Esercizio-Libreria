package libreria.ElementoLetterario;

public class Rivista extends ElementoLetter {
private Periodicita periodicita;

public Rivista(String isbn, String titolo, int annoPubblicazione, int numPagina, Periodicita periodicita) {
	super(isbn, titolo, annoPubblicazione, numPagina);
	this.periodicita = periodicita;
}

public Periodicita getPeriodicita() {
	return periodicita;
}

public void setPeriodicita(Periodicita periodicita) {
	this.periodicita = periodicita;
}

@Override
public String toString() {
	return "Rivista [periodicita=" + periodicita + ", toString()=" + super.toString() + "]";
}

}
