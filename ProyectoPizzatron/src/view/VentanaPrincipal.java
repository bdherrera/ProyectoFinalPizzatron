package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

	
	private VentanaRegistroJugador jugador;
	private JButton botonIrAMenu;

	public VentanaPrincipal() {
        setTitle("Ventana Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        botonIrAMenu = new JButton("Ir al Menú");
        botonIrAMenu.setBounds(300, 250, 200, 50);
        botonIrAMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de la ventana del menú y mostrarla
            	jugador =  new VentanaRegistroJugador();
               
                jugador.setVisible(true);
                
                dispose();
                
            }
        });
        add(botonIrAMenu);

        setLayout(null);
        setVisible(true);
    }



	public VentanaRegistroJugador getJugador() {
		return jugador;
	}



	public void setJugador(VentanaRegistroJugador jugador) {
		this.jugador = jugador;
	}



	public JButton getBotonIrAMenu() {
		return botonIrAMenu;
	}

	public void setBotonIrAMenu(JButton botonIrAMenu) {
		this.botonIrAMenu = botonIrAMenu;
	}

	
}
