package gasolinera;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Deposito {

    private String id;
    private float diametro;
    private float altura;

    public Deposito(String id, float diametro, float altura) {
        this.id = id;
        this.diametro = diametro;
        this.altura = altura;
    }

    public String getId() {
        return id;
    }

    public void setId(String idDeposito) {
        this.id = idDeposito;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = Math.abs(diametro);//no tiene sentido que el diametro sea negativo
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = Math.abs(altura);//no tiene sentido que la altura sea negativa
    }

    public float valorCapacidad() {
        final float PI = 3.1416f;
        return PI * this.altura * this.diametro / 2 * this.diametro / 2;
    }

}
