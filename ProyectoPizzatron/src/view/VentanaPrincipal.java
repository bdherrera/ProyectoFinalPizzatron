package view;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel; // Necesario para usar JLabel
import java.awt.Dimension; // Necesario para usar Dimension

public class VentanaPrincipal extends JFrame {

	private Panel pPanel;

	public VentanaPrincipal() {

		setTitle("");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		pPanel = new Panel();
		pPanel.setBounds(10, 10, 770, 545);
		add(pPanel);

		setLocationRelativeTo(null);
		setVisible(true);

	}

	public Panel getpPanel() {
		return pPanel;
	}

	public void setpPanel(Panel pPanel) {
		this.pPanel = pPanel;
	}

}
