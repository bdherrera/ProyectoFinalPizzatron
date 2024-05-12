package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VentanaMenu;
import view.VentanaNombre;
import view.VentanaPrincipal;

public class Controller {
    private VentanaPrincipal ventanaPrincipal;
    private VentanaNombre ventanaNombre;
    private VentanaMenu ventanaMenu;

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

        // Agregar un ActionListener al botón de la ventana de nombre para mostrar la ventana del menú
        ventanaNombre.getBotonAceptar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana de nombre y abrir la ventana del menú
                ventanaNombre.dispose();
                mostrarVentanaMenu();
            }
        });
    }

    // Método para mostrar la ventana del menú
    private void mostrarVentanaMenu() {
        ventanaMenu = new VentanaMenu();
        ventanaMenu.setVisible(true);
    }
}
