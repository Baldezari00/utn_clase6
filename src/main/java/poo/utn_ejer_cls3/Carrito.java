
package poo.utn_ejer_cls3;

import java.time.LocalDateTime;

public class Carrito {
    public Persona personaDelCarro;
    public Productos productosArray[];
    public LocalDateTime fechaDeCompra;
    
    public int valorTotal(){
    
        return productosArray[0].getPrecio() + productosArray[1].getPrecio() + productosArray[2].getPrecio();
    
    }
    
    
    

    public Carrito() {
    
    }

    public Carrito(Persona personaDelCarro) {
        this.personaDelCarro = personaDelCarro;
    }

    public Carrito(Persona personaDelCarro, Productos[] productosArray, LocalDateTime fechaDeCompra) {
        this.personaDelCarro = personaDelCarro;
        this.productosArray = productosArray;
        this.fechaDeCompra = fechaDeCompra;
    }

    
    

    
    public Persona getPersonaDelCarro() {
        return personaDelCarro;
    }

    public void setPersonaDelCarro(Persona personaDelCarro) {
        this.personaDelCarro = personaDelCarro;
    }

    public Productos[] getProductosArray() {
        return productosArray;
    }

    public void setProductosArray(Productos[] productosArray) {
        this.productosArray = productosArray;
    }

   

   

    public LocalDateTime getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDateTime fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }
    
    
    
}
