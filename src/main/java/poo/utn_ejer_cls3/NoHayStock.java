package poo.utn_ejer_cls3;

public class NoHayStock extends Exception{
    Productos productos[];

    public Productos[] getProductos() {
        return productos;
    }

    public void setProductos(Productos[] productos) {
        this.productos = productos;
    }

    public NoHayStock(){
        System.out.println("No hay stock de al menos uno de los productos");
    }
}
