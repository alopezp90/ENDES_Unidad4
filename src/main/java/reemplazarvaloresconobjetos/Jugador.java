package reemplazarvaloresconobjetos;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Jugador {

    private String nombre;
    private Telefono telefono;

    public Jugador(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = new Telefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = new Telefono(telefono);
    }
}
