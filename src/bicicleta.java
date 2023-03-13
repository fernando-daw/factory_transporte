public class bicicleta implements transporte {
    public static final int palet=1;
    public static final int envoltorio_carton=2;
    public static final int caja_madera=3;


    @Override
    public float costeTotal(int cp) {
        int envio=0;

        if (cp<32001){
            System.out.println("tu envio se hara en bicicleta a un coste de 2€");
            envio=2;
        }else {
            System.out.println("tu envio se hara en bicicleta a un coste de 5€");
            envio=5;
        }

        return envio;
    }

    @Override
    public int tipoembalaje(Float x, Float y, Float z, Float peso) {
        int envoltorio=0;

        if (peso<=palet){
            System.out.println("Tu paquete va en un palet");
            envoltorio=1;
        }
        if (peso<=envoltorio_carton && peso>palet){
            System.out.println("Tu paquete se hara en envoltorio de carton");
            envoltorio=2;
        }
        if (peso<=caja_madera){
            System.out.println("Tu paquete se enviara en una caja de madera");
            envoltorio=3;
        }

        return envoltorio;
    }
}
