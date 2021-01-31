package reemplazarvaloresconobjetos;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
public class Telefono {

    private String _telefono;

    public Telefono(String s) {
        this._telefono = s;
    }

    public String getTelefono() {
        return _telefono;
    }

    public void setTelefono(String _telefono) {
        this._telefono = _telefono;
    }
    
    public String getPrefijo() {
        return this._telefono.substring(1, 3);
    }
}
