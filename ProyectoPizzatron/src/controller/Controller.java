package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import model.PerfilJugador;
import view.VentanaMenu;
import view.VentanaNombre;
import view.VentanaPLAY;
import view.VentanaPrincipal;
import view.VentanaProfiles;
import view.VentanaTutorial;

import view.VentanaSkins;
import view.VentanaNivelNormal;
import view.VentanaNivelDulce;

public class Controller {
	private VentanaPrincipal ventanaPrincipal;
	private VentanaNombre ventanaNombre;
	private VentanaMenu ventanaMenu;
	private PerfilJugador perfilJugador;
	private VentanaPLAY ventanaPlay;
	private VentanaProfiles ventanaProfiles;
	private VentanaTutorial ventanaTutorial;
	private VentanaSkins ventanaSkins;
	private VentanaNivelDulce ventanaNivelDulce;
	private VentanaNivelNormal ventanaNivelNormal;

	public Controller() {
		// Crear la ventana principal y mostrarla primero
		ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.setVisible(true);

		// Agregar un ActionListener al botón de la ventana principal para mostrar la
		// ventana de nombre
		ventanaPrincipal.getBotonIrANombre().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cerrar la ventana principal y abrir la ventana de nombre
				ventanaPrincipal.dispose();
				mostrarVentanaNombre();
			}
		});
	}

	private void mostrarVentanaNombre() {
		if (ventanaNombre == null) {
			ventanaNombre = new VentanaNombre();
			// Agregar el ActionListener al botón de la ventana de nombre
			ventanaNombre.getBotonAceptar().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Almacenar el nombre ingresado en el perfil del jugador
					String nombreJugador = ventanaNombre.getNombreIngresado();
					perfilJugador = new PerfilJugador(nombreJugador);

					// Cerrar la ventana de nombre y abrir la ventana del menú
					ventanaNombre.dispose();
					mostrarVentanaMenu();
				}
			});
		}
		ventanaNombre.setVisible(true);
	}

	// Método para mostrar la ventana del menú
	private void mostrarVentanaMenu() {
		if (ventanaMenu == null) {
			ventanaMenu = new VentanaMenu(perfilJugador);
			// Configurar los ActionListeners de los botones
			ventanaMenu.setBotonPLAYListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaPLAY();
				}
			});
			ventanaMenu.setBotonTutorialListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaTutorial();
				}
			});
			ventanaMenu.setBotonProfilesListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaProfiles();
				}
			});
			ventanaMenu.setBotonCharacterListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					mostrarVentanaSkins();
				}
			});

		}
		ventanaMenu.setVisible(true);
	}

	private void mostrarVentanaPLAY() {
		ventanaMenu.dispose(); // Cerrar ventana anterior
		ventanaPlay = new VentanaPLAY();
		ventanaPlay.setBotonBackListener(e -> {
			ventanaPlay.dispose(); // Cerrar ventana PLAY
			mostrarVentanaMenu(); // Mostrar la ventana del menú nuevamente
		});
		ventanaPlay.setVisible(true);

		ventanaPlay.setBotonNivelDulceListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaPlay.setVisible(false);
				mostrarVentanaNivelDulce();
				ventanaNivelDulce.setVisible(true);
			}
		});
		ventanaPlay.setBotonNivelNormalListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventanaPlay.setVisible(false); // Ocultar la ventana PLAY en lugar de cerrarla
				mostrarVentanaNivelNormal(); // Mostrar la ventana del menú nuevamente
				ventanaNivelNormal.setVisible(true);
			}
		});
	}

	private void mostrarVentanaTutorial() {
		ventanaMenu.dispose(); // Cerrar ventana anterior
		ventanaTutorial = new VentanaTutorial();
		ventanaTutorial.setBotonContinuarListener(e -> {
			ventanaTutorial.dispose(); // Cerrar ventana PLAY
			mostrarVentanaPLAY(); // Mostrar la ventana del menú nuevamente
		});
		ventanaTutorial.setVisible(true);
	}

	private void mostrarVentanaProfiles() {

		ventanaMenu.dispose(); // Cerrar ventana anterior
		ventanaProfiles = new VentanaProfiles();
		ventanaProfiles.setBotonBackListener(e -> {
			ventanaProfiles.dispose(); // Cerrar ventana PLAY
			mostrarVentanaMenu(); // Mostrar la ventana del menú nuevamente
		});
		ventanaProfiles.setVisible(true);
	}

	private void mostrarVentanaSkins() {
		ventanaMenu.dispose(); 
		ventanaSkins = new VentanaSkins(null);
        ventanaSkins.setBotonConfirmarListener(e -> {
        	ventanaSkins.dispose(); 
			mostrarVentanaMenu(); 
		});
		ventanaSkins.setVisible(true);
		ventanaMenu.dispose(); 
		ventanaSkins = new VentanaSkins(null);
        ventanaSkins.setBotonConfirmarListener(e -> {
        	ventanaSkins.dispose(); 
			mostrarVentanaMenu(); 
		});
		ventanaSkins.setVisible(true);
		
		
	}
	

	private void mostrarVentanaNivelDulce() {

		ventanaMenu.dispose(); // Cerrar ventana anterior
		ventanaNivelDulce = new VentanaNivelDulce();
		ventanaNivelDulce.setBotonBackListener(e -> {
			ventanaNivelDulce.dispose(); // Cerrar ventana PLAY
			mostrarVentanaMenu(); // Mostrar la ventana del menú nuevamente
		});
		ventanaNivelDulce.setVisible(true);
	}

	private void mostrarVentanaNivelNormal() {
		ventanaMenu.dispose(); // Cerrar ventana anterior
		ventanaNivelNormal = new VentanaNivelNormal();
		ventanaNivelNormal.setBotonBackListener(e -> {
			ventanaNivelNormal.dispose(); // Cerrar ventana PLAY
			mostrarVentanaMenu(); // Mostrar la ventana del menú nuevamente
		});
		ventanaNivelNormal.setVisible(true);
	}
	

}
