package ikea;

public class Mueble extends ProductoHogar{
    private String tipoDeMueble;

    Mueble(String nombre, String descripcion, double precio, String material, String tipoDeMueble){
        super(nombre, descripcion, precio, material);
        this.tipoDeMueble = tipoDeMueble;
    }

    public void setTipoDeMueble(String tipoDeMueble) {
        this.tipoDeMueble = tipoDeMueble;
    }

    public String getTipoDeMueble() {
        return tipoDeMueble;
    }

    public String ToString(){
        return "\n----------------" + "\nNombre: " + getNombre() + "\nDescripcion: " + getDescripcion() + "\nPrecio: " + getPrecio() + "\nMaterial: " + getMaterial() + "\nTipo de Mueble: " + getTipoDeMueble() + "\n----------------";
    }
}
