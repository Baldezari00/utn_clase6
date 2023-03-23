
package poo.utn_ejer_cls3;


public class NoAplicableDescImportCero extends Exception {
    public NoAplicableDescImportCero(){
        System.out.println("No es posible aplicar descuento a importe 0");
    }
}


// tirar excepcion para arriba 
// poner en el catch la exception
// poner en el catch:    System.out.println(e.getMessage);