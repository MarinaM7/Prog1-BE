import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tipo di Elemento Multimediale da inserire");
		System.out.println("1. Immagine");
		System.out.println("2. Audio");
		System.out.println("3. Video");
		int tipo = input.nextInt();
		
		switch(tipo){
		case 1:
			System.out.println("Inserisci titolo:");
			String img = input.next();
			System.out.println("Inserisci luminosità per la visualizzazione (1-10):");
			int lum = input.nextInt();
			Immagine img1 = new Immagine (img, lum);
			img1.show();
			break;
		case 2:
			System.out.println("Inserisci titolo:");
			String audio = input.next();
			System.out.println("Inserisci durata dell' audio:");
			int dur = input.nextInt();
			System.out.println("Inserisci il livello del volume (1-10):");
			int volume = input.nextInt();
			RegAudio audio1 = new RegAudio(audio, dur, volume);
			audio1.play();
			break;
		case 3:
			System.out.println("Inserisci titolo:");
			String video = input.next();
			System.out.println("Inserisci durata del video:");
			int durv = input.nextInt();
			System.out.println("Inserisci il livello del volume (1-10):");
			int volumev = input.nextInt();
			System.out.println("Inserisci luminosità per la visualizzazione (1-10):");
			int lumv = input.nextInt();
			Video video1 = new Video(video, durv, volumev, lumv);
			video1.play();
			break;
		default:
			System.out.println("Scrivi correttamente!");
			break;
		}
		input.close();

// non ho avuto tempo di screare degli scanner per le azioni da eseguire sul volume e sulla luminosità
		
//		System.out.println();
//		System.out.println("-----------------Prova dei metodi-----------------");
//		
//		Video vid1 = new Video("Video", 4, 7, 4);
//		vid1.play();
//		vid1.alzaVolume();
//		vid1.abbassaVolume();
//		vid1.aumentaLuminosita();
//		vid1.play();
		
	}

}
