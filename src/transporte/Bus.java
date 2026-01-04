package transporte;

class Bus extends Transporte {
    public Bus(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void desplazarse() {
        System.out.println(" -> El BUS viaja por carretera transportando pasajeros.");
    }
}