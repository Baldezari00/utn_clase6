
package poo.utn_ejer_cls3;

public abstract class Descuento {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public abstract float descuento(float valorBase);
    public abstract float valorFinal(float valorBase);


}
