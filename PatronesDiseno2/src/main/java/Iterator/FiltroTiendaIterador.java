/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.List;

/**
 *
 * @author sebsm
 */
public class FiltroTiendaIterador extends Iterador{
    private String tienda;
    
    public FiltroTiendaIterador(List<Producto> c, String t){
        super(c);
        tienda = t;
    }

    @Override
    public Producto getNext() {
        return catalogo.get(indice++);
    }

    @Override
    public boolean hasNext() {
        if (catalogo.size() <= (indice + 1)) return false;
        
        while (indice < catalogo.size()){
            if(catalogo.get(indice).getTiendas().contains(tienda))return true;
            indice++;
        }
        
        return false;
    }
}
