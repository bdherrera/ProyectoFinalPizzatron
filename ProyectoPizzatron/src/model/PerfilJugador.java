package model;

public class PerfilJugador {
    private String nombre;
    private int puntuacion;

    public PerfilJugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    // Métodos para obtener y establecer el nombre del jugador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y establecer la puntuación del jugador
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    // Método para aumentar la puntuación del jugador
    public void aumentarPuntuacion(int puntos) {
        this.puntuacion += puntos;
    }

    // Método para reiniciar la puntuación del jugador
    public void reiniciarPuntuacion() {
        this.puntuacion = 0;
    }

    @Override
    public String toString() {
        return "PerfilJugador{" +
                "nombre='" + nombre + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
