package refactorizacion;

public class CasoB {

    static int numerodecervezas = 6;

    static int rondaGratis() {
        return (numerodecervezas > 5) ? 2 : 1;
    }

    public static void main(String[] args) {
        System.out.println(rondaGratis());
    }

}
