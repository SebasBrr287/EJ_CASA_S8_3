
public class ArchivoVideo extends Archivo {
    private int duracionSegundos;

    public ArchivoVideo(String nombre, double tamanoMB, int duracionSegundos) {
        super(nombre, tamanoMB);
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.50; // Transcodificación y caché aumentan 50%
    }

    @Override
    public String mostrarInformacion() {
        return "[VIDEO] " + super.mostrarInformacion() + " | Duración: " + duracionSegundos + "s | Procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB";
    }
}
