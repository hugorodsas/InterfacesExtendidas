public class Telefono implements Wifi,Bluetooth{
    @Override
    public void conectar() {
        Wifi.super.conectar();

        System.out.println("Conexion realizada");
    }
}
