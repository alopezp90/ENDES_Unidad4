package refactorizacion;

public class CasoF {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Empleado trabajador = new Empleado();

        trabajador.setHoras(40);
        trabajador.setHorasextra(5);
        trabajador.setTipoEmpleado("Supervisor", 20.0);

        System.out.println(trabajador.getsueldo());
    }

}
