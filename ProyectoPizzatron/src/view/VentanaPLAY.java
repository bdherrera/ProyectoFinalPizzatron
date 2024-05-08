package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPLAY extends JFrame {
	
	private VentanaMenu jugador;
	private JButton botonBack;
	private JButton botonNivelDulce;
	private JButton botonNivelNormal;
	private VentanaNivelDulce dulce;
	private VentanaNivelNormal normal;
	
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
		botonBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador = new VentanaMenu();
				jugador.setVisible(true);
				dispose();
			}
		});
		
		botonNivelDulce = new JButton("Nivel Dulce");
		botonNivelDulce.setBounds(325, 230, 200, 50);
		botonNivelDulce.setActionCommand("NIVEL DULCE");
		add(botonNivelDulce);
		botonNivelDulce.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dulce = new VentanaNivelDulce();
				dulce.setVisible(true);
				dispose();
			}
		});
		botonNivelNormal = new JButton("Nivel Normal");
		botonNivelNormal.setBounds(325, 300, 200, 50);
		botonNivelNormal.setActionCommand("NIVEL NORMAL");
		add(botonNivelNormal);
		botonNivelNormal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				normal = new VentanaNivelNormal();
				normal.setVisible(true);
				dispose();
			}
		});
		
		


		JPanel panelContenedor = new JPanel(new BorderLayout());
		panelContenedor.add(panelPLAY, BorderLayout.CENTER);

		add(panelContenedor);

		setVisible(true);

	}
}
