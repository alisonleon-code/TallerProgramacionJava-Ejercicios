package proyectofinal;

// Clase que representa un boleto para un vuelo
public class BoletoJS {
    // Atributos de la clase que representan las características del boleto
    private int dest; // Destino del vuelo (1: Cuzco, 2: Arequipa, etc.)
    private double preciodestino; // Precio base del boleto dependiendo del destino
    private String nomdes; // Nombre del destino
    private int tipo; // Tipo de clase (1: Básico, 2: Turista, 3: Primera clase)
    private double aumentoclase; // Aumento en el precio por la clase seleccionada
    private String nomclase; // Nombre de la clase seleccionada
    private double aumentoequipaje; // Aumento en el precio por exceso de peso en el equipaje
    private int equipaje; // Tipo de equipaje seleccionado (1: Ninguno, 2: Mano, 3: Maleta, 4: Ambos)
    private double peso; // Peso del equipaje
    private String tipoequipaje; // Descripción del tipo de equipaje seleccionado
    private double sumatotal; // Suma total antes de aplicar descuentos
    private double desc; // Descuento aplicado
    private int C; // Cantidad de boletos comprados
    private double preciofinal; // Precio final después de aplicar el descuento
    private String nombre; // Nombre del cliente

    // Métodos getter y setter para acceder a los atributos de la clase
    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public double getPreciodestino() {
        return preciodestino;
    }

    public void setPreciodestino(double preciodestino) {
        this.preciodestino = preciodestino;
    }

    public String getNomdes() {
        return nomdes;
    }

    public void setNomdes(String nomdes) {
        this.nomdes = nomdes;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getAumentoclase() {
        return aumentoclase;
    }

    public void setAumentoclase(double aumentoclase) {
        this.aumentoclase = aumentoclase;
    }

    public String getNomclase() {
        return nomclase;
    }

    public void setNomclase(String nomclase) {
        this.nomclase = nomclase;
    }

    public double getAumentoequipaje() {
        return aumentoequipaje;
    }

    public void setAumentoequipaje(double aumentoequipaje) {
        this.aumentoequipaje = aumentoequipaje;
    }

    public int getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(int equipaje) {
        this.equipaje = equipaje;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoequipaje() {
        return tipoequipaje;
    }

    public void setTipoequipaje(String tipoequipaje) {
        this.tipoequipaje = tipoequipaje;
    }

    public double getSumatotal() {
        return sumatotal;
    }

    public void setSumatotal(double sumatotal) {
        this.sumatotal = sumatotal;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public double getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(double preciofinal) {
        this.preciofinal = preciofinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el precio según el destino
    public void obtenerPrecioDestino() {
        switch(dest){
            case 1: preciodestino = 75; break; // Cuzco
            case 2: preciodestino = 60; break; // Arequipa
            case 3: preciodestino = 48; break; // Iquitos
            case 4: preciodestino = 65; break; // Tumbes
            default: preciodestino = 0; break; // Si no es un destino válido
        }
    }

    // Método para obtener el nombre del destino según el código
    public void obtenerNombreDestino() {
        switch(dest){
            case 1: nomdes = "Cuzco"; break;
            case 2: nomdes = "Arequipa"; break;
            case 3: nomdes = "Iquitos"; break;
            case 4: nomdes = "Tumbes"; break;
            default: nomdes = "Desconocido"; break;
        }
    }

    // Método para calcular el aumento en el precio dependiendo de la clase seleccionada
    public void obtenerAumentoClase() {
        switch(tipo){
            case 1: aumentoclase = 0; break; // Clase Básica
            case 2: aumentoclase = preciodestino * 0.10; break; // Clase Turista
            case 3: aumentoclase = preciodestino * 0.25; break; // Primera Clase
            default: aumentoclase = 0; break; // Si no es una clase válida
        }
    }

    // Método para obtener el nombre de la clase seleccionada
    public void obtenerNombreClase() {
        switch (tipo) {
            case 1: nomclase = "Básico"; break;
            case 2: nomclase = "Turista"; break;
            case 3: nomclase = "Primera clase"; break;
            default: nomclase = "Desconocido"; break;
        }
    }

    // Método para calcular el aumento por equipaje según el peso
    public void obtenerAumentoEquipaje() {
        if((equipaje == 3 || equipaje == 4) && peso > 23)
            aumentoequipaje = (peso - 23) * 2; // Costo adicional por exceso de peso
        else
            aumentoequipaje = 0; // No hay aumento si el peso es adecuado
    }

    // Método para obtener el tipo de equipaje
    public void obtenerTipoEquipaje() {
        switch (equipaje) {
            case 1: tipoequipaje = "Sin Equipaje"; break;
            case 2: tipoequipaje = "Equipaje de Mano"; break;
            case 3: tipoequipaje = "Maleta"; break;
            case 4: tipoequipaje = "Ambos"; break;
            default: tipoequipaje = "Tipo de equipaje inválido"; break;
        }
    }

    // Método para calcular la suma total sin descuento
    public void obtenerSumaTotal() {
        sumatotal = preciodestino + aumentoclase + aumentoequipaje;
    }

    // Método para aplicar descuento según la cantidad de boletos comprados
    public void obtenerDescuento() {
        if(C > 2 && C < 5)
            desc = sumatotal * 0.05; // 5% de descuento
        else if(C >= 5 && C < 8)
            desc = sumatotal * 0.10; // 10% de descuento
        else if(C >= 8)
            desc = sumatotal * 0.15; // 15% de descuento
        else
            desc = 0; // Sin descuento
    }

    // Método para calcular el precio final aplicando el descuento
    public void obtenerPrecioFinal() {
        preciofinal = sumatotal - desc;
    }

    // Método para mostrar un resumen del boleto
    public void mostrarResumen() {
        System.out.print(nombre + " viajará a " + nomdes + " con boleto " + nomclase);
        System.out.print("\n");
        System.out.print("Equipaje: " + tipoequipaje);
        System.out.print("\n");
    }

    // Método para mostrar los detalles de la boleta de venta
    public void mostrarBoleta() {
        System.out.println("\n************************");
        System.out.println("BOLETA DE VENTA JETSMART");
        System.out.println("************************");
        System.out.printf("Precio total sin descuento: $%.2f\n", sumatotal);
        System.out.printf("Descuento aplicado: $%.2f\n", desc);
        System.out.println("-------------------------------------");
        System.out.printf("Precio final a pagar: $%.2f\n", preciofinal);
    }
}