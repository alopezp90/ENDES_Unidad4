package clasesdelegadas;

/**
 * @author Alberto López Puertas 
 * <https://github.com/alopezp90>
 */

public class ClaseCliente {
    
    public static void main(String[] args) {
        
        Jugador ramos = new Jugador();
        Equipo realMadrid = new Equipo(ramos, "Real Madrid");
        
        ramos.setNombreJugador("Sergio Ramos");
        ramos.setEquipo(realMadrid);
        
        System.out.println("El capitan del " + realMadrid.getNombreEquipo() + " es: " + realMadrid.getCapitan());
    }

}
