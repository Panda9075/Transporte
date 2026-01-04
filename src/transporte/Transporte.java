package transporte;

public abstract class Transporte {
    protected String marca;
    protected String modelo;
    protected double precio;

    public Transporte(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Vehículo: " + marca + " " + modelo + " | Precio: $" + precio);
    }

    public abstract void desplazarse();
}