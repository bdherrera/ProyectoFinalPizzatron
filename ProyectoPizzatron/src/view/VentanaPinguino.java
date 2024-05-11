package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class VentanaPinguino extends JFrame {

    private JLabel labelPinguino;

    public VentanaPinguino() {
        setTitle("Pinguino");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear la etiqueta para mostrar al pingüino
        labelPinguino = new JLabel();
        labelPinguino.setIcon(new ImageIcon("pinguino_base.png")); // Asignar imagen base del pingüino
        labelPinguino.setBounds(0, 0, 300, 300);
        add(labelPinguino);

        setVisible(true);
    }

    // Método para actualizar la apariencia del pingüino con una nueva imagen
    public void actualizarPinguino(ImageIcon imagen) {
        labelPinguino.setIcon(imagen);
    }
}
