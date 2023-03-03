package ikea;

public class Test {
    public static void main(String[] args) {
        Mueble m1 = new Mueble("KALLAX", "Expón tus objetos favoritos en los estantes abiertos o añade accesorios para crear una solución personalizada con almacenaje cerrado.", 59, "madera", "Estanteria");
        ArticuloDeDecoracion a1 = new ArticuloDeDecoracion("FORSÅ", "Proporciona una luz dirigida, perfecta para leer.Brazo y pantalla regulables para poder dirigir la luz a donde quieras.", 4.99, "metal");

        Tienda t1 = new Tienda();

        t1.agregarProducto(m1);
        t1.agregarProducto(a1);

        t1.mostrarProducto();
    }
}
