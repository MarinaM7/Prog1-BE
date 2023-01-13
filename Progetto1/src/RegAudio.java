
public class RegAudio extends ElementoRiproducibile implements Volume {

	private String escl = "!";
	
	public RegAudio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);
	}

	@Override
	public void play() {
		System.out.println();
		for(int i = 0; i < this.getDurata(); i++) {
			System.out.println((i + 1) + " min. " + this.titolo + " [volume:" + this.escl.repeat(this.getVolume()) + "]");
		}
	}
	
}
