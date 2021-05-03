package entidades;

import java.util.Objects;

public class Cliente extends Directorios{

    private long dni;

    private String nombre;

    private String apellido;

    private String ciudad;

    private String domicilio;

    public Cliente(String nombre, String apellido, String ciudad, String direccion, long dni) {
        
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.domicilio = direccion;
        
    }

    public Cliente(long dni, String nombre, String apellido, String ciudad, String domicilio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return domicilio;
    }

    public void setDireccion(String direccion) {
        this.domicilio = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.apellido);
        return hash;
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
        
    
    
    
}
