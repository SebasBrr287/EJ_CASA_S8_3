import java.util.ArrayList;

public class RepositorioArchivos {
    private ArrayList<Archivo> archivos;

    public RepositorioArchivos() {
        this.archivos = new ArrayList<>();
    }

    public void agregarArchivo(Archivo a) {
        if (a != null) {
            archivos.add(a);
        }
    }

    public double calcularTotalEspacioProcesado() {
        double suma = 0;
        for (Archivo a : archivos) {
            suma += a.calcularEspacioProcesado();
        }
        return suma;
    }

    public String listarArchivos() {
        StringBuilder sb = new StringBuilder("=== REPOSITORIO DE ARCHIVOS ===\n");
        for (Archivo a : archivos) {
            sb.append(" - ").append(a.mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }
}
