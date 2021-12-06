package Servicios;

import Entidades.Factura;
import Entidades.Llamada;

import java.util.List;
import java.util.Scanner;

public class FacturaServicio {

    Scanner s = new Scanner(System.in).useDelimiter("\n");

    static FacturaServicio facturaServicio;

    public static FacturaServicio getInstance(){
        if (facturaServicio == null){
            facturaServicio = new FacturaServicio();
        }
        return facturaServicio;
    }


    public void facturar(){
        int mes = 0;
        do {
            System.out.println("Ingrese el número de mes que desea facturar");
            mes = s.nextInt();
            if (mes < 1 || mes > 12){
                System.out.println("Por favor, ingrese un mes válido");
            }
        } while (mes < 1 || mes > 12);

        List<Llamada> llamadas = LlamadaServicio.getInstance().getLlamadas();
        Factura f = new Factura();
        double subtotalLocal = 0;
        double subtotalExterior = 0;
        for (Llamada llamada: llamadas) {
            if (llamada.getFecha().getMonthValue() == mes){
                if (llamada.getTipo().getNombreTipoLlamada().equalsIgnoreCase("Local")){
                    f.addLlamadasLocales(llamada);
                    subtotalLocal += llamada.getCosto();
                } else {
                    f.addLlamadasExterior(llamada);
                    subtotalExterior += llamada.getCosto();
                }

            }
        }

        double total = f.getAbonoMensual() + subtotalExterior + subtotalLocal;

        f.setTotal(total);

        System.out.println("------FACTURA DE " + this.obtenerMes(mes).toUpperCase() + "-------");
        System.out.println("Número de llamadas Totales: " + (f.getLlamadasExterior().size() + f.getLlamadasLocales().size()));
        System.out.println("Llamadas Locales: ");
        for (Llamada l: f.getLlamadasLocales()) {
            System.out.println(l.toString());
        }
        System.out.println("Subtotal de llamadas locales: " + subtotalLocal);
        System.out.println("--------");
        System.out.println("Llamadas Exterior: ");
        for (Llamada l: f.getLlamadasExterior()) {
            System.out.println(l.toString());
        }
        System.out.println("Subtotal de llamadas exterior: " + subtotalExterior);
        System.out.println("------------------");
        System.out.println("Subtotal de llamadas:" + (subtotalExterior + subtotalLocal));
        System.out.println("------------------");
        System.out.println("Abono Mensual: " + f.getAbonoMensual());

        System.out.println("-- TOTAL -- " + "\n" + f.getTotal());

    }


    public String obtenerMes(int mes){
        switch (mes){
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
        }
        return null;
    }


}
