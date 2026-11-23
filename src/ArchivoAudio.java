public class ArchivoAudio extends Archivo {
    private int bitrateKbps;

    public ArchivoAudio(String nombre, double tamanoMB, int bitrateKbps) {
        super(nombre, tamanoMB);
        this.bitrateKbps = bitrateKbps;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 0.90; // Normalización reduce 10%
    }

    @Override
    public String mostrarInformacion() {
        return "[AUDIO] " + super.mostrarInformacion() + " | Bitrate: " + bitrateKbps + " kbps | Procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB";
    }
}