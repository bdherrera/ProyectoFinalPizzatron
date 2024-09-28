package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaItems extends JFrame {

    private JToggleButton[] botonesGorras;
    private JToggleButton[] botonesCamisas;
    private JToggleButton[] botonesPantalones;
    private JButton botonContinuar;

    // Almacena las imágenes seleccionadas de gorra, camisa y pantalón
    private ImageIcon gorraSeleccionada;
    private ImageIcon camisaSeleccionada;
    private ImageIcon pantalonSeleccionado;

    public VentanaItems() {
        setTitle("Opciones de Personalización");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new GridLayout(3, 2, 10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panelPrincipal);

        // Panel de gorras
        JPanel panelGorras = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelGorras.setBorder(BorderFactory.createTitledBorder("Gorras"));
        panelPrincipal.add(panelGorras);

        // Panel de camisas
        JPanel panelCamisas = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelCamisas.setBorder(BorderFactory.createTitledBorder("Camisas"));
        panelPrincipal.add(panelCamisas);

        // Panel de pantalones
        JPanel panelPantalones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelPantalones.setBorder(BorderFactory.createTitledBorder("Pantalones"));
        panelPrincipal.add(panelPantalones);

        // Botones de gorras
        botonesGorras = new JToggleButton[2];
        botonesGorras[0] = createToggleButton("/imagenes/g_azul.png", "Gorra Azul", panelGorras);
        botonesGorras[1] = createToggleButton("/imagenes/g_negra.png", "Gorra Negra", panelGorras);

        // Botones de camisas
        botonesCamisas = new JToggleButton[2];
        botonesCamisas[0] = createToggleButton("/imagenes/c_blanca.png", "Camisa Blanca", panelCamisas);
        botonesCamisas[1] = createToggleButton("/imagenes/c_negra.png", "Camisa Negra", panelCamisas);

        // Botones de pantalones
        botonesPantalones = new JToggleButton[2];
        botonesPantalones[0] = createToggleButton("/imagenes/p_verde.png", "Pantalón Verde", panelPantalones);
        botonesPantalones[1] = createToggleButton("/imagenes/p_rojo.png", "Pantalón Rojo", panelPantalones);

        // Botón de continuar
        botonContinuar = new JButton("Continuar");
        botonContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la imagen seleccionada de gorra
                gorraSeleccionada = getSelectedIcon(botonesGorras);
                // Obtener la imagen seleccionada de camisa
                camisaSeleccionada = getSelectedIcon(botonesCamisas);
                // Obtener la imagen seleccionada de pantalón
                pantalonSeleccionado = getSelectedIcon(botonesPantalones);

                // Crear una nueva instancia de VentanaPinguino y pasar las imágenes seleccionadas
                VentanaPinguino ventanaPinguino = new VentanaPinguino(gorraSeleccionada, camisaSeleccionada, pantalonSeleccionado);
                ventanaPinguino.setVisible(true);
            }
        });
        add(botonContinuar, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private JToggleButton createToggleButton(String imagePath, String buttonText, JPanel panel) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);
        JToggleButton button = new JToggleButton(buttonText, scaledIcon);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(button);
        return button;
    }

    private ImageIcon getSelectedIcon(JToggleButton[] buttons) {
        for (JToggleButton button : buttons) {
            if (button.isSelected()) {
                return (ImageIcon) button.getIcon();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaItems());
    }
}
