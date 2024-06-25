package VentaDeLibros;


public class libros{
    public static void main(String[] args) {
        Libro libro1 = new Libro("Alicia en el pais de las maravillas", "Lewis Carroll", 50.30);
        libro1.mostrarDetalles();

        libro1.actualizarCantidad(55.00);
        libro1.mostrarDetalles();
    }
}
