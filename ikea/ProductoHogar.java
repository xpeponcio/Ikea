package ikea;

public abstract class ProductoHogar extends Producto{
    private enum tipoDeMaterial{madera, metal, plastico};
    private tipoDeMaterial material;

    ProductoHogar(String nombre, String descripcion, double precio, String material){
        super(nombre, descripcion, precio);
        this.material = tipoDeMaterial.valueOf(material);
    }

    public void setMaterial(String material) {
        this.material = tipoDeMaterial.valueOf(material);
    }

    public tipoDeMaterial getMaterial() {
        return material;
    }

    public String ToString(){
        return "\n----------------" + "\nNombre: " + getNombre() + "\nDescripcion: " + getDescripcion() + "\nPrecio: " + getPrecio() + "\nMaterial: " + getMaterial() + "\n----------------";
    }
}
