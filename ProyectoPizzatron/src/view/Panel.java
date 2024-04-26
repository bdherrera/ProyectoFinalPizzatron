package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel {

	private JButton botonPLAY;

	public Panel() {
		setLayout(null);
		setBackground(new Color(230, 230, 250));
		setBorder(new TitledBorder(""));

		botonPLAY = new JButton("PLAY");
		botonPLAY.setBounds(70, 450, 170, 30);
		botonPLAY.setActionCommand("Play");
		add(botonPLAY);
	}

	public JButton getBotonPLAY() {
		return botonPLAY;
	}

	public void setBotonPLAY(JButton botonPLAY) {
		this.botonPLAY = botonPLAY;
	}

}
