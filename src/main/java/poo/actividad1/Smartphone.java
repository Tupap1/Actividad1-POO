package poo.actividad1;

/**
 *
 * @author Andres
 */

public class Smartphone {

    // Propiedades 
    String procesador;
    int gbRam;
    double tamañoPulgadas;
    String color;
    String imei;
    String sistemaOperativo;
    int capacidadBateriaMah; // Capacidad máxima en mAh
    boolean estado; // true si está encendido, false si está apagado
    int nivelBateriaPorcentaje; // Nivel actual de bateria en porcentaje 

    // Constructor para inicializar un objeto Smartphone, para creaar objetos 
    public Smartphone(String procesador, int gbRam, double tamañoPulgadas, String color, String imei, String sistemaOperativo, int capacidadBateriaMah) {
        this.procesador = procesador;
        this.gbRam = gbRam;
        this.tamañoPulgadas = tamañoPulgadas;
        this.color = color;
        this.imei = imei;
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadBateriaMah = capacidadBateriaMah;
        this.estado = false; 
        this.nivelBateriaPorcentaje = 50; // este es un valor generico
        System.out.println("Smartphone " + this.color + " creado."); // esta alerta para poder saber que se creo el objeto
    }

    // Métodos

    
    //Permite realizar una llamada si el teléfono está encendido y tiene batería.
    
    public void Llamar() {
        if (this.estado && this.nivelBateriaPorcentaje > 5) { // Requiere estar encendido y con algo de batería
            System.out.println("Realizando llamada desde " + this.sistemaOperativo + "...");
            this.nivelBateriaPorcentaje -= 5; // Consume batería al llamar
            System.out.println("Nivel de batería actual: " + this.nivelBateriaPorcentaje + "%");
        } else if (!this.estado) {
            System.out.println("No se puede llamar. El smartphone está apagado.");
        } else {
            System.out.println("No se puede llamar. Batería demasiado baja.");
        }
    }

    
     //Metodo que permite aumentar la propiedad nivel de bateria.

    public void Cargar() {
        System.out.println("Iniciando carga...");
        // Simulamos la carga aumentando el nivel de batería hasta la capacidad máxima
        while (this.nivelBateriaPorcentaje < 100) {
            this.nivelBateriaPorcentaje++;
        }
        System.out.println("Carga completa. Nivel de batería: " + this.nivelBateriaPorcentaje + "%");
    }

    
     // Metodo para cambiar la Propiedad estado a true.
     
    public void Encender() {
        if (!this.estado) {
            this.estado = true;
            System.out.println("El smartphone se ha encendido.");
        } else {
            System.out.println("El smartphone ya está encendido.");
        }
    }

    
    // Metodo para cambiar la Propiedad estado a false. 
    
    public void Apagar() {
         if (this.estado) {
            this.estado = false;
            System.out.println("El smartphone se ha apagado.");
        } else {
            System.out.println("El smartphone ya está apagado.");
        }
    }


     // Metodo que devuelve las propiedades del objeto en un String.

    public String ObtenerInfo() {
        return "--- Información del Smartphone ---\n" +
               "Procesador: " + this.procesador + "\n" +
               "GB de Ram: " + this.gbRam + "\n" +
               "Tamaño: " + this.tamañoPulgadas + " pulgadas\n" +
               "Color: " + this.color + "\n" +
               "IMEI: " + this.imei + "\n" +
               "Sistema Operativo: " + this.sistemaOperativo + "\n" +
               "Capacidad de Batería: " + this.capacidadBateriaMah + " mAh\n" +
               "Estado: " + (this.estado ? "Encendido" : "Apagado") + "\n" +
               "Nivel de Batería: " + this.nivelBateriaPorcentaje + "%\n" +
               "-----------------------------------";
    }

    
     //Metodo para tomar fotos si el teléfono está encendido y tiene batería.
   
    public void TomarFoto() {
         if (this.estado && this.nivelBateriaPorcentaje > 2) { // Requiere estar encendido y con algo de batería
            System.out.println("Tomando foto...");
            this.nivelBateriaPorcentaje -= 2; // Consume un poco de batería
            System.out.println("Nivel de batería actual: " + this.nivelBateriaPorcentaje + "%");
        } else if (!this.estado) {
            System.out.println("No se puede tomar foto. El smartphone está apagado.");
        } else {
            System.out.println("No se puede tomar foto. Batería demasiado baja.");
        }
    }

    //Metodo adicional para saber si el telefono necesita carga, como parametro tiene umbralProncentaje
    public boolean necesitaCarga(int umbralPorcentaje) {
        return this.nivelBateriaPorcentaje < umbralPorcentaje;
    }


}