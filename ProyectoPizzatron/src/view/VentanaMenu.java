package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.PerfilJugador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame {

	private VentanaPLAY jugador;
	private VentanaProfiles jugador2;
	private VentanaRegistroJugador jugador3;
	private VentanaTutorial jugador4;
	private JButton botonPLAY;
	private JButton botonTutorial;
	private JButton botonProfiles;
	private JButton botonCharacter;
	private PerfilJugador perfilJugador;

	public VentanaMenu(PerfilJugador perfilJugador) {
		this.perfilJugador = perfilJugador;
		setTitle("");
		setSize(830, 635);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(null);
		panelMenu.setBackground(new Color(230, 230, 250));
		panelMenu.setBorder(BorderFactory.createTitledBorder("Menu"));
		panelMenu.setBounds(0, 0, 830, 635);
		add(panelMenu);

	


		ImageIcon playIcon = new ImageIcon("media/Botones/Play Button.png");
		botonPLAY = new JButton(playIcon);
		botonPLAY.setBounds(70, 290, 180, 35);
		botonPLAY.setOpaque(false); // Establece el fondo del botón como transparente
		botonPLAY.setContentAreaFilled(false); // Establece el área de contenido del botón como transparente
		botonPLAY.setBorderPainted(false);
		botonPLAY.setActionCommand("PLAY");
		panelMenu.add(botonPLAY);
		botonPLAY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador = new VentanaPLAY();
				jugador.setVisible(true);

			}
		});

		ImageIcon profilesIcon = new ImageIcon("media/Botones/profiles.png");
		botonProfiles = new JButton(profilesIcon);
		botonProfiles.setBounds(70, 330, 180, 35);
		botonProfiles.setOpaque(false); // Establece el fondo del botón como transparente
		botonProfiles.setContentAreaFilled(false); // Establece el área de contenido del botón como transparente
		botonProfiles.setBorderPainted(false);
		botonProfiles.setActionCommand("PROFILES");
		panelMenu.add(botonProfiles);
		botonProfiles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador2 = new VentanaProfiles();
				jugador2.setVisible(true);

			}
		});

		ImageIcon tutorialIcon = new ImageIcon("media/Botones/how to play.png");
		botonTutorial = new JButton(tutorialIcon);
		botonTutorial.setBounds(70, 370, 180, 35); 
		botonTutorial.setOpaque(false); // Establece el fondo del botón como transparente
		botonTutorial.setContentAreaFilled(false); // Establece el área de contenido del botón como transparente
		botonTutorial.setBorderPainted(false);// Ajusta las coordenadas según sea necesario
		botonTutorial.setActionCommand("TUTORIAL");
		panelMenu.add(botonTutorial);
		botonTutorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador4 = new VentanaTutorial();
				jugador4.setVisible(true);

			}
		});

		ImageIcon characterIcon = new ImageIcon("media/Botones/character.png");
		botonCharacter = new JButton(characterIcon);
		botonCharacter.setBounds(70, 410, 180, 35);
		botonCharacter.setOpaque(false); // Establece el fondo del botón como transparente
		botonCharacter.setContentAreaFilled(false); // Establece el área de contenido del botón como transparente
		botonCharacter.setBorderPainted(false);
		botonCharacter.setActionCommand("CHARACTER");
		panelMenu.add(botonCharacter);
		botonCharacter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador3 = new VentanaRegistroJugador();
				jugador3.setVisible(true);

			}
		});
		
		ImageIcon imagenIcon = new ImageIcon("media/Botones/Main Menu.png");
		JLabel imagenLabel = new JLabel(imagenIcon);
		imagenLabel.setBounds(1, 1, 800, 600); 
		panelMenu.add(imagenLabel);
		
		JPanel panelContenedor = new JPanel(new BorderLayout());
		panelContenedor.add(panelMenu, BorderLayout.CENTER);

		add(panelContenedor);

		setVisible(true);

		panelMenu.validate();
		panelMenu.repaint();

	}
}
