package Entidades;

/*
*  CLASE PARA INDICAR CUALQUIER LOCALIDAD/PAIS, una llamada que no es local, es decir que es nacional o internacional
* */

public class NoLocal {

    private String nombre;
    private double costoExtra;

    public NoLocal(String nombre, double costoExtra) {
        this.nombre = nombre;
        this.costoExtra = costoExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoExtra() {
        return costoExtra;
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }

    @Override
    public String toString() {
        return "Llamada Exterior{" +
                " Dirigida a : --'" + nombre + "--" +
                " -- Costo Extra: " + costoExtra +
                '}';
    }
}
