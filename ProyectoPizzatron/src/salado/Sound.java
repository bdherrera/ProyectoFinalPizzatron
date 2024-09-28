package salado;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.IOException;
import java.net.URL;


public class Sound {
    
	Clip clip;
	URL soundURL[] = new URL[30];
	
	public Sound() {
		soundURL[0] = getClass().getResource("/sound/SonidoPizza.wav");

	}
	public void setFile(int i) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
	    try {
	        AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
	        clip = AudioSystem.getClip();
	        clip.open(ais);
	    } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
	        // Imprimir el seguimiento de la pila
	        e.printStackTrace();
	        // Lanzar una excepción para notificar que no se pudo cargar el archivo de sonido
	        throw e;
	    }
	

		
	}
	public void play() {
		clip.start();
		
	}
	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void stop() {
		clip.stop();
		
	}
}

