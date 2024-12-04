/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Producto {
    private String nombre;
    private List<String> tiendas;
    private String estado;
    
    public Producto(String n, List<String> t, String e){
        nombre = n;
        tiendas = new ArrayList<>(t);
        estado = e;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public List<String> getTiendas(){
        return tiendas;
    }
    
    public String getEstado(){
        return estado;
    }
    
    @Override
    public String toString(){
        String texto = "Nombre: " + nombre;
        texto += " | Estado: " + estado;
        texto += " | Disponible en: - ";
        for(String tienda : tiendas) texto += tienda + " - ";
        
        return texto;
    }
}
