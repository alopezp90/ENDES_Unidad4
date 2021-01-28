package clasesdelegadas;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class Equipo {

    private final String nombreEquipo;
    private final Jugador miCapitan;
    
    public Equipo(Jugador capitan, String nombre) {
        this.nombreEquipo = nombre;
        this.miCapitan = capitan;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getCapitan() {
        return miCapitan.getNombreJugador();
    }    
}
