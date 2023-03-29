public class Main {
    static transporte nuevo_envio;
    public static void main(String[] args) {
    nuevo_envio=fabrica.getProducto(fabrica.bici);
    nuevo_envio.costeTotal(24501);
    nuevo_envio.tipoembalaje(4F,8F,6F,10.5F);

nuevo_envio=fabrica.getProducto(fabrica.camion);
nuevo_envio.tipoembalaje(3.5F, 4.2F, 5.3F, 8F);
nuevo_envio.costeTotal(35006);

/*C*/
nuevo_envio=fabrica.getProducto(fabrica.barco);
nuevo_envio.tipoembalaje(5.5F,1F,9.8F,100F);
nuevo_envio.costeTotal(45025);

    }
}