package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Llamada {
    private double costo;
    private double duracion; //en minutos
    private LocalDateTime fecha;
    private TipoLlamada tipo; //puede ser local, nacional o internacional

    public Llamada() {
    }

    public Llamada( double duracion, LocalDateTime fecha, TipoLlamada tipo) {
        this.duracion = duracion;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public TipoLlamada getTipo() {
        return tipo;
    }

    public void setTipo(TipoLlamada tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Llamada{" +
                " Costo total: " + costo +
                " - Duracion: " + duracion +
                " - Fecha: " + fecha +
                 " - " + tipo.toString() +
                '}';
    }
}
