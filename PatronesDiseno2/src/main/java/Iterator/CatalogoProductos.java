/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class CatalogoProductos implements CatalogoIterable{
    private List<Producto> catalogo;
    
    public CatalogoProductos(){
        catalogo = new ArrayList<>();

        catalogo.add(new Producto("Televisor", Arrays.asList("Tienda1", "Tienda2"), "Disponible"));
        catalogo.add(new Producto("Laptop", Arrays.asList("Tienda3"), "En Reparacion"));
        catalogo.add(new Producto("Celular", Arrays.asList("Tienda1", "Tienda3"), "Defectuoso"));
        catalogo.add(new Producto("Tablet", Arrays.asList("Tienda2", "Tienda3"), "Disponible"));
        catalogo.add(new Producto("Smartwatch", Arrays.asList("Tienda1"), "En Reparacion"));
        catalogo.add(new Producto("Auriculares", Arrays.asList("Tienda2", "Tienda3"), "Disponible"));
        catalogo.add(new Producto("Bocinas", Arrays.asList("Tienda1", "Tienda2"), "Defectuoso"));
        catalogo.add(new Producto("Cámara", Arrays.asList("Tienda1", "Tienda3"), "En Reparacion"));
        catalogo.add(new Producto("Impresora", Arrays.asList("Tienda2"), "Disponible"));
        catalogo.add(new Producto("Monitor", Arrays.asList("Tienda1", "Tienda2", "Tienda3"), "Disponible"));
        catalogo.add(new Producto("Router", Arrays.asList("Tienda3"), "Defectuoso"));
        catalogo.add(new Producto("Microondas", Arrays.asList("Tienda1", "Tienda2"), "En Reparacion"));
        catalogo.add(new Producto("Refrigerador", Arrays.asList("Tienda1", "Tienda3"), "Disponible"));
        catalogo.add(new Producto("Horno", Arrays.asList("Tienda2", "Tienda3"), "Defectuoso"));
        catalogo.add(new Producto("Teclado", Arrays.asList("Tienda3"), "Disponible"));
        catalogo.add(new Producto("Mouse", Arrays.asList("Tienda1", "Tienda2"), "En Reparacion"));
        catalogo.add(new Producto("Lámpara", Arrays.asList("Tienda2"), "Disponible"));
        catalogo.add(new Producto("Ventilador", Arrays.asList("Tienda1", "Tienda3"), "Defectuoso"));
        catalogo.add(new Producto("Consola", Arrays.asList("Tienda3"), "Disponible"));
        catalogo.add(new Producto("Control Remoto", Arrays.asList("Tienda1", "Tienda2", "Tienda3"), "En Reparacion"));
        catalogo.add(new Producto("Disco Duro", Arrays.asList("Tienda2"), "Defectuoso"));
        catalogo.add(new Producto("SSD", Arrays.asList("Tienda1"), "Disponible"));
        catalogo.add(new Producto("Tarjeta Gráfica", Arrays.asList("Tienda1", "Tienda3"), "En Reparacion"));
        catalogo.add(new Producto("Fuente de Poder", Arrays.asList("Tienda2", "Tienda3"), "Disponible"));
        catalogo.add(new Producto("Cargador", Arrays.asList("Tienda3"), "Defectuoso"));
        catalogo.add(new Producto("Proyector", Arrays.asList("Tienda1", "Tienda2"), "Disponible"));
        catalogo.add(new Producto("Switch", Arrays.asList("Tienda1", "Tienda3"), "En Reparacion"));
        catalogo.add(new Producto("Altavoz", Arrays.asList("Tienda2", "Tienda3"), "Disponible"));
        catalogo.add(new Producto("Webcam", Arrays.asList("Tienda3"), "Defectuoso"));
        catalogo.add(new Producto("Microfono", Arrays.asList("Tienda1", "Tienda2"), "En Reparacion"));
    }

    @Override
    public Iterador getDisponiblesIterador() {
        return new DisponiblesIterador(catalogo);
    }

    @Override
    public Iterador getFiltroTiendaIterador(String tienda){
        return new FiltroTiendaIterador(catalogo, tienda);
    }

    @Override
    public Iterador getEnReparacionIterador() {
        return new EnReparacionIterador(catalogo);
    }

    @Override
    public Iterador getDefectuososIterador() {
        return new DefectuososIterador(catalogo);
    }
    
}
