/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Iterator;

import java.util.List;

/**
 *
 * @author CltControl
 */
public abstract class Iterador {
    protected List<Producto> catalogo;
    protected int indice = 0;
    
    public Iterador(List<Producto> c){
        catalogo = c;
    }
    
    public abstract Producto getNext();
    public abstract boolean hasNext();
  
}
