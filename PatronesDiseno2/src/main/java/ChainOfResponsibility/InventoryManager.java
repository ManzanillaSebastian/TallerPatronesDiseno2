/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility;

/**
 *
 * @author jarec
 */
public class InventoryManager extends  BaseHandler{
    
 @Override
    public void handleRequest(Request request) {
        System.out.println("Jefe de Inventario: Verificando disponibilidad en bodega...");
        boolean inStock = true; // Supongamos que está disponible
        if (inStock) {
            super.handleRequest(request);
        } else {
            System.out.println("El producto no esta disponible en bodega. No se puede procesar la solicitud.");
        }
    }
    
}
