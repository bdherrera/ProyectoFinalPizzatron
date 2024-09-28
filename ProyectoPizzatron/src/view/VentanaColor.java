package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaColor extends JFrame {

    public VentanaColor() {
        setTitle("Seleccionar Color");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Aquí deberías agregar la lógica para permitir al jugador seleccionar un color
        // Puedes usar un JColorChooser u otro componente para permitir la selección de color

        setVisible(true);
    }
}
