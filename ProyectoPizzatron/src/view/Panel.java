package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel {

	private JButton botonPLAY;
	private JButton botonNivelNormal;
	private JButton botonNivelDulce;
	private JButton botonTutorial;
	private JButton botonSalir;
	private JLabel instrucciones;

	public Panel() {

		setLayout(null);
		setBackground(new Color(230, 230, 250));
		setBorder(new TitledBorder(""));

		botonPLAY = new JButton("PLAY");
		botonPLAY.setBounds(70, 450, 170, 30);
		botonPLAY.setActionCommand("Play");
		add(botonPLAY);

		setLayout(null);
		setBackground(new Color(230, 230, 250));
		setBorder(new TitledBorder(""));

		botonNivelNormal = new JButton("Nivel Normal");
		botonNivelNormal.setBounds(40, 100, 120, 20);
		botonNivelNormal.setActionCommand("NORMAL");
		add(botonNivelNormal);

		botonNivelDulce = new JButton("Nivel Dulce");
		botonNivelDulce.setBounds(40, 200, 120, 20);
		botonNivelDulce.setActionCommand("DULCE");
		add(botonNivelDulce);

		botonTutorial = new JButton("Tutorial");
		botonTutorial.setBounds(40, 300, 120, 20);
		botonTutorial.setActionCommand("TUTORIAL");
		add(botonTutorial);

		botonSalir = new JButton("Salir");
		botonSalir.setBounds(40, 400, 120, 20);
		botonSalir.setActionCommand("SALIR");
		add(botonSalir);

		setLayout(null);
		setBackground(new Color(230, 230, 250));
		setBorder(new TitledBorder(""));

		instrucciones = new JLabel("*Deberas ver una señal en la pizza en la que está estcrita la orden del"
				+ "pingüino que compra la pizza, y debes hacer el tipo de pizza" + "que se pide."
				+ "*Si se comete un error al hacer la pizza, esta no será"
				+ "vendida, pero tendras otra oportunidad para rehacerla."
				+ "*Cuando se hacen 40 pizzas (o si se cometen 5 errores); el "
				+ "juego se termina, y se reciben las monedas."
				+ "*La máxima cantidad sin comter ningún error, es 1085 monedas.");
		instrucciones.setBounds(40, 10, 900, 150);
		add(instrucciones);
	}

	public JLabel getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(JLabel instrucciones) {
		this.instrucciones = instrucciones;
	}

	public JButton getBotonNivelNormal() {
		return botonNivelNormal;
	}

	public void setBotonNivelNormal(JButton botonNivelNormal) {
		this.botonNivelNormal = botonNivelNormal;
	}

	public JButton getBotonNivelDulce() {
		return botonNivelDulce;
	}

	public void setBotonNivelDulce(JButton botonNivelDulce) {
		this.botonNivelDulce = botonNivelDulce;
	}

	public JButton getBotonTutorial() {
		return botonTutorial;
	}

	public void setBotonTutorial(JButton botonTutorial) {
		this.botonTutorial = botonTutorial;
	}

	public JButton getBotonSalir() {
		return botonSalir;
	}

	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;

	}

	public JButton getBotonPLAY() {
		return botonPLAY;
	}

	public void setBotonPLAY(JButton botonPLAY) {
		this.botonPLAY = botonPLAY;
	}

}
