package salado;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoPizzeria extends JPanel{
	
	private ImageIcon imagen1; // La primera imagen
	private ImageIcon imagen11; // La undécima imagen
	
	
	private int x1 = 0;
	private int x11 = 0;
	
	
	 public FondoPizzeria() {
	        this.setSize(820, 630); // Se selecciona el tamaño del panel

	        // Cargar imágenes
	        imagen1 = new ImageIcon(getClass().getResource("/Imagenes/fondococina.png"));
	        imagen11 = new ImageIcon(getClass().getResource("/Imagenes/unborde.png"));
	       
	        
	        }
	 public void paintComponent(Graphics grafico) {
	        super.paintComponent(grafico); // Llamar al método paintComponent de la clase base

	        // Dibujar las imágenes en el panel
	       grafico.drawImage(imagen1.getImage(), x1, 0, 820, 640, null);
	       grafico.drawImage(imagen11.getImage(), x11,370, 820, 400, null);
	       

	       
	        setOpaque(false); // Establecer el panel como transparente
	    }
	}


