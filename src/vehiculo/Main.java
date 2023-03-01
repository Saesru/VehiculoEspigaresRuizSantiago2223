
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoEspigaresRuizSantiago2223 miVehiculoEspigaresRuizSantiago2223;
        int stockActual;
        
        miVehiculoEspigaresRuizSantiago2223 = new VehiculoEspigaresRuizSantiago2223("Seat",18000,100);
        stockActual = operaticaVehiculoEspigaresRuizSantiago2223(miVehiculoEspigaresRuizSantiago2223, 50); 
        System.out.println("El stock actual es "+ stockActual );
    }

    public static int operaticaVehiculoEspigaresRuizSantiago2223(VehiculoEspigaresRuizSantiago2223 miVehiculoEspigaresRuizSantiago2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoEspigaresRuizSantiago2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoEspigaresRuizSantiago2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoEspigaresRuizSantiago2223.obtenerStock();
        return stockActual;
    }

}
    
