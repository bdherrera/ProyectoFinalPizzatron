package view;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import salado.Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class VentanaPLAY extends JFrame {
	
	private VentanaMenu jugador;
	private JButton botonBack;
	private JButton botonNivelDulce;
	private JButton botonNivelNormal;
	private VentanaNivelDulce dulce;
	
	
	public VentanaPLAY() {
		setTitle("");
		setSize(830, 635);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		JPanel panelPLAY = new JPanel();
		panelPLAY.setLayout(null);
		panelPLAY.setBackground(new Color(230, 230, 250));
		panelPLAY.setBorder(BorderFactory.createTitledBorder(""));
		panelPLAY.setBounds(0, 0, 830, 635);
		add(panelPLAY);
		
		botonBack = new JButton("Back");
		botonBack.setBounds(620, 530, 120, 20);
		botonBack.setActionCommand("BACK");
		add(botonBack);
		
		ImageIcon dulceIcon = new ImageIcon("media/Botones/CANDY M-01.png");
		botonNivelDulce = new JButton(dulceIcon);
		botonNivelDulce.setBounds(70, 380, 180, 35);
		botonNivelDulce.setOpaque(false); // Establece el fondo del botón como transparente
		botonNivelDulce.setContentAreaFilled(false); // Establece el área de contenido del botón como transparente
		botonNivelDulce.setBorderPainted(false);
		botonNivelDulce.setActionCommand("NIVEL DULCE");
		add(botonNivelDulce);
		
		ImageIcon normalIcon = new ImageIcon("media/Botones/PIZZATRN.png");
		botonNivelNormal = new JButton(normalIcon);
		botonNivelNormal.setBounds(70, 310, 180, 35);
		botonNivelNormal.setOpaque(false); // Establece el fondo del botón como transparente
		botonNivelNormal.setContentAreaFilled(false); // Establece el área de contenido del botón como transparente
		botonNivelNormal.setBorderPainted(false);
		botonNivelNormal.setActionCommand("NIVEL NORMAL");
		botonNivelNormal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llamar al método main de la clase Main
                try {
                    Main.main(null);
                } catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex) {
                    ex.printStackTrace(); // Manejo básico de excepciones
                }
            }
        });
		add(botonNivelNormal);
		
		
		ImageIcon imagenIcon = new ImageIcon("media/Botones/Main Menu.png");
		JLabel imagenLabel = new JLabel(imagenIcon);
		imagenLabel.setBounds(1, 1, 800, 600);
		panelPLAY.add(imagenLabel);


		JPanel panelContenedor = new JPanel(new BorderLayout());
		panelContenedor.add(panelPLAY, BorderLayout.CENTER);

		add(panelContenedor);

		setVisible(true);

	}
	public void setBotonBackListener(ActionListener listener) {
	    botonBack.addActionListener(listener);
	}

	public void setBotonNivelDulceListener(ActionListener listener) {
	    botonNivelDulce.addActionListener(listener);
	}

	public void setBotonNivelNormalListener(ActionListener listener) {
	    botonNivelNormal.addActionListener(listener);
	}

}
