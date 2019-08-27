package proyectoprogramacion;


public class Huesped {
    private String nombre;
    private int dni;
    private int edad;
    private String email;

    public Huesped(String nombre, int dni, int edad, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.email = email;
    }
    
    public Huesped() {
        nombre = "";
        dni = 0;
        edad = 0;
        email = "";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Edad: " + edad + ", Email: " + email;
    }
}
