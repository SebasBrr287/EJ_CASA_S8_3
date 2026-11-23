public class ArchivoImagen extends Archivo {
        private String resolucion;

        public ArchivoImagen(String nombre, double tamanoMB, String resolucion) {
            super(nombre, tamanoMB);
            this.resolucion = resolucion;
        }

        @Override
        public double calcularEspacioProcesado() {
            return getTamanoMB() * 1.15; // Metadatos y miniaturas añaden 15%
        }

        @Override
        public String mostrarInformacion() {
            return "[IMAGEN] " + super.mostrarInformacion() + " | Res: " + resolucion + " | Procesado: " + String.format("%.2f", calcularEspacioProcesado()) + " MB";
        }
    }
