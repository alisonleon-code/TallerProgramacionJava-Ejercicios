package proyectofinal;

import java.util.Scanner;

public class PROYECTOFINAL {

    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos desde la entrada
        Scanner scan = new Scanner(System.in);
        
        // Crear un objeto BoletoJS para gestionar los detalles de los boletos
        BoletoJS b = new BoletoJS(); 
        
        // Variables para el cálculo de los precios y descuentos
        double suma = 0, pf, desc = 0;
        int i;

        // Solicitar la cantidad de boletos a procesar
        System.out.print("Ingresa la cantidad de boletos: \n");
        b.setC(scan.nextInt());

        // Proceso para cada pasajero
        for (i = 0; i < b.getC(); i++) {
            // Crear un nuevo objeto BoletoJS para cada pasajero
            BoletoJS pasajero = new BoletoJS();  
            pasajero.setC(b.getC());             

            // Solicitar y asignar el nombre del pasajero
            System.out.print("Ingrese nombre de pasajero: \n");
            pasajero.setNombre(scan.next());

            // Selección de destino para el vuelo
            do {
                System.out.print("Selecciona el destino: [1]Cuzco [2]Arequipa [3]Iquitos [4]Tumbes \n");
                pasajero.setDest(scan.nextInt());
            } while (pasajero.getDest() < 1 || pasajero.getDest() > 4); // Asegurar que el destino esté dentro del rango válido

            // Obtener el precio y nombre del destino seleccionado
            pasajero.obtenerPrecioDestino();
            pasajero.obtenerNombreDestino();

            // Selección del tipo de boleto (clase del vuelo)
            do {
                System.out.print("Selecciona el tipo de boleto: [1]Basico [2]Turista [3]Primera clase \n");
                pasajero.setTipo(scan.nextInt());
            } while (pasajero.getTipo() < 1 || pasajero.getTipo() > 3); // Validar tipo de boleto

            // Obtener el aumento en el precio según el tipo de clase
            pasajero.obtenerAumentoClase();
            pasajero.obtenerNombreClase();

            // Selección del tipo de equipaje
            do {
                System.out.print("Selecciona el tipo de equipaje: [1]Sin equipaje [2]Equipaje de mano [3]Maleta [4]Ambos \n");
                pasajero.setEquipaje(scan.nextInt());
            } while (pasajero.getEquipaje() < 1 || pasajero.getEquipaje() > 4); // Validar tipo de equipaje

            // Si el equipaje seleccionado es una maleta o ambos, pedir el peso
            if (pasajero.getEquipaje() == 3 || pasajero.getEquipaje() == 4) {
                System.out.print("Ingrese el peso de la maleta (kg): \n");
                pasajero.setPeso(scan.nextDouble());
            }

            // Obtener el aumento por equipaje según el peso
            pasajero.obtenerAumentoEquipaje();
            pasajero.obtenerTipoEquipaje();
            
            // Calcular la suma total antes de aplicar el descuento
            pasajero.obtenerSumaTotal();
            
            // Calcular el descuento correspondiente basado en la cantidad de boletos comprados
            pasajero.obtenerDescuento();
            
            // Calcular el precio final después del descuento
            pasajero.obtenerPrecioFinal();

            // Mostrar un resumen de los detalles del boleto para el pasajero
            pasajero.mostrarResumen();
            pasajero.mostrarBoleta();

            // Sumar los totales de todos los pasajeros para el resumen global
            suma += pasajero.getSumatotal();
            desc += pasajero.getDesc();
        }

        // Calcular el precio final global después de los descuentos
        pf = suma - desc;

        // Mostrar un resumen general del costo de todos los boletos
        System.out.println("\n********************************************");
        System.out.println(" BOLETA DE VENTA JETSMART (RESUMEN GENERAL)");
        System.out.println("********************************************");
        System.out.printf("Precio total sin descuento: $%.2f\n", suma);
        System.out.printf("Descuento total aplicado: $%.2f\n", desc);
        System.out.println("-------------------------------------");
        System.out.printf("Precio final total a pagar: $%.2f\n", pf);
    }
}