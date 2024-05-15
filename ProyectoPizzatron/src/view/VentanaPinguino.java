package view;

import javax.swing.*;
import java.awt.*;

public class VentanaPinguino extends JFrame {

    private JLabel labelPinguino;
    private ImageIcon gorraSeleccionada;
    private ImageIcon camisaSeleccionada;
    private ImageIcon pantalonSeleccionado;

    // Tamaño máximo para la imagen del pingüino
    private static final int MAX_PINGUINO_WIDTH = 300;
    private static final int MAX_PINGUINO_HEIGHT = 300;

    public VentanaPinguino(ImageIcon gorraSeleccionada, ImageIcon camisaSeleccionada, ImageIcon pantalonSeleccionado) {
        setTitle("Pinguino");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        this.gorraSeleccionada = gorraSeleccionada;
        this.camisaSeleccionada = camisaSeleccionada;
        this.pantalonSeleccionado = pantalonSeleccionado;

        // Crear la etiqueta para mostrar al pingüino
        labelPinguino = new JLabel();
        labelPinguino.setIcon(new ImageIcon(getClass().getResource("/imagenes/pinguino.png"))); // Imagen base del pingüino
        labelPinguino.setLayout(new OverlayLayout(labelPinguino));
        add(labelPinguino);

        // Mostrar las imágenes seleccionadas sobre el pingüino
        if (gorraSeleccionada != null) {
            JLabel labelGorra = new JLabel(gorraSeleccionada);
            labelGorra.setAlignmentX(0.5f);
            labelGorra.setAlignmentY(5.0f); // Ajustar la posición de la gorra
            labelPinguino.add(labelGorra);
        }
        if (camisaSeleccionada != null) {
            JLabel labelCamisa = new JLabel(camisaSeleccionada);
            labelCamisa.setAlignmentX(0.5f);
            labelCamisa.setAlignmentY(0.6f); // Centrar la camisa verticalmente
            labelPinguino.add(labelCamisa);
        }
        if (pantalonSeleccionado != null) {
            JLabel labelPantalon = new JLabel(pantalonSeleccionado);
            labelPantalon.setAlignmentX(0.5f);
            labelPantalon.setAlignmentY(0.1f); // Ajustar la posición del pantalón
            labelPinguino.add(labelPantalon);
        }

        // Escalar el pingüino para ajustarse al tamaño máximo
        escalarPinguino();

        pack();
        setVisible(true);
    }

    // Método para escalar el pingüino según el tamaño máximo
    private void escalarPinguino() {
        ImageIcon pinguinoIcon = (ImageIcon) labelPinguino.getIcon();
        Image pinguinoImage = pinguinoIcon.getImage();

        int width = pinguinoImage.getWidth(labelPinguino);
        int height = pinguinoImage.getHeight(labelPinguino);

        // Escalar el pingüino si excede el tamaño máximo
        if (width > MAX_PINGUINO_WIDTH || height > MAX_PINGUINO_HEIGHT) {
            double scaleFactor = Math.min((double) MAX_PINGUINO_WIDTH / width, (double) MAX_PINGUINO_HEIGHT / height);
            width = (int) (width * scaleFactor);
            height = (int) (height * scaleFactor);
            pinguinoImage = pinguinoImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            labelPinguino.setIcon(new ImageIcon(pinguinoImage));
        }
    }

	public void actualizarPinguino(ImageIcon gorraSeleccionada2, ImageIcon camisaSeleccionada2,
			ImageIcon pantalonSeleccionado2) {
		// TODO Auto-generated method stub
		
	}
}
