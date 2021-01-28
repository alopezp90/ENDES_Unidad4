package refactorizacion;

public class CasoB2 {

    public static void main(String[] args) {
        System.out.println(tienePrecioBase());
    }

    static boolean tienePrecioBase() {
        Pedido minivan = new Pedido();
        minivan.numero = 9;
        minivan.preciobase = 50.0;

        return minivan.preciobase > 100;
    }
}
