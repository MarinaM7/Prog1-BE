
public class Immagine extends ElementoMultim implements Luminosita {

	private int luminosita;
	private String aster = "*";
	
	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.setLuminosita(luminosita);
	}
	
	// stampa il titolo e * per il numero di luminosità
	
	public void show() {
		System.out.println();
		System.out.println("Immagine:" + this.titolo + " [luminosità:" + this.aster.repeat(this.luminosita) + "]");
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		if(luminosita<0 || luminosita>10) {
			System.out.println("Errore! luminosità deve essere compresa tra 1 e 10");
		}else {
			this.luminosita = luminosita;
		}
		
	}

	@Override
	public void aumentaLuminosita() {
		if(this.luminosita == 10) {
			System.out.println("Errore!! La luminosità di " + this.titolo + " è al massimo.");
		}else {
			this.luminosita++;
			System.out.println("Luminosità " + this.titolo + " è " + this.aster.repeat(this.luminosita));
		}
	}

	@Override
	public void diminuisciLuminosita() {
		
		if(this.luminosita == 1) {
			System.out.println("Errore!! La luminosità di " + this.titolo + " è al minimo.");
		}else {
			this.luminosita--;
			System.out.println("Luminosità " + this.titolo + " è " + this.aster.repeat(this.luminosita));
		}
	}
	
}
