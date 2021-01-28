package clasesdelegadas;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class Jugador {
    
    private Equipo equipo;
    private String nombreJugador;
    
    public Jugador() {
    }
    
    public Jugador(Equipo equipo, String nombre) {
        this.equipo = equipo;
        this.nombreJugador = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
}
