package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSkins extends JFrame {

    private JTextField campoNombre;
    private JButton botonConfirmar;
    private JButton botonVerPinguino;
    private JButton botonVerItems;
    private VentanaPinguino ventanaPinguino;
    private VentanaItems ventanaItems;

    public VentanaSkins(String nombreJugador) {
        setTitle("Personalización de Pingüino");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Panel para los campos de registro
        JPanel panelRegistro = new JPanel();
        panelRegistro.setLayout(new BorderLayout());

        // Campo de texto para el nombre del jugador
        JLabel labelNombre = new JLabel("Nombre de Pingüino:");
        campoNombre = new JTextField(20);
        campoNombre.setText(nombreJugador); // Setear el nombre recibido
        panelRegistro.add(labelNombre, BorderLayout.WEST);
        panelRegistro.add(campoNombre, BorderLayout.CENTER);

        // Añadir el panel de registro a la ventana principal
        add(panelRegistro, BorderLayout.NORTH);

        // Botones para ver la ventana del pingüino y la ventana de los ítems
        botonVerPinguino = new JButton("Ver Pingüino");
        botonVerPinguino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ventanaPinguino == null) {
                    ventanaPinguino = new VentanaPinguino(null, null, null);
                }
                ventanaPinguino.setVisible(true);
            }
        });
        add(botonVerPinguino, BorderLayout.WEST);

        botonVerItems = new JButton("Ver Ítems");
        botonVerItems.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ventanaItems == null) {
                    ventanaItems = new VentanaItems();
                }
                ventanaItems.setVisible(true);
            }
        });
        add(botonVerItems, BorderLayout.EAST);

        // Botón para confirmar el registro
        botonConfirmar = new JButton("Confirmar Personalización");
        botonConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí podrías agregar la lógica para guardar la personalización del jugador
                dispose(); // Cerrar la ventana de personalización después de confirmar
            }
        });
        add(botonConfirmar, BorderLayout.SOUTH);

        // Establecer el fondo de la ventana
        JLabel labelFondo = new JLabel();
        labelFondo.setIcon(new ImageIcon(getClass().getResource("/imagenes/fondo.png")));
        getContentPane().add(labelFondo, BorderLayout.CENTER);
        setLayout(new FlowLayout());

        setVisible(true);
    }

}
