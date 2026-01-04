package util;

import negocio.Automovil;
import negocio.Motocicleta;
import negocio.Propietario;
import negocio.Vehiculo;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Utilitario util = new Utilitario();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            util.menu();
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (op) {

                // 1. Ingresar propietario
                case 1 -> {
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();

                    util.agregarPropietario(cedula, nombre, telefono);
                    System.out.println("Propietario ingresado\n");
                }

                // 2. Ingresar automovil
                case 2 -> {
                    System.out.print("Cedula propietario: ");
                    String cedula = sc.nextLine();
                    Propietario p = util.buscarPropietario(cedula);

                    if (p == null) {
                        System.out.println("Propietario no existe\n");
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

                // 3. Ingresar moto
                case 3 -> {
                    System.out.print("Cedula propietario: ");
                    String cedula = sc.nextLine();
                    Propietario p = util.buscarPropietario(cedula);

                    if (p == null) {
                        System.out.println("Propietario no existe\n");
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
                    System.out.print("Encendido: ");
                    String encendido = sc.nextLine();

                    util.agregarMoto(marca, modelo, anio, p, altura, encendido);
                    System.out.println("Motocicleta agregada\n");
                }

                // 4. Mostrar propietarios
                case 4 -> {
                    System.out.println("=== PROPIETARIOS ===");
                    System.out.println(util.listarPropietarios());
                }

                // 5. Mostrar vehiculos
                case 5 -> {
                    System.out.println("=== VEHICULOS ===");
                    System.out.println(util.listarVehiculos());
                }

                // 6. Buscar por marca
                case 6 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    List<Vehiculo> lista = util.buscarVehiculoMarca(marca);

                    if (lista.isEmpty()) {
                        System.out.println("No existen vehiculos\n");
                    } else {
                        for (Vehiculo v : lista) {
                            System.out.println(v);
                            System.out.println("-------------");
                        }
                    }
                }

                // 7. Mostrar solo automoviles
                case 7 -> {
                    System.out.println("=== AUTOMOVILES ===");
                    for (Vehiculo v : util.buscarVehiculoMarca("")) {
                        if (v instanceof Automovil) {
                            System.out.println(v);
                            System.out.println("-------------");
                        }
                    }
                }

                // 8. Mostrar solo motos
                case 8 -> {
                    System.out.println("=== MOTOCICLETAS ===");
                    for (Vehiculo v : util.buscarVehiculoMarca("")) {
                        if (v instanceof Motocicleta) {
                            System.out.println(v);
                            System.out.println("-------------");
                        }
                    }
                }

                // 9. Ver traccion (solo autos)
                case 9 -> {
                    System.out.println("=== TRACCION DE AUTOMOVILES ===");
                    for (Vehiculo v : util.buscarVehiculoMarca("")) {
                        if (v instanceof Automovil a) {
                            System.out.println("Modelo: " + a.getModelo() +
                                    " | Traccion: " + a.getTraccion());
                        }
                    }
                }

                // 10. Matricular
                case 10 -> {
                    System.out.print("Cedula propietario: ");
                    String cedula = sc.nextLine();
                    System.out.print("Modelo vehiculo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Anio vehiculo: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    int valor = util.matricular(cedula, modelo, anio);

                    if (valor == 0) {
                        System.out.println("Vehiculo no encontrado\n");
                    } else {
                        System.out.println("Valor matricula: $" + valor + "\n");
                    }
                }

                // 11. Salir
                case 11 -> System.out.println("Saliendo del sistema...");

                default -> System.out.println("Opcion invalida\n");
            }

        } while (op != 11);

        sc.close();
    }
}
