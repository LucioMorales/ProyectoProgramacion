package proyectoprogramacion;

public class Reserva {
    private int dni;
    private int numero;
    private int tiempo;

    public Reserva(int dni, int numero, int tiempo) {
        this.dni = dni;
        this.numero = numero;
        this.tiempo = tiempo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Reserva: " + "DNI: " + dni + ", Numero de habitacion: " + numero + ", Tiempo: " + tiempo;
    }
}
