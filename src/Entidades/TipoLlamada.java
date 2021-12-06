package Entidades;

public class TipoLlamada {

    private String nombreTipoLlamada;
    /*
        en caso de que sea una llamada internacional o nacional, va a tener un atributo 'NoLocal'
        el cual va a corresponder a un pais/provincia, el cual tendra su respectivo costo EXTRA
     */
    private NoLocal pais;

    public TipoLlamada() {
    }

    public TipoLlamada(String nombreTipoLlamada) {
        this.nombreTipoLlamada = nombreTipoLlamada;
    }

    public TipoLlamada(String nombreTipoLlamada, NoLocal pais) {
        this.nombreTipoLlamada = nombreTipoLlamada;
        this.pais = pais;
    }

    public NoLocal getPais() {
        return pais;
    }

    public void setPais(NoLocal pais) {
        this.pais = pais;
    }

    public String getNombreTipoLlamada() {
        return nombreTipoLlamada;
    }

    public void setNombreTipoLlamada(String nombreTipoLlamada) {
        this.nombreTipoLlamada = nombreTipoLlamada;
    }

    @Override
    public String toString() {
        if (!nombreTipoLlamada.equalsIgnoreCase("Local")) {
            return
                    "Tipo de llamada: '" + nombreTipoLlamada + '\'' +
                    " -- " + pais.toString() +
                    '}';
        } else {
            return
                    "TipoLlamada='" + nombreTipoLlamada;

        }
    }
}
