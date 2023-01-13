
public abstract class ElementoRiproducibile extends ElementoMultim implements Volume {

	private String escl = "!";
	private int durata;
	private int volume;
	
	public ElementoRiproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.setDurata(durata);
		this.setVolume(volume);
	}
	
	abstract public void play();

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	} 
	
	public void alzaVolume() {
		if(this.getVolume() == 10) {
			System.out.println("Errore!! Il volume di " + this.titolo + " è al massimo.");
		}else {
			this.setVolume(this.getVolume() + 1);
			System.out.println("Volume " + this.titolo + " è " + this.escl.repeat(this.getVolume()));
		}
	}

	
	public void abbassaVolume() {

		if(this.getVolume() == 1) {
			System.out.println("Errore!! Il volume di " + this.titolo + " è al minimo.");
		}else {
			this.setVolume(this.getVolume() - 1);
			System.out.println("Volume " + this.titolo + " è " + this.escl.repeat(this.getVolume()));
		}
	}
}
