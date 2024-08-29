package edu.misena.relacionClases.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el NIF del cliente: ");
        String nif = scanner.nextLine();
        Client client = new Client(nombre, nif);


        System.out.print("Ingrese el número de folio de la factura: ");
        int folio = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese una descripción de la factura: ");
        String descripcion = scanner.nextLine();
        Bill factura = new Bill( descripcion, client);


        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el código del producto nº " + (i + 1) + ": ");
            String codigo = scanner.nextLine();
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("--------------------------------------------------- ");
            Product producto = new Product(codigo, nombreProducto, precio);
            ItemBill itemBill = new ItemBill(producto, cantidad);
            factura.addItemBill(itemBill);

            System.out.println();
        }

        // Mostrar la factura
        System.out.println(factura);
        System.out.print("--------------------------------------------------- ");
    }
}
