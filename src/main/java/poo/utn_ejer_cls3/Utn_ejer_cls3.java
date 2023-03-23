package poo.utn_ejer_cls3;

import java.time.LocalDateTime;


public class Utn_ejer_cls3 {

    public static void main(String[] args) throws NoAplicableDescImportCero {
        
//      persona 
        Persona juan = new Persona("Juan","Rodriguez");
//        asigno la fecha de nacimiento manualmente 
        juan.fechaDeNacimiento= LocalDateTime.parse("1990-01-04T00:00:00");
      int edad = juan.nacimiento();
       
        System.out.println("Edad de Juan: "+edad);
//       carrito de compras con dueño (Persona)
       Carrito toledoCompras = new Carrito(juan);
       String duenioCarrito = toledoCompras.personaDelCarro.nombre;
       System.out.println("El dueño del carrito es: "+duenioCarrito);


//     productos

        Productos milanesaSoja = new Productos("Milanesas de soja x4", 0232 , 350,1);
        Productos CocaCola = new Productos("Coca Cola", 3232 , 520,0);
        Productos pan = new Productos("Pan", 0032 , 0,1);
        
        Productos totalDeProductos[] = new Productos[3];
        totalDeProductos[0] = milanesaSoja;
        totalDeProductos[1] = CocaCola;
        totalDeProductos[2] = pan;

//        asigno el Array de productos al Carrito

        toledoCompras.productosArray = totalDeProductos;

        


            // descuentos :
            Descuento descFijo = new DescuentoFijo();
            descFijo.setValor(1000);
            Descuento descPorcentaje = new DescuentoPorcentaje();
            descPorcentaje.setValor(0.5f);

            // agrego los descuentos al carrito
            toledoCompras.descuento = descFijo;







            try{
                // muestro el valor con descuento
                System.out.println("El valor final es: $" + toledoCompras.valorTotal());
            }catch (NoAplicableDescImportCero e){
                e.getMessage();
            } catch (NoHayStock e) {
                e.getMessage();
            }
    }
}
