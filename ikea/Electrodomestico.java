package ikea;

public class Electrodomestico extends ProductoHogar{
    private enum eficienciaEnergetica{A,B,C,D,E,F};
    private eficienciaEnergetica eficiencia;

    Electrodomestico(String nombre, String descripcion, double precio, String material, String eficiencia){
        super(nombre, descripcion, precio, material);   
        this.eficiencia = eficienciaEnergetica.valueOf(eficiencia);     
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficienciaEnergetica.valueOf(eficiencia);
    }

    public eficienciaEnergetica getEficiencia() {
        return eficiencia;
    }

    public String ToString(){
        return "\n----------------" + "\nNombre: " + getNombre() + "\nDescripcion: " + getDescripcion() + "\nPrecio: " + getPrecio() + "\nMaterial: " + getMaterial() + "\nEficiencia: " + getEficiencia() + "\n----------------";
    }
}
