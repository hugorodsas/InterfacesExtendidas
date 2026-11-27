void main() {
    Cancion cancion = new Cancion();
    Telefono telefono = new Telefono();

    telefono.conectar();

    Grabable grabable = cancion;
    Reproducible reproducir = cancion;
    Multimedia multimedia = cancion;

    grabable.grabar();
    reproducir.reproducir();

    multimedia.grabar();
    multimedia.reproducir();

}
