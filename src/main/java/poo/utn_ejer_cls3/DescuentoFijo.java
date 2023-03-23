
package poo.utn_ejer_cls3;

public class DescuentoFijo extends Descuento{

    @Override
    public float descuento(float valorBase) {
       return this.getValor();
    }

    @Override
    public float valorFinal(float valorBase) {
        return valorBase - this.descuento(valorBase);
    }
    
}
