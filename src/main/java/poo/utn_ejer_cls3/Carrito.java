
package poo.utn_ejer_cls3;

import java.time.LocalDateTime;

public class Carrito {
    public Persona personaDelCarro;
    public Productos productosArray[];
    public LocalDateTime fechaDeCompra;

    public Descuento descuento;

    public int totalCompraBase = 0;


    

    
    
    

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
    
    
  public float valorTotal() throws NoAplicableDescImportCero, NoHayStock {

      if (productosArray[0] != null &&  productosArray[0].getStock() > 0) {

          totalCompraBase += productosArray[0].getPrecio();
      }else{

          throw new NoHayStock();
      }
      if (productosArray[1] != null &&  productosArray[0].getStock() > 0) {
          totalCompraBase += productosArray[1].getPrecio();
      }else{
          throw new NoHayStock();
      }
      if (productosArray[2] != null &&  productosArray[0].getStock() > 0) {
          totalCompraBase += productosArray[2].getPrecio();
      } else{
          throw new NoHayStock();
      }

      float totalConDescuento = 0;
      if (totalCompraBase > 0) {


          totalConDescuento = descuento.valorFinal(totalCompraBase);

      }

      if (totalConDescuento <= 0){
          throw new NoAplicableDescImportCero();

      }
      return totalConDescuento;

  }

}

