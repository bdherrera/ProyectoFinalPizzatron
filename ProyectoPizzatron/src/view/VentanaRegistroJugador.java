package view;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistroJugador extends JFrame {

    private JTextField campoNombre;
    private JButton botonSeleccionarColor;
    private JButton botonConfirmar;
    private VentanaMenu menu;

    public VentanaRegistroJugador() {
        setTitle("Registro de Jugador");
        setSize(830, 635);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Panel para los campos de registro
        JPanel panelRegistro = new JPanel();
        panelRegistro.setLayout(new BorderLayout());

        // Campo de texto para el nombre del jugador
        JLabel labelNombre = new JLabel("Nombre de Pingüino:");
        campoNombre = new JTextField(20);
        panelRegistro.add(labelNombre, BorderLayout.WEST);
        panelRegistro.add(campoNombre, BorderLayout.CENTER);

        // Botón para seleccionar el color del pingüino
        botonSeleccionarColor = new JButton("Seleccionar Color");
        botonSeleccionarColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(VentanaRegistroJugador.this, "Seleccionar Color", Color.BLACK);
                if (color != null) {
                    botonSeleccionarColor.setBackground(color);
                }
            }
        });
        panelRegistro.add(botonSeleccionarColor, BorderLayout.EAST);

        // Botón para confirmar el registro
        botonConfirmar = new JButton("Confirmar Registro");
       

        // Añadir el panel de registro y el botón de confirmar a la ventana principal
        add(panelRegistro, BorderLayout.CENTER);
        add(botonConfirmar, BorderLayout.SOUTH);

        setVisible(true);
    }
    public void setBotonConfirmarListener(ActionListener listener) {
	    botonConfirmar.addActionListener(listener);
	}

    

}
