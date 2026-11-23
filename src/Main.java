//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    RepositorioArchivos repo = new RepositorioArchivos();

    repo.agregarArchivo(new ArchivoTexto("README.md", 1.2, 150));
    repo.agregarArchivo(new ArchivoTexto("Main.java", 0.5, 85));
    repo.agregarArchivo(new ArchivoImagen("diagrama_uml.png", 4.0, "1920x1080"));
    repo.agregarArchivo(new ArchivoImagen("mockup_figma.jpg", 6.5, "3840x2160"));
    repo.agregarArchivo(new ArchivoVideo("demo_app.mp4", 120.0, 95));
    repo.agregarArchivo(new ArchivoVideo("pitch_equipo.mp4", 250.0, 300));
    repo.agregarArchivo(new ArchivoAudio("podcast_tech.mp3", 15.0, 320)); // Desafío

    System.out.println(repo.listarArchivos());
    System.out.println("Espacio total procesado: " + String.format("%.2f", repo.calcularTotalEspacioProcesado()) + " MB");
}
