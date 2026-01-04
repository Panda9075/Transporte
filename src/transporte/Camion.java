package transporte;

class Camion extends Transporte {
    public Camion(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    @Override
    public void desplazarse() {
        System.out.println(" -> El CAMIÓN viaja por carretera transportando carga pesada.");
    }
}
