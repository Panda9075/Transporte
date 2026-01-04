package util;

import negocio.Propietario;
import negocio.Vehiculo;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Utilitario util = new Utilitario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            util.menu();
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1 -> {
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();

                    util.agregarPropietario(cedula, nombre, telefono);
                    System.out.println("Propietario agregado\n");
                }

                case 2 -> {
                    System.out.print("Cedula del propietario: ");
                    String cedula = sc.nextLine();
                    Propietario p = util.buscarPropietario(cedula);

                    if (p == null) {
                        System.out.println("Propietario no encontrado\n");
                        break;
                    }

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Anio: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo de auto: ");
                    String tipo = sc.nextLine();
                    System.out.print("Traccion: ");
                    String traccion = sc.nextLine();

                    util.agregarAutomovil(marca, modelo, anio, p, tipo, traccion);
                    System.out.println("Automovil agregado\n");
                }

                case 3 -> {
                    System.out.print("Cedula del propietario: ");
                    String cedula = sc.nextLine();
                    Propietario p = util.buscarPropietario(cedula);

                    if (p == null) {
                        System.out.println("Propietario no encontrado\n");
                        break;
                    }

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Anio: ");
                    int anio = sc.nextInt();
                    System.out.print("Altura: ");
                    int altura = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo de encendido: ");
                    String encendido = sc.nextLine();

                    util.agregarMoto(marca, modelo, anio, p, altura, encendido);
                    System.out.println("Motocicleta agregada\n");
                }

                case 4 -> {
                    System.out.println("=== PROPIETARIOS ===");
                    System.out.println(util.listarPropietarios());
                }

                case 5 -> {
                    System.out.println("=== VEHICULOS ===");
                    System.out.println(util.listarVehiculos());
                }

                case 6 -> {
                    System.out.print("Marca a buscar: ");
                    String marca = sc.nextLine();

                    List<Vehiculo> lista = util.buscarVehiculoMarca(marca);

                    if (lista.isEmpty()) {
                        System.out.println("No existen vehiculos de esa marca\n");
                    } else {
                        for (Vehiculo v : lista) {
                            System.out.println(v);
                            System.out.println("----------------");
                        }
                    }
                }

                case 7 -> System.out.println("Saliendo del sistema...");

                default -> System.out.println("Opcion invalida\n");
            }

        } while (opcion != 7);

        sc.close();
    }
}
