package refactorizarcaso1;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Empleado {

    private TipoEmpleado tipo;
    private int horas;
    private int horasExtra;

    public Empleado(String tipo, double horaBase) {
        this.tipo = new TipoEmpleado(tipo, horaBase);
    }

    public Empleado(TipoEmpleado tipo, int horas, int horasExtra) {
        this.tipo = tipo;
        this.horas = horas;
        this.horasExtra = horasExtra;
    }

    public Empleado(String tipo, double horaBase, int horas, int horasExtra) {
        this.tipo = new TipoEmpleado(tipo, horaBase);
        this.horas = horas;
        this.horasExtra = horasExtra;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    private double calculoHoras() {
        if (this.tipo.getCargo().equals("Supervisor")) {
            return this.horas + this.horasExtra * 1.40;
        } else if (this.tipo.getCargo().equals("Dependiente")) {
            return this.horas + this.horasExtra * 1.75;
        } else {
            return this.horas + this.horasExtra * 1.50;
        }
    }

    public double getSueldo() {
        return this.getTipo().getHoraBase() * calculoHoras();
    }

}
