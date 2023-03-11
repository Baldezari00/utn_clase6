
package poo.utn_ejer_cls3;

import java.time.LocalDateTime;


public class Persona {
    public String nombre;
    public String apellido;
    public LocalDateTime fechaDeNacimiento;
    public int nacimiento(){
        
       return LocalDateTime.now().getYear() - fechaDeNacimiento.getYear();
        
    }

    

    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFecha() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    
    
    
}
