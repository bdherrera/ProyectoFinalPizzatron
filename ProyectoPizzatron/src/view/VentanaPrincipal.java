package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    
    private VentanaRegistroJugador jugador;
    private JButton botonIrAMenu;
    private JLabel imagenLabel;

    public VentanaPrincipal() {
        setTitle("Ventana Principal");
        setSize(830, 635);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Configurar la imagen
        ImageIcon imagenIcon = new ImageIcon("media/imagenes/Loading Screen-Recovered.png"); // Reemplaza con la ruta correcta a la imagen
        imagenLabel = new JLabel(imagenIcon);
        imagenLabel.setBounds(1, 1, 800, 600); // Ajusta la posición y tamaño según necesites
        add(imagenLabel);

        botonIrAMenu = new JButton("Ir al Menú");
        botonIrAMenu.setBounds(550, 500, 200, 50);
        botonIrAMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugador = new VentanaRegistroJugador();
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
