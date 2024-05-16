package main;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        // Crear la ventana
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        // Crear el panel de capas
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new java.awt.Dimension(820, 630));

        // Crear el panel de juego
        GamePanel gamePanel = new GamePanel();
        gamePanel.setBounds(0, 0, 820, 630); // Ajustar tamaño y posición

        // Crear el panel de imágenes de la cinta
        Imagen imagen = new Imagen();
        imagen.setBounds(0, 0, 820, 630); // Ajustar tamaño y posición

        // Crear el panel del fondo de la pizzeria
        FondoPizzeria pizzeria = new FondoPizzeria();
        pizzeria.setBounds(0, 0, 820, 630); // Ajustar tamaño y posición

        // Crear el panel de la pizza
        Pizza pizza = new Pizza();
        pizza.setBounds(0, 0, 820, 630); // Ajustar tamaño y posición
        
       // Ingredientes ingredientes = new Ingredientes();
       // ingredientes.setBounds(0, 0, 820, 630); // Ajustar tamaño y posición
        

        // Añadir los paneles al JLayeredPane en el orden correcto
        layeredPane.add(gamePanel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(pizzeria, JLayeredPane.DEFAULT_LAYER); // Pizzeria en la capa base
        layeredPane.add(imagen, JLayeredPane.MODAL_LAYER); // Imagen sobre GamePanel
        layeredPane.add(pizza, JLayeredPane.DRAG_LAYER); // Pizza sobre Imagen y Pizzeria
        //layeredPane.add(ingredientes, JLayeredPane.DRAG_LAYER); // Pizza sobre Imagen y Pizzeria
        // Añadir el panel de capas a la ventana
        window.add(layeredPane);

        // Empaquetar la ventana
        window.pack();

        // Centrar la ventana en la pantalla
        window.setLocationRelativeTo(null);

        // Hacer visible la ventana
        window.setVisible(true);

        // Iniciar el hilo de juego
        gamePanel.startGameThread();

        // Depuración del código: Verificar si el método playMusic se está llamando correctamente
        gamePanel.playMusic(0);
    }
}
