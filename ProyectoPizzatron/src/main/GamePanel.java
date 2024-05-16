package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
		
		//screen settings
		final int originalTileSize = 16; //tamano de los pixeles personajes como cosas; 16x16
		final int scale =3;
		
		final int tileSize = originalTileSize * scale; 	//46x46 tile
		final int maxScreenCol = 17;
		final int maxScreenRow = 13;
		final int screenWidth = tileSize * maxScreenCol; //816
		final int screenHeight = tileSize * maxScreenRow; //624 
		
		Sound sound = new Sound();
		Thread gameThread;
		
		 public GamePanel() {
		        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		        this.setBackground(Color.gray); // Establece el fondo gris
		        this.setDoubleBuffered(true);
		        setOpaque(false);
			
			addMouseListener(new MouseEventListener());
			
			
		}
		
		public void setupGame() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
			playMusic(0);
		}
		
		public void startGameThread() {
			
			gameThread = new Thread(this);
			gameThread.start();
			
			
		}

		@Override
		public void run() {
			
			while(gameThread != null) {
				
//				System.out.println("The game loop is running");
				//1 update: update information such as character positions:vamos a cargar las posiciones del personaje
				update();
				//draw:draw the screen with the updated information:se va a dibujar la pantalla para cargar la informacion
				repaint();
				
				
			}
			
			
		}
		public void update () {
			
		}
		public void paintComponent(Graphics g){
			//super.paintComponent(g);
			
			///Graphics2D g2 = (Graphics2D)g;
			
			//g2.setColor(Color.white);
			//g2.fillRect(100, 100, tileSize, tileSize);
			//g2.dispose();
			
			
		}
		public void playMusic(int i) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
			
			 System.out.println("Intentando reproducir música...");
		        try {
		            sound.setFile(i);
		            sound.play();
		            sound.loop();
		            System.out.println("Música reproducida correctamente.");
		        } catch (Exception e) {
		            // Imprimir el seguimiento de la pila
		            e.printStackTrace();
		            System.err.println("Error al reproducir música.");
		        }
		    }
			
		
		public void stopMusic() {
			sound.stop();
		}
		public void playSE(int i) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
			
			sound.setFile(i);
			sound.play();
		}

}
