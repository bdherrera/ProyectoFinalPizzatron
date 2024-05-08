package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaNivelNormal extends JFrame {
	
	private VentanaPLAY jugador;
	private JButton botonBack;

	public VentanaNivelNormal() {
		setTitle("");
		setSize(830, 635);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);

		JPanel panelProfiles = new JPanel();
		panelProfiles.setLayout(null);
		panelProfiles.setBackground(new Color(230, 230, 250));
		panelProfiles.setBorder(BorderFactory.createTitledBorder(""));
		panelProfiles.setBounds(0, 0, 830, 635);
		add(panelProfiles);
		
		botonBack = new JButton("Back");
		botonBack.setBounds(620, 530, 120, 20);
		botonBack.setActionCommand("BACK");
		add(botonBack);
		botonBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jugador = new VentanaPLAY();
				jugador.setVisible(true);
				dispose();
			}
		});


		JPanel panelContenedor = new JPanel(new BorderLayout());
		panelContenedor.add(panelProfiles, BorderLayout.CENTER);

		add(panelContenedor);

		setVisible(true);

	}
}