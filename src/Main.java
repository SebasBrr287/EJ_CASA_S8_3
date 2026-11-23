//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    RepositorioArchivos repo = new RepositorioArchivos();

    System.out.print("¿Cuántos archivos deseas registrar?: ");
    int n = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < n; i++) {
        System.out.println("\nArchivo #" + (i + 1) + " - Tipo (1: Texto, 2: Imagen, 3: Video, 4: Audio): ");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("Nombre del archivo: ");
        String nombre = sc.nextLine();
        System.out.print("Tamaño (MB): ");
        double tam = Double.parseDouble(sc.nextLine());

        if (tipo == 1) {
            System.out.print("Cantidad de líneas: ");
            repo.agregarArchivo(new ArchivoTexto(nombre, tam, Integer.parseInt(sc.nextLine())));
        } else if (tipo == 2) {
            System.out.print("Resolución (ej. 1920x1080): ");
            repo.agregarArchivo(new ArchivoImagen(nombre, tam, sc.nextLine()));
        } else if (tipo == 3) {
            System.out.print("Duración en segundos: ");
            repo.agregarArchivo(new ArchivoVideo(nombre, tam, Integer.parseInt(sc.nextLine())));
        } else {
            System.out.print("Bitrate (kbps): ");
            repo.agregarArchivo(new ArchivoAudio(nombre, tam, Integer.parseInt(sc.nextLine())));
        }
    }

    System.out.println("\n" + repo.listarArchivos());
    System.out.println("Espacio total procesado: " + String.format("%.2f", repo.calcularTotalEspacioProcesado()) + " MB");
    sc.close();
}
