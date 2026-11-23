// ArchivoTexto.java
public class ArchivoTexto extends Archivo {
    private int lineas;

    public ArchivoTexto(String nombre, double tamanoMB, int lineas) {
        super(nombre, tamanoMB);
        this.lineas = lineas;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 0.80; // Compresión de texto del 20%
    }

    @Override
    public String mostrarInformacion() {
        return "[TEXTO] " + super.mostrarInformacion() + " | Líneas: " + lineas + " | Procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB";
    }
}