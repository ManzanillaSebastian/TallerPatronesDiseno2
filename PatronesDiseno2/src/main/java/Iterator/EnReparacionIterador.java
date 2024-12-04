/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class EnReparacionIterador extends Iterador{
    
    public EnReparacionIterador(List<Producto> c){
        super(c);
    } 
            
    @Override
    public Producto getNext() {
        return catalogo.get(indice++);
    }

    @Override
    public boolean hasNext() {
        if (catalogo.size() <= (indice + 1)) return false;
        
        while (indice < catalogo.size()){
            if(catalogo.get(indice).getEstado().equals("En Reparacion"))return true;
            indice++;
        }
        
        return false;
    }
    
}
