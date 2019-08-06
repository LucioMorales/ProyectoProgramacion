package proyectoprogramacion;

public class Reserva {
    protected int nombre;
    protected int numero;
    protected String tiempo;

    public Reserva(int nombre, int numero, String tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tiempo = tiempo;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Reserva: " + "Nombre: " + nombre + ", Numero: " + numero + ", Tiempo: " + tiempo;
    }
}
