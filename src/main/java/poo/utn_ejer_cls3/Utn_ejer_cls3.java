package poo.utn_ejer_cls3;

import java.time.LocalDateTime;


public class Utn_ejer_cls3 {

    public static void main(String[] args) {
        
//      persona 
        Persona juan = new Persona("Juan","Rodriguez");
//        asigno la fecha de nacimiento manualmente 
        juan.fechaDeNacimiento= LocalDateTime.parse("1990-01-04T00:00:00");
      int edad = juan.nacimiento();
       
        System.out.println("Edad de Juan: "+edad);
//       carrito de compras con dueño (Persona)
       Carrito toledoCompras = new Carrito(juan);
       String duenioCarrito = toledoCompras.personaDelCarro.nombre;
       System.out.println("Él dueño del carrito es: "+duenioCarrito);
        
//     productos

        Productos milanesaSoja = new Productos("Milanesas de soja x4", 0232 , 350);
        Productos CocaCola = new Productos("Coca Cola", 3232 , 520);
        Productos pan = new Productos("Pan", 0032 , 120);
        
        Productos totalDeProductos[] = new Productos[3];
        totalDeProductos[0] = milanesaSoja;
        totalDeProductos[1] = CocaCola;
        totalDeProductos[2] = pan;
        
        
//        asigno el Array de productos al Carrito y muestro su valor total

        toledoCompras.productosArray = totalDeProductos;
        System.out.println("El valor total es: $"+ toledoCompras.valorTotal());
        
        
        
        
        
    }
}
