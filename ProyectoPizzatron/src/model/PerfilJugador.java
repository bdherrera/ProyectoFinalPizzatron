package model;

public class PerfilJugador {
    private String nombre;
    private int Score;

    public PerfilJugador(String nombre) {
        this.nombre = nombre;
        this.Score = 0;
    }

    // Métodos para obtener y establecer el nombre del jugador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    @Override
    public String toString() {
        return "PerfilJugador{" +
                "nombre='" + nombre + '\'' +
                ", puntuacion=" + Score +
                '}';
    }

	public void setScore(int score) {
		Score = score;
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}
}
