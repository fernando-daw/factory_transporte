public class fabrica {
    public static final int bici=1;
    public static final int camion=2;
    public static final int barco=3;

public static transporte getProducto (int envio) {
    switch (envio){
        case bici:
            return new bicicleta();
        case camion:
            return new camion();
        case barco:
            return new barco();
        default:
            return null;
    }
}

}
