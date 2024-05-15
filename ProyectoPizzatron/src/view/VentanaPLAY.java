package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		
		
		botonNivelDulce = new JButton("Nivel Dulce");
		botonNivelDulce.setBounds(70, 390, 180, 35);
		botonNivelDulce.setActionCommand("NIVEL DULCE");
		add(botonNivelDulce);
		
		
		botonNivelNormal = new JButton("Nivel Normal");
		botonNivelNormal.setBounds(70, 310, 180, 35);
		botonNivelNormal.setActionCommand("NIVEL NORMAL");
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
