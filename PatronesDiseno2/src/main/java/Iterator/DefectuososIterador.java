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
public class DefectuososIterador extends Iterador{
    
    public DefectuososIterador(List<Producto> c){
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
            if(catalogo.get(indice).getEstado().equals("Defectuoso"))return true;
            indice++;
        }
        
        return false;
    }
    
}
