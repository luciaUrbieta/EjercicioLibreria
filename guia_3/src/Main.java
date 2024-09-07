import Ejercicio_1.Autobus;
import Ejercicio_1.Bicicleta;
import Ejercicio_1.TipoTransporte;
import Ejercicio_1.Tranvia;
import Ejercicio_3.Auto;
import Ejercicio_3.Camion;
import Ejercicio_3.Vehiculo;

public class Main {
    public static void main(String[] args) {

        //1.
        /*
        Autobus autobus1 = new Autobus(23, 40, TipoTransporte.AUTOBUS);
        Tranvia tranvia1 = new Tranvia("Ruta 105",200, TipoTransporte.TRANVIA, 5);
        Bicicleta bicicleta1 = new Bicicleta("A4", TipoTransporte.BICICLETA, 3);

        System.out.println(autobus1.arrancar());
        System.out.println(tranvia1.arrancar());
        System.out.println(bicicleta1.arrancar());
        System.out.println(autobus1.detener());
        System.out.println(tranvia1.detener());
        System.out.println(bicicleta1.detener());
        System.out.println(autobus1.obtenerCapacidad());
        System.out.println(tranvia1.obtenerCapacidad());
        System.out.println(bicicleta1.obtenerCapacidad());

        // Se puede hacer un arreglo de interfaces

         */

        //2.
        /*

         */

        //3.

        Auto auto = new Auto("Toyota", "Etios", 360);
        auto.establecerCantidadPasajeros(5);

        Camion camion = new Camion("Fiat", "2002", 200);
        camion.establecerPesoMaximo(2600);

        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0]=auto;
        vehiculos[1]=camion;

        for(int i=0; i< vehiculos.length; i++){
            if(vehiculos[i]instanceof Auto){
                System.out.println(vehiculos[i].toString());
            }
            else if(vehiculos[i]instanceof Camion){
                System.out.println(vehiculos[i].toString());
            }
        }




    }
}