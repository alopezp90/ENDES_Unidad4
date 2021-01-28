package refactorizacion;

public class CasoDbis {

    static int salario(int horas, int horasextra, int salariobase) {
        final int horasTrabajadas = (int) (horas + horasextra * 1.5);
        salariobase = salariobase * horasTrabajadas;

        return salariobase;
    }

    public static void main(String[] args) {
        int horas = 35;
        int horasextras = 4;
        int salariobase = 1000;

        System.out.println(salario(horas, horasextras, salariobase));
    }

}
