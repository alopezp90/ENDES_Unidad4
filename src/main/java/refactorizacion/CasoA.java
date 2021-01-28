package refactorizacion;

public class CasoA {

    static void printCuenta(String nombre, double cantidad) {
        printLogo();
        printDetalles(nombre, cantidad);
    }

    static void printLogo() {
        System.out.println("LOGO");
    }

    static void printDetalles(String nombre, double cantidad) {
        System.out.println("nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
    }

    public static void main(String[] args) {
        printCuenta("Antonio", 200.00);
    }
}
