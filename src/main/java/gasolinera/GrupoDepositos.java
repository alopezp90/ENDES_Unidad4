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
        this.depositos = new Deposito[compruebaN(n)];
        this.inicializaDepositos();
    }

    private int compruebaN(int n) { //Comprueba que el grupo tenga al menos 2 depositos
        if (n < 2) {
            return 2;
        }
        return n;
    }

    //inicializa los depositos con los valores por defecto del ejercicio, para
    //cambiarlos habria que usar los metodos setter de Deposito.
    private void inicializaDepositos() {
        for (int i = 0; i < this.depositos.length; i++) {
            this.depositos[i] = new Deposito("0000", 10, 5);
        }
    }

    public float capacidadDelGrupo() {
        float capacidadGrupo = 0;
        for (Deposito deposito : this.depositos) {
            capacidadGrupo += deposito.valorCapacidad();
        }
        return capacidadGrupo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Deposito[] getDepositos() {
        return depositos;
    }

    public static void main(String[] args) {
        GrupoDepositos grupo1 = new GrupoDepositos("Grupo1", 3);
        System.out.println(grupo1.capacidadDelGrupo());
    }
}
