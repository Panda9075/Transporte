package transporte;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transporte> inventario = new ArrayList<>();

        inventario.add(new Bus("Mercedes", "Tourismo", 150000));
        inventario.add(new Camion("Volvo", "FH16", 120000));
        inventario.add(new Helicoptero("Bell", "407", 2500000));
        inventario.add(new Avion("Boeing", "737", 85000000));

        System.out.println("=== BIENVENIDO AL SISTEMA EL VIAJERO ===");
        System.out.println("Mostrando productos en vitrina:\n");

        for (Transporte t : inventario) {
            t.mostrarInformacion();
            t.desplazarse();
            System.out.println("-------------------------------");
        }
    }
}