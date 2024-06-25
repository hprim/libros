package VentaDeLibros;
public class


Libro {
    String nombre;
    String escritor;
    double cantidad; // Changed to double for better precision


    public Libro(String nombre, String escritor, double cantidad){
        this.nombre = nombre;
        this.escritor = escritor;
        this.cantidad = cantidad;
    }


    public void mostrarDetalles() {
        System.out.println("El nombre del libro es " + nombre + " y el escritor del libro es " + escritor + " con una cantidad de " + cantidad);
    }


    public void actualizarCantidad(double nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }
}


