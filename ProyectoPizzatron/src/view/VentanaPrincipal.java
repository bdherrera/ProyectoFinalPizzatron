package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {

	private JButton botonIrANombre;
	private JLabel imagenLabel;

	public VentanaPrincipal() {
		setTitle("Ventana Principal");
		setSize(830, 635);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		// Configurar la imagen

		// Modificación del botón y su ActionListener
		ImageIcon tapToPlayIcon = new ImageIcon("media/Botones/TAP TO PLAY.png");
		botonIrANombre = new JButton(tapToPlayIcon);
		botonIrANombre.setBounds(550, 500, 200, 50);
		botonIrANombre.setOpaque(false);
		botonIrANombre.setContentAreaFilled(false);
		botonIrANombre.setBorderPainted(false);
		botonIrANombre.setActionCommand("CONTINUAR");

		// No necesitamos agregar ActionListener aquí

		add(botonIrANombre);

		ImageIcon imagenIcon = new ImageIcon("media/imagenes/Loading Screen-Recovered.png");
		imagenLabel = new JLabel(imagenIcon);
		imagenLabel.setBounds(1, 1, 800, 600);
		add(imagenLabel);

		setLayout(null);
	}

	public JButton getBotonIrANombre() {
		return botonIrANombre;
	}

	public void setBotonIrANombre(JButton botonIrANombre) {
		this.botonIrANombre = botonIrANombre;
	}

	public JLabel getImagenLabel() {
		return imagenLabel;
	}

	public void setImagenLabel(JLabel imagenLabel) {
		this.imagenLabel = imagenLabel;
	}
}
