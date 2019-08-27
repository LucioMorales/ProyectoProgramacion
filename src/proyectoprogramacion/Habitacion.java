package proyectoprogramacion;

public class Habitacion {
    private int numero;
    private int piso;
    private int prexnoc;
    private int cantpers;

    public Habitacion(int numero, int piso, int prexnoc, int cantpers) {
        this.numero = numero;
        this.piso = piso;
        this.prexnoc = prexnoc;
        this.cantpers = cantpers;
    }
    
    public Habitacion() {
        numero = 0;
        piso = 0;
        prexnoc = 0;
        cantpers = 0;
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
