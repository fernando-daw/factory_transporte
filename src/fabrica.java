public class fabrica {
    public static final int bici=1;
    public static final int camion=2;

public static transporte getProducto (int envio) {
    switch (envio){
        case bici:
            return new bicicleta();
        case camion:
            return new camion();
        default:
            return null;
    }
}

}
