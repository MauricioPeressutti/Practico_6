package entidades;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Directorios {
    
    private TreeMap<Long , Cliente> lista;

    public Directorios() {
        lista = new TreeMap<>() ;
    }
    
    

    public int agregarCliente(long x , Cliente c) {
        if(lista.put(x, c) == null){
            lista.put(x, c);
            return 1; 
        }else{
            return 0;
        }
    }

    public Cliente buscarCliente(long telefono) {
       if(lista.containsKey(telefono)){
           return lista.get(telefono);
       }else{
           return null;
       }
        
    }

    public Set<Long> buscarTelefono(String ape) {
       HashSet<Long> aux = new HashSet<>();
       
       
    }

    public List<Cliente> buscarClientes(String ciudad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int borrarCliente(long dni) {
        return 0;
    }
}
