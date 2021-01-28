package refactorizarcaso1;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class TipoEmpleado {

    private String cargo;
    private double horaBase;

    public TipoEmpleado(String cargo, double horaBase) {
        this.cargo = cargo;
        this.horaBase = horaBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getHoraBase() {
        return horaBase;
    }

    public void setHoraBase(double horaBase) {
        this.horaBase = horaBase;
    }
}
