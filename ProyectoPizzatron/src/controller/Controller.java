package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.PerfilJugador;
import view.VentanaMenu;
import view.VentanaNombre;
import view.VentanaPrincipal;

public class Controller {
    private VentanaPrincipal ventanaPrincipal;
    private VentanaNombre ventanaNombre;
    private VentanaMenu ventanaMenu;
    private PerfilJugador perfilJugador;

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

    // Método para mostrar la ventana de nombre
    private void mostrarVentanaNombre() {
        ventanaNombre = new VentanaNombre();
        ventanaNombre.setVisible(true);

        // Agregar un ActionListener al botón de la ventana de nombre para almacenar el nombre y mostrar la ventana del menú
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

    // Método para mostrar la ventana del menú
    private void mostrarVentanaMenu() {
        ventanaMenu = new VentanaMenu(perfilJugador); // Pasar el perfil del jugador a la ventana del menú
        ventanaMenu.setVisible(true);
    }
}
