package view;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTutorial extends JFrame {
	
	private VentanaMenu jugador;
	private JButton botonContinuar;
	private JButton botonPLAY;

	public VentanaTutorial() {
		setTitle("");
		setSize(830, 635);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		JPanel panelTutorial = new JPanel();
		panelTutorial.setLayout(null);
		panelTutorial.setBackground(new Color(230, 230, 250));
		panelTutorial.setBorder(BorderFactory.createTitledBorder(""));
		panelTutorial.setBounds(0, 0, 830, 635);
		add(panelTutorial);
		
		ImageIcon ContinuarIcon = new ImageIcon("media/Botones/TAP TO PLAY.png");
		botonContinuar = new JButton(ContinuarIcon);
		botonContinuar.setBounds(580, 500, 200, 70);
		botonContinuar.setOpaque(false); // Establece el fondo del botón como transparente
		botonContinuar.setContentAreaFilled(false); // Establece el área de contenido del botón como transparente
		botonContinuar.setBorderPainted(false);
		botonContinuar.setActionCommand("CONTINUAR");
		add(botonContinuar);
		
		ImageIcon imagenIcon = new ImageIcon("media/Botones/instrucciones.png");
		JLabel imagenLabel = new JLabel(imagenIcon);
		imagenLabel.setBounds(1, 1, 800, 600);
		panelTutorial.add(imagenLabel);
		
	

		JPanel panelContenedor = new JPanel(new BorderLayout());
		panelContenedor.add(panelTutorial, BorderLayout.CENTER);

		add(panelContenedor);

		setVisible(true);

	}
	public void setBotonContinuarListener(ActionListener listener) {
	    botonContinuar.addActionListener(listener);
	}
	
}