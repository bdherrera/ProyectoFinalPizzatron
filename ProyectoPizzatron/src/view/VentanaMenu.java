package view;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame {

	private VentanaPLAY jugador;
	private VentanaProfiles jugador2;
	private VentanaCharacter jugador3;
	private VentanaTutorial jugador4;
	private JButton botonPLAY;
	private JButton botonNivelNormal;
	private JButton botonNivelDulce;
	private JButton botonTutorial;
	private JButton botonSalir;
	private JButton botonProfiles;
	private JButton botonCharacter;
	private VentanaTutorial tutorial;
	private ImageIcon tutorialIcon;
	private ImageIcon characterIcon;

	public VentanaMenu() {
		setTitle("");
		setSize(830, 635);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(null); // Usar null layout para control manual
		panelMenu.setBackground(new Color(230, 230, 250));
		panelMenu.setBorder(BorderFactory.createTitledBorder("Menu"));
		panelMenu.setBounds(0, 0, 830, 635); // Tamaño del panel ajustado al tamaño de la ventana
		add(panelMenu);

		ImageIcon imagenIcon = new ImageIcon("media/Botones/Main Menu.png");
		JLabel imagenLabel = new JLabel(imagenIcon);
		imagenLabel.setBounds(1, 1, 800, 600); // Tamaño de la imagen ajustado al tamaño de la ventana
		panelMenu.add(imagenLabel);

		ImageIcon playIcon = new ImageIcon("media/Botones/Play Button.png");
		botonPLAY = new JButton(playIcon);
		botonPLAY.setBounds(60, 280, 200, 50); // x, y, width, height
		botonPLAY.setAlignmentX(JButton.LEFT_ALIGNMENT);
		botonPLAY.setActionCommand("PLAY");
		botonPLAY.repaint();
		panelMenu.add(botonPLAY);
		panelMenu.add(Box.createVerticalGlue());
		botonPLAY.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador = new VentanaPLAY();
				jugador.setVisible(true);
				dispose();
			}
		});

		ImageIcon profilesIcon = new ImageIcon("media/Botones/profiles.png");
		botonProfiles = new JButton(profilesIcon);
		botonProfiles.setBounds(60, 320, 200, 50);
		botonProfiles.setAlignmentX(JButton.LEFT_ALIGNMENT);
		botonProfiles.setActionCommand("PROFILES");
		botonProfiles.repaint();
		panelMenu.add(botonProfiles);
		panelMenu.add(Box.createVerticalGlue());
		botonProfiles.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador2 = new VentanaProfiles();
				jugador2.setVisible(true);
				dispose();
			}
		});

		ImageIcon tutorialIcon = new ImageIcon("media/Botones/how to play.png");
		botonTutorial = new JButton(tutorialIcon);
		botonTutorial.setBounds(60, 370, 200, 50);
		botonTutorial.setAlignmentX(JButton.LEFT_ALIGNMENT);
		botonTutorial.setActionCommand("TUTORIAL");
		botonTutorial.repaint();
		panelMenu.add(botonTutorial);
		panelMenu.add(Box.createVerticalGlue());
		botonTutorial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador4 = new VentanaTutorial();
				jugador4.setVisible(true);
				dispose();
			}
		});

		ImageIcon characterIcon = new ImageIcon("media/Botones/character.png");
		botonCharacter = new JButton(characterIcon);
		botonCharacter.setBounds(60, 410, 200, 50);
		botonCharacter.setAlignmentX(JButton.LEFT_ALIGNMENT);
		botonCharacter.setActionCommand("CHARACTER");
		botonCharacter.repaint();
		panelMenu.add(botonCharacter);
		panelMenu.add(Box.createVerticalGlue());
		botonCharacter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador3 = new VentanaCharacter();
				jugador3.setVisible(true);
				dispose();
			}
		});

		/*
		 * botonNivelNormal = new JButton("Nivel Normal");
		 * botonNivelNormal.setAlignmentX(JButton.LEFT_ALIGNMENT);
		 * botonNivelNormal.setActionCommand("NORMAL"); panelMenu.add(botonNivelNormal);
		 * panelMenu.add(Box.createVerticalGlue());
		 * 
		 * botonNivelDulce = new JButton("Nivel Dulce");
		 * botonNivelDulce.setAlignmentX(JButton.LEFT_ALIGNMENT);
		 * botonNivelDulce.setActionCommand("DULCE"); panelMenu.add(botonNivelDulce);
		 * panelMenu.add(Box.createVerticalGlue());
		 * 
		 * 
		 * 
		 * botonSalir = new JButton("Salir");
		 * botonSalir.setAlignmentX(JButton.LEFT_ALIGNMENT);
		 * botonSalir.setActionCommand("SALIR"); panelMenu.add(botonSalir);
		 * panelMenu.add(Box.createVerticalGlue());
		 */

		JPanel panelContenedor = new JPanel(new BorderLayout());
		panelContenedor.add(panelMenu, BorderLayout.CENTER);

		add(panelContenedor);

		setVisible(true);

		panelMenu.validate();
		panelMenu.repaint();

	}
}
