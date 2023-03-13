public class camion implements transporte {
    public static final int palet=1;
    public static final int envoltorio_carton=2;
    public static final int caja_madera=3;


    @Override
    public float costeTotal(int cp) {
        int dinero;
        if (cp<32001){
            System.out.println("tu envio se hara en camion a un coste de 5€");
            dinero=5;
        }else {
            System.out.println("tu envio se hara en camion a un coste de 10€");
            dinero=10;
        }
        return dinero ;
    }

    @Override
    public int tipoembalaje(Float x, Float y, Float z, Float peso) {
        int envio = 0;
        if (peso<=palet){
            System.out.println("Tu paquete va en un palet");
            envio=1;
        }
        if (peso<=envoltorio_carton && peso>palet ){
            System.out.println("Tu paquete se hara en envoltorio de carton");
            envio=2;
        }
        if (peso>caja_madera){
            System.out.println("Tu paquete se enviara en una caja de madera");
            envio=3;
        }
        return envio;
    }
}
