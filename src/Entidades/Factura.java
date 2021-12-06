package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private List<Llamada> llamadasLocales = new ArrayList<>();
    private List<Llamada> llamadasExterior = new ArrayList<>();
    private static double abonoMensual = 20;
    private double total = 0;

    public Factura() {
    }

    public Factura(List<Llamada> llamadasLocales, List<Llamada> llamadasExterior, double abonoMensual, double total) {
        this.llamadasLocales = llamadasLocales;
        this.llamadasExterior = llamadasExterior;
        this.abonoMensual = abonoMensual;
        this.total = total;
    }

    public List<Llamada> getLlamadasLocales() {
        return llamadasLocales;
    }

    public void setLlamadasLocales(List<Llamada> llamadasLocales) {
        this.llamadasLocales = llamadasLocales;
    }

    public List<Llamada> getLlamadasExterior() {
        return llamadasExterior;
    }

    public void setLlamadasExterior(List<Llamada> llamadasExterior) {
        this.llamadasExterior = llamadasExterior;
    }

    public double getAbonoMensual() {
        return abonoMensual;
    }

    public void setAbonoMensual(double abonoMensual) {
        this.abonoMensual = abonoMensual;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addLlamadasLocales(Llamada llamada) {
        this.llamadasLocales.add(llamada);
    }

    public void addLlamadasExterior(Llamada llamada) {
        this.llamadasExterior.add(llamada);
    }

}
