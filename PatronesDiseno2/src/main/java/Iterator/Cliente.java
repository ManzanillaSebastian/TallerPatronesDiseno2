/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Iterator;
/**
 *
 * @author CltControl
 */
public class Cliente {

    public static void main(String[] args) {
        CatalogoIterable catalogo = new CatalogoProductos();
        Iterador iterador;
        
        //Cromprador Web
        System.out.println("Explorando los productos disponibles...");
        
        iterador = catalogo.getDisponiblesIterador();
        
        while(iterador.hasNext()) System.out.println(iterador.getNext());
        
        //Vendedor de "Tienda2"
        System.out.println("\nExplorando los productos en Tienda2...");
        
        iterador = catalogo.getFiltroTiendaIterador("Tienda2");
        
        while(iterador.hasNext()) System.out.println(iterador.getNext());
        
        //Proveedor
        System.out.println("\nExplorando los productos defectuosos...");
        
        iterador = catalogo.getDefectuososIterador();
        
        while(iterador.hasNext()) System.out.println(iterador.getNext());
        
        //Asistente de Mantenimiento
        System.out.println("\nExplorando los productos en reparacion...");
        
        iterador = catalogo.getEnReparacionIterador();
        
        while(iterador.hasNext()) System.out.println(iterador.getNext());
    }
}
