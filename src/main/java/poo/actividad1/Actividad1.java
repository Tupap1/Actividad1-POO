
package poo.actividad1;

/**
 *
 * @author Andres
 */
public class Actividad1 {

        public static void main(String[] args) {
        // Crear dop objetos Smartphone
        Smartphone miTelefono = new Smartphone("Snapdragon 8 Gen 1", 8, 6.5, "Negro", "123456789012345", "Android", 4500);
        Smartphone telefono2 = new Smartphone("Helio G99 Ultra", 12, 5.7, "Azul zafiro", "987654321", "Windows Phone", 6000);
        // Observar el estado inicial del primer objeto
        System.out.println("\n--- Estado Inicial ---");
        System.out.println(miTelefono.ObtenerInfo());

        //ahora probare todos los metodos
        // Intentar llamar (está apagado)
        System.out.println("\n--- Intentando llamar (apagado) ---");
        miTelefono.Llamar();

        // Encender el teléfono
        System.out.println("\n--- Encendiendo ---");
        miTelefono.Encender();

        // Observar estado después de encender
        System.out.println("\n--- Estado Después de Encender ---");
        System.out.println(miTelefono.ObtenerInfo());

        // Realizar una llamada
        System.out.println("\n--- Realizando llamada ---");
        miTelefono.Llamar();
        System.out.println("Nivel de batería después de llamar: " + miTelefono.nivelBateriaPorcentaje + "%");

        // Tomar una foto
        System.out.println("\n--- Tomando foto ---");
        miTelefono.TomarFoto();
         System.out.println("Nivel de batería después de tomar foto: " + miTelefono.nivelBateriaPorcentaje + "%");


        // Verificar si necesita carga 
        //definimos esta variable para marcar el umbral
        int umbral = 15;
        
        System.out.println("\n--- Verificando si necesita carga (umbral " + umbral + "%) ---");
        if (miTelefono.necesitaCarga(umbral)) {
            System.out.println("El smartphone necesita ser cargado.");
        } else {
            System.out.println("El smartphone tiene suficiente batería.");
        }

        // Bajar la batería artificialmente para probar el necesitaCarga
        System.out.println("\n--- Bajando batería artificialmente ---");
        miTelefono.nivelBateriaPorcentaje = 15;
        System.out.println("Nivel de batería actual: " + miTelefono.nivelBateriaPorcentaje + "%");

         // Verificar si necesita carga de nuevo
        System.out.println("\n--- Verificando si necesita carga (umbral " + umbral + "%) ---");
        if (miTelefono.necesitaCarga(umbral)) {
            System.out.println("El smartphone necesita ser cargado.");
        } else {
            System.out.println("El smartphone tiene suficiente batería.");
        }


        // Cargar el teléfono
        System.out.println("\n--- Cargando el teléfono ---");
        miTelefono.Cargar();

        // Observar estado después de cargar
        System.out.println("\n--- Estado Después de Cargar ---");
        System.out.println(miTelefono.ObtenerInfo());

         // Verificar si necesita carga después de cargar
        System.out.println("\n--- Verificando si necesita carga (umbral " + umbral + "%) ---");
        if (miTelefono.necesitaCarga(umbral)) {
            System.out.println("El smartphone necesita ser cargado.");
        } else {
            System.out.println("El smartphone tiene suficiente batería.");
        }

        // Apagar el teléfono 
        System.out.println("\n--- Apagando ---");
        miTelefono.Apagar();

         // Observar estado después de apagar
        System.out.println("\n--- Estado Después de Apagar ---");
        System.out.println(miTelefono.ObtenerInfo());

        
        System.out.println(telefono2.ObtenerInfo());
        
    }
}
