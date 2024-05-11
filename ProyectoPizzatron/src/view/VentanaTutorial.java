package view;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTutorial extends JFrame {
	
	private VentanaMenu jugador;
	private JButton botonBack;

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

		JPanel panelContenedor = new JPanel(new BorderLayout());
		panelContenedor.add(panelTutorial, BorderLayout.CENTER);

		add(panelContenedor);

		setVisible(true);

	}
}