public class Telefono implements Wifi,Bluetooth{
    @Override
    public void conectar() {
        Bluetooth.super.conectar();

        System.out.println("Conexion realizada");
    }
}
