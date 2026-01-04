package transporte;

class Avion extends Transporte {
    public Avion(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void desplazarse() {
        System.out.println(" -> El AVIÓN vuela a gran altitud y velocidad entre aeropuertos.");
    }
}