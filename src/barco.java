/**
 La clase "Barco" implementa la interfaz "Transporte" y proporciona métodos para calcular el coste total del envío y determinar el tipo de embalaje para el transporte en barco.
 */

public class barco implements transporte{
    public static final int palet=1;
    public static final int envoltorio_carton=2;
    public static final int caja_madera=3;

    /**
     Método que calcula el coste total del envío en barco.
     @param cp El código postal del destino.
     @return El coste total del envío en barco.
     */
    @Override
    public float costeTotal(int cp) {
        int enviar=0;
        if (cp>32001){
            System.out.println("tu envio se hara en barco a un coste de 100€");
            enviar=100;
        }else {
            System.out.println("tu envio se hara en barco a un coste de 500€");
            enviar=500;
        }
        return enviar;
    }


    /**
     Método que determina el tipo de embalaje para el transporte en barco.
     @param x El ancho del paquete.
     @param y La altura del paquete.
     @param z La longitud del paquete.
     @param peso El peso del paquete.
     @return El tipo de embalaje para el transporte en barco.
     */
    @Override
    public int tipoembalaje(Float x, Float y, Float z, Float peso) {
        int paquete=0;

        if (peso<=palet){
            System.out.println("Tu paquete va en un palet");
            paquete=1;
        }
        if (peso<=envoltorio_carton && peso>palet){
            System.out.println("Tu paquete se hara en envoltorio de carton");
            paquete=2;
        }
        if (peso<=caja_madera){
            System.out.println("Tu paquete se enviara en una caja de madera");
            paquete=3;
        }

        return paquete;
    }
}
