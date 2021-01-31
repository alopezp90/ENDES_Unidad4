package reemplazarconsubclases;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Tenista {

    private final int AMATEUR = 1;
    private final int SEMIPROFESIONAL = 2;
    private final int PROFESIONAL = 3;
    private int tipo;

    public Tenista create(int tipo) {
        switch (tipo) {
            case 1:
                return new Amateur();
            case 2:
                return new Semiprofesional();
            case 3:
                return new Profesional();
            default:
                throw new IllegalArgumentException("tipo incorrecto");
        }
    }
}
