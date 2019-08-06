package proyectoprogramacion;

public class Huesped {
    protected int NOMBRE;
    protected int DNI;
    protected int EDAD;
    protected String EMAIL;

    public Huesped(int NOMBRE, int DNI, int EDAD, String EMAIL) {
        this.NOMBRE = NOMBRE;
        this.DNI = DNI;
        this.EDAD = EDAD;
        this.EMAIL = EMAIL;
    }

    public int getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(int NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    @Override
    public String toString() {
        return "Nombre: " + NOMBRE + ", DNI: " + DNI + ", Edad: " + EDAD + ", Email: " + EMAIL;
    }
}
