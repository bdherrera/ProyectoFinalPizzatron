package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.PerfilJugador;
import view.VentanaMenu;
import view.VentanaNombre;
import view.VentanaPLAY;
import view.VentanaPrincipal;
import view.VentanaProfiles;
import view.VentanaRegistroJugador;
import view.VentanaScore;
import view.VentanaTutorial;



public class Controller {
	
	
    private VentanaPrincipal ventanaPrincipal;
    private VentanaNombre ventanaNombre;
    private VentanaMenu ventanaMenu;
    private PerfilJugador perfilJugador;
    private VentanaScore ventanaScore;

    public Controller() {
        // Crear la ventana principal y mostrarla primero
        ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);

        // Agregar un ActionListener al botón de la ventana principal para mostrar la ventana de nombre
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

    private void mostrarVentanaMenu() {
        ventanaMenu = new VentanaMenu(perfilJugador);
        ventanaMenu.setVisible(true);
        agregarActionListenersMenu();
    }

    private void agregarActionListenersMenu() {
        ventanaMenu.getBotonPLAY().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaPLAY ventanaPLAY = new VentanaPLAY();
                ventanaPLAY.setVisible(true);
                ventanaMenu.dispose();
            }
        });

        ventanaMenu.getBotonProfiles().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaProfiles ventanaProfiles = new VentanaProfiles();
                ventanaProfiles.setVisible(true);
                ventanaMenu.dispose();
            }
        });

        ventanaMenu.getBotonTutorial().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaTutorial ventanaTutorial = new VentanaTutorial();
                ventanaTutorial.setVisible(true);
                ventanaMenu.dispose();
            }
        });

        ventanaMenu.getBotonCharacter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaRegistroJugador ventanaRegistroJugador = new VentanaRegistroJugador();
                ventanaRegistroJugador.setVisible(true);
                ventanaMenu.dispose();
            }
        });
    }
    private void mostrarVentanaScore() {
        if (ventanaScore == null) {
            ventanaScore = new VentanaScore();
        }
        ventanaScore.setVisible(true);
        ventanaScore.updateScore(perfilJugador.getScore()); // Supongamos que PerfilJugador tiene un método getScore()
    }
}
