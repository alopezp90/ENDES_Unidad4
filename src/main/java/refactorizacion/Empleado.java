package refactorizacion;

public class Empleado {

    private int horas;
    private int horasextra;
    private TipoEmpleado tipo;

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }
    
    public void setTipoEmpleado(String t, double h) {
        this.tipo = new TipoEmpleado(t, h);
    }

    public double getsueldo() {
        return tipo.getHorabase() * tipo.calculoHoras(horas, horasextra);
    }

}
