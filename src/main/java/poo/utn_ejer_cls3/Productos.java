package poo.utn_ejer_cls3;

public class Productos {
    public String producto;
    public int codigo;
    public int precio;

    public Productos(String producto, int codigo, int precio) {
        this.producto = producto;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
