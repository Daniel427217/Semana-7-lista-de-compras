package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        // Iniciamos creando un ArrayList para almacenar la lista de las compras
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) { // Iniciamos un bucle para el menu de opciones 
            // Mostramos al usuario las opciones disponibles 
            System.out.println("----------------------------------------------------------------");
            System.out.println("Opciones:");
            System.out.println("1. Agregar artículo");
            System.out.println("2. Eliminar artículo");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Finalizar compra");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt(); // Almacena la opcion seleccionada por el usuario

            if (opcion == 1) {
                System.out.print("Ingrese el nombre del artículo: ");
                String articulo = scanner.next(); 
                listaCompras.add(articulo); // Se agrega el elemento a la arraylist
            } 
            
            else if (opcion == 2) {
                System.out.print("Ingrese el nombre del artículo a eliminar: ");
                String articuloEliminar = scanner.next(); 
                boolean articuloEncontrado = false; 

                
                for (int i = 0; i < listaCompras.size(); i++) {
                    if (listaCompras.get(i).equals(articuloEliminar)) {
                        listaCompras.remove(i);
                        System.out.println("Artículo eliminado.");
                        articuloEncontrado = true;
                        break; 
                    }
                }
            
                if (!articuloEncontrado) {
                    System.out.println("Artículo no encontrado.");
                }
            } 
          
            else if (opcion == 3) {
                System.out.println("Lista de compras:");
                if (listaCompras.isEmpty()) {
                    System.out.println("La lista está vacía."); 
                } else {
                    for (String articulo : listaCompras) {
                        System.out.println(articulo); 
                    }
                }
            } 
           
            else if (opcion == 4) {
                System.out.println("Gracias por su compra!");
                break; // Con esta opción finalizamos el bucle y por ende termina la compra
            } 
            //Este apartado es por si se encuentra un error (usuario pone un numero fuera del de las opciones disponibles)
            else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close(); 
    }
}