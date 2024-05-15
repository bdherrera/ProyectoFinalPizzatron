package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import model.PerfilJugador;
import view.VentanaMenu;
import view.VentanaNombre;
import view.VentanaPLAY;
import view.VentanaPrincipal;
import view.VentanaPLAY;
import view.VentanaProfiles;
import view.VentanaTutorial;
import view.VentanaRegistroJugador;

public class Controller {
    private VentanaPrincipal ventanaPrincipal;
    private VentanaNombre ventanaNombre;
    private VentanaMenu ventanaMenu;
    private PerfilJugador perfilJugador;
    private VentanaPLAY ventanaPlay;
    private VentanaProfiles ventanaProfiles;
    private VentanaTutorial ventanaTutorial;
    private VentanaRegistroJugador ventanaRegistroJugador;

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

    // Método para mostrar la ventana del menú
    private void mostrarVentanaMenu() {
        ventanaMenu = new VentanaMenu(perfilJugador);
        ventanaMenu.setVisible(true);
        
        // Agregar un ActionListener al botón PLAY
        ventanaMenu.setBotonPLAYListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de juego (VentanaPLAY)
                ventanaPlay = new VentanaPLAY();
                ventanaPlay.setVisible(true);
            }
        });
        ventanaMenu.setBotonProfilesListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de juego (VentanaPLAY)
                ventanaTutorial = new VentanaTutorial();
                ventanaTutorial.setVisible(true);
            }
        });
        ventanaMenu.setBotonCharacterListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de juego (VentanaPLAY)
                ventanaRegistroJugador = new VentanaRegistroJugador();
                ventanaRegistroJugador.setVisible(true);
            }
        });
        ventanaMenu.setBotonTutorialListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de juego (VentanaPLAY)
                ventanaTutorial = new VentanaTutorial();
                ventanaTutorial.setVisible(true);
            }
        });
    }
}
