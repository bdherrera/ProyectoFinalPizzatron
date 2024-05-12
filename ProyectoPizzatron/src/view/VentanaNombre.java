package view;
import javax.swing.*;
import java.awt.*;

public class VentanaNombre extends JFrame {

    private JTextField textFieldNombre;
    private JButton botonAceptar;

    public VentanaNombre() {
        // Configuración de la ventana
        setTitle("Ingresar Nombre");
        setSize(830, 635);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setResizable(false); // No permitir redimensionar la ventana

        // Panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        // Panel para el campo de texto y el botón
        JPanel panelFormulario = new JPanel();
        panelFormulario.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Campo de texto para ingresar el nombre
        textFieldNombre = new JTextField(20);
        textFieldNombre.setFont(new Font("Arial", Font.PLAIN, 20));
        panelFormulario.add(textFieldNombre);

        // Botón para aceptar el nombre
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setFont(new Font("Arial", Font.PLAIN, 20));
        panelFormulario.add(botonAceptar);

        // Agregar el panel de formulario al panel principal
        panelPrincipal.add(panelFormulario, BorderLayout.CENTER);

        // Agregar el panel principal a la ventana
        add(panelPrincipal);

        // Mostrar la ventana
        setVisible(true);
    }

    // Método para obtener el nombre ingresado
    public String getNombreIngresado() {
        return textFieldNombre.getText();
    }

    public JTextField getTextFieldNombre() {
        return textFieldNombre;
    }

    public void setTextFieldNombre(JTextField textFieldNombre) {
        this.textFieldNombre = textFieldNombre;
    }

    public JButton getBotonAceptar() {
        return botonAceptar;
    }

    public void setBotonAceptar(JButton botonAceptar) {
        this.botonAceptar = botonAceptar;
    }
}
