package refactorizacion;

public class TipoEmpleado {

    private String tipo;
    private double horabase;

    public String getTipo() {
        return tipo;
    }

    public double getHorabase() {
        return horabase;
    }

    public TipoEmpleado(String t, double h) {
        this.tipo = t;
        this.horabase = h;
    }

    public double calculoHoras(int horas, int horasextra) {
        if (tipo.equals("Supervisor")) {

            return horas + horasextra * 1.40;
        }

        if (tipo.equals("Dependiente")) {

            return horas + horasextra * 1.75;
        }

        return horas + horasextra * 1.5;

    }

}
