package Dulce;


import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PizzaInfoGUI {
    private Pizza pizza;
    private Map<Integer, String> nombresImagenes = new HashMap<>();
    private int totalPuntos = 0; // Inicializamos los puntos en 0
    private final int PUNTOS_RELLENO_COMPLETO = 50;
    private final int PUNTOS_POR_IMAGEN = 10;

    public PizzaInfoGUI(Pizza pizza) {
        this.pizza = pizza;
        // Asigna los nombres de las imágenes
        asignarNombresImagenes();
    }

    // Método para asignar nombres a las imágenes
    private void asignarNombresImagenes() {


        nombresImagenes.put(7, "Base");

        nombresImagenes.put(12, "Crema");
        nombresImagenes.put(13, "BotellaChocolate");
        nombresImagenes.put(14, "SprinklesEstante");
        nombresImagenes.put(15, "Sprinkles");
        nombresImagenes.put(16, "chocolates");
        nombresImagenes.put(17, "ChocolateKiss");
        nombresImagenes.put(18, "jellybeans");
        nombresImagenes.put(19, "Jellybean");
        nombresImagenes.put(20, "malbaviscos");
        nombresImagenes.put(21, "Malvabisco");
        nombresImagenes.put(22, "CandyCanes");
        nombresImagenes.put(23, "CandyCane");
    }

    public void mostrarInformacion() {
        // Crear un nuevo marco (frame)
        JFrame frame = new JFrame("Información de la Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Panel para la información de la pizza
        JPanel infoPanel = new JPanel(new GridLayout(0, 2));
        JLabel rellenoLabel = new JLabel("La pizza tiene relleno: " + pizza.tieneRelleno());
        infoPanel.add(rellenoLabel);

        List<Integer> imagenes = pizza.getImagenes();
        int cantidadImagenesPresentes = imagenes.size();
        JLabel imagenesLabel = new JLabel("Cantidad de imágenes presentes: " + cantidadImagenesPresentes);
        infoPanel.add(imagenesLabel);

        for (Integer i = 1; i <= 23; i++) {
            String nombreImagen = nombresImagenes.get(i);
            if (nombreImagen != null) {
                JLabel imageStatusLabel;
                if (imagenes.contains(i)) {
                    imageStatusLabel = new JLabel(nombreImagen + " está presente.");
                    totalPuntos += PUNTOS_POR_IMAGEN; // Sumamos los puntos por imagen
                } else {
                    imageStatusLabel = new JLabel(nombreImagen + " no está presente.");
                }
                JLabel cantidadImagenesLabel = new JLabel("Cantidad: " + (imagenes.contains(i) ? 1 : 0));
                infoPanel.add(imageStatusLabel);
                infoPanel.add(cantidadImagenesLabel);
            }
        }

        if (pizza.tieneRelleno()) {
            totalPuntos += PUNTOS_RELLENO_COMPLETO; // Sumamos los puntos por relleno completo
        }

        JLabel totalPuntosLabel = new JLabel("Total de puntos: " + totalPuntos);
        infoPanel.add(totalPuntosLabel);

        // Agregar el panel al marco
        frame.add(infoPanel, BorderLayout.CENTER);

        // Mostrar el marco
        frame.setVisible(true);
    }
}
