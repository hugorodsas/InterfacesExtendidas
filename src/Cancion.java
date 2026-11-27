public class Cancion implements Multimedia {

    @Override
    public void grabar() {
        System.out.println("Grabano cancion...");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo cancion...");
    }
}
