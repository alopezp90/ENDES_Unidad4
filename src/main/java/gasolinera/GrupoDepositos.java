package gasolinera;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class GrupoDepositos {

    private String id;
    private Deposito[] depositos;
    
    public GrupoDepositos(String id, int n) {
        this.id = id;
        this.inicializaDepositos(n);
    }
}
