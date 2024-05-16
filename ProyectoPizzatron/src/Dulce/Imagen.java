package Dulce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Imagen extends JPanel {

    // Imágenes de la cinta
    private ImageIcon imagen2; // La segunda imagen
    private ImageIcon imagen3; // La tercera imagen
    private ImageIcon imagen4; // La cuarta imagen
    private ImageIcon imagen5; // La quinta imagen
    private ImageIcon imagen6; // La sexta imagen
    private ImageIcon imagen8; // La octava imagen
    private ImageIcon imagen9; // La novena imagen

    // Posiciones iniciales de las imágenes
    private int x2 = 0;
    private int x3 = -810;
    private int x4 = -1620;
    private int x5 = -2430;
    private int x6 = -3240;
    private int x8 = -4050;
    private int x9 = -4860;

    public Imagen() {
        this.setSize(820, 630); // Se selecciona el tamaño del panel

        // Cargar imágenes
        imagen2 = new ImageIcon(getClass().getResource("/Imagenes/BandaPizza.png"));
        imagen3 = new ImageIcon(getClass().getResource("/Imagenes/BandaPizza.png"));
        imagen4 = new ImageIcon(getClass().getResource("/Imagenes/BandaPizza.png"));
        imagen5 = new ImageIcon(getClass().getResource("/Imagenes/BandaPizza.png"));
        imagen6 = new ImageIcon(getClass().getResource("/Imagenes/BandaPizza.png"));
        imagen8 = new ImageIcon(getClass().getResource("/Imagenes/BandaPizza.png"));
        imagen9 = new ImageIcon(getClass().getResource("/Imagenes/BandaPizza.png"));

        // Configurar temporizadores para mover las imágenes
        configureTimers();

    }

    private void configureTimers() {
        // Temporizador para mover la segunda imagen
    	 Timer timer2 = new Timer(20, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 x2 += 5; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                 if (x2 > getWidth()) { // Si la imagen ha llegado al final del panel
                     x2 = -imagen2.getIconWidth(); // La imagen vuelve al inicio
                 }
               //  detectarColision();
                 repaint();
             }
         });
         timer2.start();

         Timer timer3 = new Timer(20, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 x3 += 5; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                 if (x3 > getWidth()) { // Si la imagen ha llegado al final del panel
                     x3 = -imagen3.getIconWidth(); // La imagen vuelve al inicio
                 }
                 repaint();
             }
         });
         timer3.start();

         Timer timer4 = new Timer(20, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 x4 += 5; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                 if (x4 > getWidth()) { // Si la imagen ha llegado al final del panel
                     x4 = -imagen4.getIconWidth(); // La imagen vuelve al inicio
                 }
                 repaint();
             }
         });
         timer4.start();

         Timer timer5 = new Timer(20, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 x5 += 5; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                 if (x5 > getWidth()) { // Si la imagen ha llegado al final del panel
                     x5 = -imagen5.getIconWidth(); // La imagen vuelve al inicio
                 }
                 repaint();
             }
         });
         timer5.start();

         Timer timer6 = new Timer(20, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 x6 += 5; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                 if (x6 > getWidth()) { // Si la imagen ha llegado al final del panel
                     x6 = -imagen6.getIconWidth(); // La imagen vuelve al inicio
                 }
                 repaint();
             }
         });
         timer6.start();

         Timer timer8 = new Timer(20, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 x8 += 5; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                 if (x8 > getWidth()) { // Si la imagen ha llegado al final del panel
                     x8 = -imagen8.getIconWidth(); // La imagen vuelve al inicio
                 }
                 repaint();
             }
         });
         timer8.start();

         Timer timer9 = new Timer(20, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 x9 += 5; // Cambia esto para ajustar la velocidad de movimiento en el eje x
                 if (x9 > getWidth()) { // Si la imagen ha llegado al final del panel
                     x9 = -imagen9.getIconWidth(); // La imagen vuelve al inicio
                 }
                 repaint();
             }
         });
         timer9.start();
         
    }
   

    // Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paintComponent(Graphics grafico) {
        super.paintComponent(grafico); // Llamar al método paintComponent de la clase base

        // Dibujar las imágenes en el panel
        grafico.drawImage(imagen3.getImage(), x3, 450, 820, 180, null);
        grafico.drawImage(imagen2.getImage(), x2, 450, 820, 180, null);
        grafico.drawImage(imagen3.getImage(), x3, 450, 820, 180, null);
        grafico.drawImage(imagen4.getImage(), x4, 450, 820, 180, null);
        grafico.drawImage(imagen5.getImage(), x5, 450, 820, 180, null);
        grafico.drawImage(imagen6.getImage(), x6, 450, 820, 180, null);
        grafico.drawImage(imagen8.getImage(), x8, 450, 820, 180, null);
        grafico.drawImage(imagen9.getImage(), x9, 450, 820, 180, null);

        setOpaque(false); // Establecer el panel como transparente
    }
}
