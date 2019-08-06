package proyectoprogramacion;

public class Habitacion {
    protected int NUMERO;
    protected int PISO;
    protected int PREXNOC;
    protected int CANTPERS;

    public Habitacion(int NUMERO, int PISO, int PREXNOC, int CANTPERS) {
        this.NUMERO = NUMERO;
        this.PISO = PISO;
        this.PREXNOC = PREXNOC;
        this.CANTPERS = CANTPERS;
    }

    public int getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(int NUMERO) {
        this.NUMERO = NUMERO;
    }

    public int getPISO() {
        return PISO;
    }

    public void setPISO(int PISO) {
        this.PISO = PISO;
    }

    public int getPREXNOC() {
        return PREXNOC;
    }

    public void setPREXNOC(int PREXNOC) {
        this.PREXNOC = PREXNOC;
    }

    public int getCANTPERS() {
        return CANTPERS;
    }

    public void setCANTPERS(int CANTPERS) {
        this.CANTPERS = CANTPERS;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "NUMERO=" + NUMERO + ", PISO=" + PISO + ", PREXNOC=" + PREXNOC + ", CANTPERS=" + CANTPERS + '}';
    }
    
}
