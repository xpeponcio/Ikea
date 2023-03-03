package ikea;

public abstract class Producto {
    private String nombre;
    private String descripcion;
    private double precio;

    Producto(String nombre, String descripcion, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String ToString(){
        return "\n----------------" + "\nNombre: " + getNombre() + "\nDescripcion: " + getDescripcion() + "\nPrecio: " + getPrecio() + "\n----------------";
    }
}

