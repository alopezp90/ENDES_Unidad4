package reemplazarvaloresconobjetos;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class ClaseCliente {

    public static void main(String[] args) {
        Jugador j = new Jugador("Alberto", "952789217");
        System.out.println("El prefijo de " + j.getNombre() + " es: " + j.getTelefono().getPrefijo());
    }
}
