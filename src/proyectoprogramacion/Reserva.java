package proyectoprogramacion;

public class Reserva {
    protected int NOMBRE;
    protected int NUMERO;
    protected String TIEMPO;

    public Reserva(int NOMBRE, int NUMERO, String TIEMPO) {
        this.NOMBRE = NOMBRE;
        this.NUMERO = NUMERO;
        this.TIEMPO = TIEMPO;
    }

    public int getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(int NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(int NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getTIEMPO() {
        return TIEMPO;
    }

    public void setTIEMPO(String TIEMPO) {
        this.TIEMPO = TIEMPO;
    }

    @Override
    public String toString() {
        return "Reserva: " + " Nombre: " + NOMBRE + ", Numero: " + NUMERO + ", Tiempo: " + TIEMPO;
    }
}
