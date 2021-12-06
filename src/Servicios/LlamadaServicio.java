package Servicios;

import Entidades.Llamada;
import Entidades.NoLocal;
import Entidades.TipoLlamada;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LlamadaServicio {

    static LlamadaServicio llamadaServicio;

    public static LlamadaServicio getInstance(){
        if (llamadaServicio == null){
            llamadaServicio = new LlamadaServicio();
        }
         return llamadaServicio;
    }


    public List<Llamada> getLlamadas(){
        List<Llamada> llamadas = new ArrayList<>();

        NoLocal buenosAires = null;
        NoLocal espania = null;

        for (NoLocal paisOprovincia: NoLocalServicio.getInstance().getUbicacionesExterior()) {
            if (paisOprovincia.getNombre().equalsIgnoreCase("Buenos Aires")){
                buenosAires = paisOprovincia;
            }
            if (paisOprovincia.getNombre().equalsIgnoreCase("España")){
                espania = paisOprovincia;
            }
        }

        Llamada l1 = new Llamada(2.5, LocalDateTime.of(2021, 12, 5, 15,30,00), new TipoLlamada("Nacional", buenosAires));
        Llamada l2 = new Llamada(29, LocalDateTime.of(2021, 12, 6, 8,30,00), new TipoLlamada("Internacional", espania));
        Llamada l3 = new Llamada(2, LocalDateTime.of(2021, 12, 7, 20,25,50), new TipoLlamada("Local"));

        this.setCostoFinal(l1);
        this.setCostoFinal(l2);
        this.setCostoFinal(l3);

        llamadas.add(l1);
        llamadas.add(l2);
        llamadas.add(l3);

        return llamadas;
    }


    public void setCostoFinal(Llamada l){

        TipoLlamada tipo = l.getTipo();
        double duracion = l.getDuracion();
        LocalDateTime fecha = l.getFecha();
        String dia = fecha.getDayOfWeek().toString();
        if (tipo.getNombreTipoLlamada().equalsIgnoreCase("Local")){

            if (!dia.equalsIgnoreCase("Saturday") && !dia.equalsIgnoreCase("Sunday") && fecha.getHour() >= 8 && fecha.getHour() < 20){
                l.setCosto(this.truncar(0.20*duracion));
            } else {
                l.setCosto(this.truncar(0.20*duracion));
            }
        } else {
            System.out.println(dia);
            if (!dia.equalsIgnoreCase("Saturday") && !dia.equalsIgnoreCase("Sunday") && fecha.getHour() >= 8 && fecha.getHour() < 20){
                l.setCosto(truncar(l.getTipo().getPais().getCostoExtra() + (0.20 * duracion)));
            } else {
                l.setCosto(truncar(l.getTipo().getPais().getCostoExtra() +(0.10 * duracion)));
            }
        }


    }

    public double truncar(double value){
        value = value * Math.pow(10, 2);
        value = Math.floor(value);
        value = value / Math.pow(10, 2);
        return value;
    }


}
