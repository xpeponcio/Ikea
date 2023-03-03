package ikea;
import java.util.ArrayList;;
public class Tienda {
    ArrayList<Producto> productos = new ArrayList<Producto>();

    public void agregarProducto(Producto prlist){
        this.productos.add(prlist);
    }

    public void mostrarProducto(){
        for(int i = 0; i < this.productos.size();i++){
            System.out.println(this.productos.get(i).ToString());
        }
    }
}
