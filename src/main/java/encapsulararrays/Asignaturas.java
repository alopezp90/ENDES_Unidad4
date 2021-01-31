package encapsulararrays;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Asignaturas {

    private String[] asignaturas;

    public Asignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] _asignaturas) {
        this.asignaturas = _asignaturas;
    }

    public void setAsignatura(int n, String asignatura) {
        this.asignaturas[n] = asignatura;
    }

    //Setter y getter a partir de una copia
    public void setAsignaturasCopia(String[] var) {
        this.asignaturas = new String[var.length];
        for (int i = 0; i < var.length; i++) {
            setAsignatura(i, var[i]);
        }
    }

    public String[] getAsignaturasCopia() {
        String[] var = new String[asignaturas.length];
        System.arraycopy(asignaturas, 0, var, 0, asignaturas.length);
        return var;
    }
}
