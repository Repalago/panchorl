package panchorl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona {

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
        nombre = "Nombre por defecto";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        try {
            this.fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
        } catch (ParseException ex) {
            System.out.println("Ha petado: " + ex.getMessage());
            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int getEdad(){
        Date currentyear = new Date();
        Integer result = 0;
        if(fechaNacimiento != null){
            result = currentyear.getYear() - fechaNacimiento.getYear();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
}
