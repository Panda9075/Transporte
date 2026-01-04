package transporte;

class Helicoptero extends Transporte {
    public Helicoptero(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void desplazarse() {
        System.out.println(" -> El HELICÓPTERO vuela verticalmente y maniobra en el aire.");
    }
}
