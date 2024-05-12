package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    
    private VentanaNombre ventanaNombre; // Cambio en el tipo de ventana
    private JButton botonIrANombre; // Cambio en el nombre del botón
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

        // Modificación del botón y su ActionListener
        botonIrANombre = new JButton("Ir a Ingresar Nombre");
        botonIrANombre.setBounds(550, 500, 200, 50);
        botonIrANombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la ventana de nombre
                ventanaNombre = new VentanaNombre();
                ventanaNombre.setVisible(true);
                dispose(); // Cerrar la ventana principal
            }
        });
        add(botonIrANombre);

        setLayout(null);
        setVisible(true);
    }

	public VentanaNombre getVentanaNombre() {
		return ventanaNombre;
	}

	public void setVentanaNombre(VentanaNombre ventanaNombre) {
		this.ventanaNombre = ventanaNombre;
	}

	public JButton getBotonIrANombre() {
		return botonIrANombre;
	}

	public void setBotonIrANombre(JButton botonIrANombre) {
		this.botonIrANombre = botonIrANombre;
	}

	public JLabel getImagenLabel() {
		return imagenLabel;
	}

	public void setImagenLabel(JLabel imagenLabel) {
		this.imagenLabel = imagenLabel;
	}

    
    // Getters y setters para los componentes (botón, imagen, etc.)
    // No hay cambios en estos métodos
}
