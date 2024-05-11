package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaItems extends JFrame {

    private JButton botonGorra1;
    private JButton botonGorra2;
    private JButton botonPantalon1;
    private JButton botonPantalon2;
    private JButton botonColor1;
    private JButton botonColor2;
    private JButton botonCamisa1;
    private JButton botonCamisa2;

    public VentanaItems() {
        setTitle("Opciones de Personalización");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el panel para los botones de opciones
        JPanel panel = new JPanel(new GridLayout(4, 2));
        add(panel);

        // Botones para seleccionar gorra
        botonGorra1 = new JButton("Seleccionar Gorra 1");
        botonGorra2 = new JButton("Seleccionar Gorra 2");

        // Botones para seleccionar pantalón
        botonPantalon1 = new JButton("Seleccionar Pantalón 1");
        botonPantalon2 = new JButton("Seleccionar Pantalón 2");

        // Botones para seleccionar color
        botonColor1 = new JButton("Seleccionar Color 1");
        botonColor2 = new JButton("Seleccionar Color 2");

        // Botones para seleccionar camisa
        botonCamisa1 = new JButton("Seleccionar Camisa 1");
        botonCamisa2 = new JButton("Seleccionar Camisa 2");

        // Agregar botones al panel
        panel.add(botonGorra1);
        panel.add(botonGorra2);
        panel.add(botonPantalon1);
        panel.add(botonPantalon2);
        panel.add(botonColor1);
        panel.add(botonColor2);
        panel.add(botonCamisa1);
        panel.add(botonCamisa2);

        setVisible(true);
    }

    // Métodos para establecer ActionListener para los botones
    public void setActionListenerGorra1(ActionListener listener) {
        botonGorra1.addActionListener(listener);
    }

    public void setActionListenerGorra2(ActionListener listener) {
        botonGorra2.addActionListener(listener);
    }

    public void setActionListenerPantalon1(ActionListener listener) {
        botonPantalon1.addActionListener(listener);
    }

    public void setActionListenerPantalon2(ActionListener listener) {
        botonPantalon2.addActionListener(listener);
    }

    public void setActionListenerColor1(ActionListener listener) {
        botonColor1.addActionListener(listener);
    }

    public void setActionListenerColor2(ActionListener listener) {
        botonColor2.addActionListener(listener);
    }

    public void setActionListenerCamisa1(ActionListener listener) {
        botonCamisa1.addActionListener(listener);
    }

    public void setActionListenerCamisa2(ActionListener listener) {
        botonCamisa2.addActionListener(listener);
    }
}
