package Servicios;

import Entidades.NoLocal;

import java.util.ArrayList;
import java.util.List;


/*
*  SERVICIO EL CUAL FUNCIONARÁ PRINCIPALMENTE COMO CONTENEDOR DE LOS DATOS DE PAISES Y PROVINCIAS
* */
public class NoLocalServicio {

    static NoLocalServicio noLocalServicioInstance;

    List<NoLocal> paisesOprovincias = new ArrayList<NoLocal>(){
        {
            add(new NoLocal("España", 0.10));
            add(new NoLocal("Estados Unidos", 0.10));
            add(new NoLocal("Australia", 0.20));
            add(new NoLocal("Mendoza",0.05));
            add(new NoLocal("Buenos Aires",0.10));
            add(new NoLocal("Cordoba",0.15));

        }
    };

    public static NoLocalServicio getInstance(){ //usamos SINGLETON para no tener que crear muchas instancias de este servicio
        if (noLocalServicioInstance == null){
            noLocalServicioInstance = new NoLocalServicio();
        }
        return noLocalServicioInstance;
    }


    //CON EXTERIOR NOS REFERIMOS TANTO NACIONAL COMO INTERNACIONAL
    public List<NoLocal> getUbicacionesExterior(){
        return paisesOprovincias;
    }

}
