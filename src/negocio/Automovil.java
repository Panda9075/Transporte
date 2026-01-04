package negocio;

public class Automovil extends Vehiculo{
    private String tipodeauto;
    private  String traccion;

    public Automovil(String marca, String modelo, int anio, Propietario propietario, String tipodeauto, String traccion) {
        super(marca, modelo, anio, propietario);
        this.tipodeauto = tipodeauto;
        this.traccion = traccion;
    }

    public String getTipodeauto() {
        return tipodeauto;
    }

    public void setTipodeauto(String tipodeauto) {
        this.tipodeauto = tipodeauto;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return super.toString()+
                "tipo:" + tipodeauto+
                "\ntraccion='" + traccion;
    }
}
