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
public class DisponiblesIterador implements Iterador{
    private List<Producto> catalogo;
    private int indice = -1;
    
    public DisponiblesIterador(List<Producto> c){
        catalogo = c;
    } 
            
    @Override
    public Producto getNext() {
        if(!hasNext()) return null;
        Producto p = catalogo.get(++indice);
        while(!p.getEstado().equals("Disponible")){
            if(!hasNext()) return null;
            p = catalogo.get(++indice);
        }
        return p;
    }

    @Override
    public boolean hasNext() {
        return catalogo.size() > (indice + 1);
    }
    
}
