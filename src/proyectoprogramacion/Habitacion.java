package proyectoprogramacion;

public class Habitacion {
    protected int numero;
    protected int piso;
    protected int prexnoc;
    protected int cantpers;

    public Habitacion(int numero, int piso, int prexnoc, int cantpers) {
        this.numero = numero;
        this.piso = piso;
        this.prexnoc = prexnoc;
        this.cantpers = cantpers;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getPrexnoc() {
        return prexnoc;
    }

    public void setPrexnoc(int prexnoc) {
        this.prexnoc = prexnoc;
    }

    public int getCantpers() {
        return cantpers;
    }

    public void setCantpers(int cantpers) {
        this.cantpers = cantpers;
    }

    @Override
    public String toString() {
        return "Habitacion: " + " Numero:" + numero + ", Piso: " + piso + ", Precio por noche: " + prexnoc + ", Cantidad de Personas: " + cantpers;
    }

    
    
}
