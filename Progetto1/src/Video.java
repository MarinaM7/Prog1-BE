
public class Video extends ElementoRiproducibile implements Luminosita {
	
	private int luminosita;
	private String escl = "!";
	private String aster = "*";
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		this.luminosita = luminosita;
	}

	@Override
	public void play() {
		System.out.println();
		for(int i = 0; i < this.getDurata(); i++) {
			System.out.println((i + 1) + " min. " + this.titolo + " [volume:" + this.escl.repeat(this.getVolume()) + " e luminosità:" + this.aster.repeat(this.luminosita) + "]");
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
	
	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}
	
}
