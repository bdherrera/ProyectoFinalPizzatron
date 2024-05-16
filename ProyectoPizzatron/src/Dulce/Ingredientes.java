package Dulce;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Ingredientes  extends JPanel{
	
	private ImageIcon imagen1; // La primera imagen
	private ImageIcon imagen2;
	private ImageIcon imagen11; // La undécima imagen
	private ImageIcon imagen3; // La primera imagen
	private ImageIcon imagen13; // La undécima imagen
	
	private int x1 = 695;
	private int x2 = 0;
	private int x11 = 0;
	private int x3 = 0;
	private int x13 = 0;
	
	
	 public Ingredientes() {
	        this.setSize(820, 630); // Se selecciona el tamaño del panel

	        // Cargar imágenes
	        imagen11 = new ImageIcon(getClass().getResource("/Imagenes/Estante.png"));
	        imagen1 = new ImageIcon(getClass().getResource("/Imagenes/tuberia.png"));
	        imagen2 = new ImageIcon(getClass().getResource("/Imagenes/BARRA.png"));
	  ;
	        imagen2 = new ImageIcon(getClass().getResource("/Imagenes/AgarradorIzquierdoFront.png"));
	        imagen13 = new ImageIcon(getClass().getResource("/Imagenes/AgarradorIzquierdo Back.png"));
	        
	        
	        }
	 public void paintComponent(Graphics grafico) {
	        super.paintComponent(grafico); // Llamar al método paintComponent de la clase base

	        // Dibujar las imágenes en el panel
	       
	       grafico.drawImage(imagen2.getImage(), x2,  372, 820, 90, null);
	       grafico.drawImage(imagen1.getImage(), x1,  335, 130, 300, null);
	       grafico.drawImage(imagen11.getImage(), x11, 200, 120, 440, null);
	       grafico.drawImage(imagen2.getImage(), x1, 0, 820, 640, null);
	       grafico.drawImage(imagen13.getImage(), x11, 460, 820, 170, null);
	       
	        setOpaque(false); // Establecer el panel como transparente
	    }
	}






