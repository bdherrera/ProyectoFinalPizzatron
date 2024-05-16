package salado;

import java.util.List;

//Importa la clase Pizza para poder acceder a su información
import salado.Pizza;

public class PizzaInfo {
    private Pizza pizza;

    public PizzaInfo(Pizza pizza) {
        this.pizza = pizza;
    }

    public void obtenerInformacion() {
        System.out.println("La pizza tiene relleno: " + pizza.tieneRelleno());

        System.out.println("Imágenes presentes:");
        List<Integer> imagenes = pizza.getImagenes();
        for (int i = 1; i <= 23; i++) {
            if (imagenes.contains(i)) {
                System.out.println("Imagen " + i + " está presente.");
            } else {
                System.out.println("Imagen " + i + " no está presente.");
            }
        }
    }
}
