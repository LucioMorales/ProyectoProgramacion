package proyectoprogramacion;

public class Reserva {
    protected Huesped dni;
    protected Habitacion numero;
    protected String tiempo;

    public Reserva(Huesped dni, Habitacion numero, String tiempo) {
        this.dni = dni;
        this.numero = numero;
        this.tiempo = tiempo;
    }

    public Huesped getDni() {
        return dni;
    }

    public void setDni(Huesped dni) {
        this.dni = dni;
    }

    public Habitacion getNumero() {
        return numero;
    }

    public void setNumero(Habitacion numero) {
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
        return "Reserva: " + "DNI: " + dni + ", Numero de habitacion: " + numero + ", Tiempo: " + tiempo;
    }
}
